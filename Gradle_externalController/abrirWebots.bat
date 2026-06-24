@echo off
chcp 65001 >NUL
setlocal EnableExtensions

if not defined WEBOTS_HOME (
    set "WEBOTS_HOME=C:\Program Files\Webots"
)

set "WEBOTS_BIN=%WEBOTS_HOME%\msys64\mingw64\bin"
set "WEBOTS_EXE=%WEBOTS_BIN%\webots.exe"
set "WORLD_FILE=C:\Users\Antonio\Desktop\UPM\TFG\Proyecto_Plata_completo\MundoTractor\worlds\Ensayo4.wbt"

if not exist "%WEBOTS_EXE%" (
    echo ERROR: No se encontro Webots en:
    echo "%WEBOTS_EXE%"
    pause
    endlocal
    exit /b 1
)

if not exist "%WORLD_FILE%" (
    echo ERROR: No se encontro el mundo:
    echo "%WORLD_FILE%"
    pause
    endlocal
    exit /b 1
)

cd /d "%WEBOTS_BIN%"

"%WEBOTS_EXE%" --mode=fast --fullscreen "%WORLD_FILE%"

endlocal