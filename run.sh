#!/bin/bash

set -e

params=''

while getopts ":dbr" o; do
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
  *) ;;
  esac
done

shift $((OPTIND - 1))

clear
if [ -n "$build" ]; then
  mvn clean install
fi
if [ -n "$run" ]; then
  mvn -e exec:java -Dexec.mainClass="com.example.HelloWorldExample"
fi
