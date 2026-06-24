@echo off
chcp 65001 >NUL
setlocal EnableExtensions

REM Ir a la carpeta donde está este .bat
cd /d "%~dp0"

REM Forzar UTF-8 en la JVM de Gradle sin generar el mensaje "Picked up JAVA_TOOL_OPTIONS"
set "GRADLE_OPTS=-Dfile.encoding=UTF-8"

REM Si hay argumento, pasarlo a Gradle
if "%~1"=="" (
    call gradlew.bat --console=plain --quiet :app:runWebots
) else (
    call gradlew.bat --console=plain --quiet :app:runWebots -PplataArgs="%~f1"
)

endlocal