@echo off

:: Change the following to match your paths
set CLOJURE_DIR=%CLOJURE_HOME%
set CLOJURE_JAR=%CLOJURE_DIR%\clojure.jar
set CONTRIB_JAR=%CLOJURE_DIR%\clojure-contrib-1.2.0.jar
set JLINE_JAR=%CLOJURE_DIR%\jline-0_9_5.jar
set ANT_JARS=%CLOJURE_DIR%\ant-1.6.5.jar;%CLOJURE_DIR%\ant-launcher-1.6.5.jar

if (%1) == () (
	:: Start REPL
	java -cp .;%JLINE_JAR%;%CLOJURE_JAR%;%CONTRIB_JAR%;%ANT_JARS% jline.ConsoleRunner clojure.main
) else (
	:: Start some_script.clj
	java -cp .;%CLOJURE_JAR%;%CONTRIB_JAR%;%ANT_JARS% clojure.main %1 -- %*
)