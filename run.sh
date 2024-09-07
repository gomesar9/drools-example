#!/bin/bash

set -e

params=''

while getopts ":dbrp" o; do
  case "$o" in
  d)
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
  *) ;;
  esac
done

shift $((OPTIND - 1))

clear
if [ -n "$proto" ]; then
  protoc --java_out=./src/main/java/ protos/comment.proto
fi
if [ -n "$build" ]; then
  mvn clean install
fi
if [ -n "$run" ]; then
  mvn -e exec:java -Dexec.mainClass="com.example.DroolsExample"
fi
