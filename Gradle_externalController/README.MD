# 🚜 Proyecto PLATA – Intérprete con ANTLR4 y Webots

## 📌 Descripción general

Este proyecto implementa un **lenguaje de programación propio (PLATA)** orientado al control de un tractor autónomo.

El sistema completo incluye:

* Definición del lenguaje mediante **ANTLR4**
* Un **intérprete en Java** capaz de ejecutar instrucciones del lenguaje
* Integración con **Webots** mediante un controlador externo para simular el comportamiento del tractor

El objetivo principal es permitir escribir programas en PLATA que se ejecuten:

* 📟 Desde consola (modo interactivo o fichero)
* 🤖 En simulación Webots (control real del robot)

---

## 🧱 Estructura del proyecto

El proyecto está organizado como un proyecto Gradle con el módulo principal `app`:

```
app/
 ├── src/main/antlr        → Gramática PLATA (.g4)
 ├── src/main/diagramas    → Diagramas del proyecto (clase, secuencia, etc.)
 ├── src/main/java
 │    ├── interpretes      → Intérpretes (Consola / Webots)
 │    ├── plata            → Lógica del lenguaje (visitor, valores, etc.)
 │    ├── webots           → Integración con Webots
 │    └── consola          → API de ejecución en consola
 ├── src/main/resources    → Archivos de entrada (.arg)
 └── build/                → Generado por Gradle
```

---

## ⚙️ Tecnologías utilizadas

* Java 21
* Gradle
* ANTLR4
* Webots (controlador externo)

---

## 🚀 Compilación

No necesitas compilar manualmente con `javac`. Gradle se encarga de todo:

```bash
gradlew :app:build
```

O usando el script:

```bat
Compile.bat
```

Esto genera:

* Clases Java
* Parser ANTLR
* Artefactos del proyecto

---

## ▶️ Ejecución

### 🟢 Modo consola

Ejecuta el intérprete en consola:

```bat
RunConsola.bat
```

Con fichero:

```bat
RunConsola.bat <ruta\fichero.arg>
```

Comportamiento:

* Sin argumento → entrada interactiva (terminal)
* Con argumento → ejecuta fichero `.arg`

---

### 🔵 Modo Webots

Ejecuta el intérprete conectado a Webots:

```bat
RunWebots.bat
```

Con fichero:

```bat
RunWebots.bat <ruta\fichero.arg>
```

⚠️ Requisitos:

* Webots debe estar abierto
* El controlador debe estar configurado como **externo**

---

## ⚡ Uso directo con Gradle

También puedes ejecutar sin `.bat`:

```bash
gradlew :app:runConsola
gradlew :app:runConsola -PplataArgs="ruta\archivo.arg"

gradlew :app:runWebots
gradlew :app:runWebots -PplataArgs="ruta\archivo.arg"
```

---

## 🧠 Funcionamiento del sistema

1. Se lee el programa PLATA (desde fichero o consola)

2. Se genera el árbol sintáctico del fichero de entrada

3. Se recorre mediante un **Visitor**

4. El intérprete ejecuta las instrucciones:
   
   * En consola → salida estándar
   * En Webots → acciones sobre el robot

---

## 🔧 Configuración de Webots

Si no tienes definida la variable:

```bash
WEBOTS_HOME
```

El sistema usará por defecto:

```
C:\Program Files\Webots
```

Puedes cambiarla en:

* Variables de entorno de Windows
* O directamente en `build.gradle`

---

## 🧪 Ensayos

Ruta de los ensayos:

```bash
"TFG_PLATA\Gradle_externalController\app\src\main\resources\input"
```

---

## 📌 Notas importantes

* Las dependencias de Webots se cargan como `compileOnly`
* El classpath se gestiona automáticamente en las tareas `run`

---

## 👨‍💻 Autor: Antonio Luis Gordillo Bonilla

Proyecto desarrollado como parte de un TFG enfocado en:

* Lenguajes de programación
* Sistemas de control autónomo
* Simulación robótica
