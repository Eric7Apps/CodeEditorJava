
rem @echo off

rem Compile Java files.

SET JAVA_HOME="C:\Javajdk"
SET JDK_HOME=%JAVA_HOME%
SET JRE_HOME="C:\JavaJre"

rem SET CLASSPATH=".;%JAVA_HOME%\lib;%JAVA_HOME%\jre\lib

SET CLASSPATH=C:\Javajdk\lib;C:\Javajdk\jre\lib;
SET PATH=%PATH%;%JAVA_HOME%\bin;


rem Javac -encoding UTF-8 HelloWorldApp.java
rem Javac *.java

rem The directory tree where these files are
rem corresponds to their Jar package tree.

rem Compile all of them.
del *.class

cls

Javac -Xlint -Xstdout JavaBuild.log MainApp.java

type JavaBuild.log

pause
