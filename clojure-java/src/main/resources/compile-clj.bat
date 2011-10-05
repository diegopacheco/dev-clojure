@echo off

set CLOJURE_DIR=%CLOJURE_HOME%
set CLOJURE_JAR=%CLOJURE_DIR%\clojure.jar
set CONTRIB_JAR=%CLOJURE_DIR%\clojure-contrib-1.2.0.jar

java -cp .;%CLOJURE_JAR%;%CONTRIB_JAR% -Dclojure.compile.path=. clojure.lang.Compile %1

jar -cf clojure.java.jar user\*.class

del user\*.class