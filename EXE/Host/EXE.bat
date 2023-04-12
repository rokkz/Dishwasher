echo off

set RHAP_JARS_DIR=C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\oxf.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\anim.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\animcom.jar;C:/Program Files/IBM/Rhapsody/9.0.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist telelogic\dishwasher\DishwasherBuilder.class del telelogic\dishwasher\DishwasherBuilder.class
if exist telelogic\dishwasher\Heater.class del telelogic\dishwasher\Heater.class
if exist telelogic\dishwasher\class_10.class del telelogic\dishwasher\class_10.class
if exist telelogic\dishwasher\evOpen.class del telelogic\dishwasher\evOpen.class
if exist telelogic\dishwasher\KeyReader.class del telelogic\dishwasher\KeyReader.class
if exist telelogic\dishwasher\evKeyPress.class del telelogic\dishwasher\evKeyPress.class
if exist Default\actor_9.class del Default\actor_9.class
if exist telelogic\dishwasher\Jet.class del telelogic\dishwasher\Jet.class
if exist telelogic\dishwasher\SERVICEMAN.class del telelogic\dishwasher\SERVICEMAN.class
if exist MainEXE.class del MainEXE.class
if exist telelogic\dishwasher\USER.class del telelogic\dishwasher\USER.class
if exist telelogic\dishwasher\evStart.class del telelogic\dishwasher\evStart.class
if exist telelogic\dishwasher\evClose.class del telelogic\dishwasher\evClose.class
if exist telelogic\dishwasher\Dishwasher.class del telelogic\dishwasher\Dishwasher.class
if exist telelogic\dishwasher\Display.class del telelogic\dishwasher\Display.class
if exist telelogic\dishwasher\dishwasher_pkgClass.class del telelogic\dishwasher\dishwasher_pkgClass.class
if exist telelogic\dishwasher\object_0.class del telelogic\dishwasher\object_0.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


