@echo off
chcp 65001 >NUL
setlocal EnableExtensions

cd /d "%~dp0"
if errorlevel 1 (
    echo.
    echo [ERROR] No se pudo acceder a la raiz del proyecto.
    endlocal
    exit /b 1
)

if not exist gradlew.bat (
    echo.
    echo [ERROR] No se encontro gradlew.bat en:
    echo "%CD%"
    endlocal
    exit /b 2
)

if not exist app\build.gradle (
    echo.
    echo [ERROR] No se encontro app\build.gradle en:
    echo "%CD%"
    endlocal
    exit /b 3
)

echo.
echo ============================================================
echo Compilando proyecto con Gradle...
echo ============================================================
echo.

call gradlew.bat :app:clean :app:build :app:installDist
if errorlevel 1 (
    echo.
    echo [ERROR] Fallo en la compilacion del proyecto.
    endlocal
    exit /b 4
)

echo.
echo [OK] Compilacion completada correctamente.
echo.
echo Se han generado, entre otros:
echo - Clases: app\build\classes\java\main
echo - Parser ANTLR: app\build\generated-src\antlr\main
echo - JAR: app\build\libs\app.jar
echo - Distribucion: app\build\install\app
echo.

endlocal