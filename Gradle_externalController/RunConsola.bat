@echo off
chcp 65001 >NUL
setlocal EnableExtensions

cd /d "%~dp0"

set "GRADLE_OPTS=-Dfile.encoding=UTF-8"

if "%~1"=="" (
    call gradlew.bat --console=plain --quiet :app:runConsola
) else (
    call gradlew.bat --console=plain --quiet :app:runConsola -PplataArgs="%~f1"
)

endlocal