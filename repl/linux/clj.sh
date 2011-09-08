#!/bin/bash

CLOJURE_DIR=/home/jackson/app/clojure-1.2.1
CLOJURE_JAR=$CLOJURE_DIR/clojure.jar
CONTRIB_JAR=$CLOJURE_DIR/clojure-contrib-1.2.0.jar
JLINE_JAR=$CLOJURE_DIR/jline-1.0.jar

if [ "$1" == "" ]; then
 java -cp .:$JLINE_JAR:$CLOJURE_JAR:$CONTRIB_JAR jline.ConsoleRunner clojure.main
else
 java -cp .:$CLOJURE_JAR:$CONTRIB_JAR clojure.main "$1"
fi
