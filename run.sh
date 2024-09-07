#!/bin/bash

set -e

function help {
  echo "Uso: $0 [-d] [-b] [-r] [-p]"
  echo '  -d: debug mode'
  echo '  -b: constói aplicação'
  echo '  -r: executa aplicação'
  echo '  -p: compila proto'
  exit 1
}

protoOut='./src/main/java/'
params=''

while getopts ":dbrp" o; do
  case "$o" in
  d)
    debug=1
    params="$params -e"
    ;;
  b)
    build=1
    ;;
  r)
    run=1
    ;;
  p)
    proto=1
    ;;
  *)
    echo "comando não reconhecido $OPTARG"
    help
    ;;
  esac
done
shift $((OPTIND - 1))

test -z "$proto" && test -z "$build" && test -z "$run" && help

clear
if [ -n "$proto" ]; then
  echo 'Compilando proto...'
  protoc --java_out="$protoOut" protos/comment.proto
fi

if [ -n "$build" ]; then
  mvn clean install
fi

if [ -n "$run" ]; then
  mvn $params exec:java -Dexec.mainClass='com.example.DroolsExample'
fi
