# Webots

**Paso 1:** en Webots, `File->New->New project directory`. En nuestro caso, hemos elegido de nombre `MundoTractor`. En el diálogo que aparece, hemos elegido como nombre del mundo `MiniMundo` y hemos activado la opción `Add a rectangle arena` 

**Paso 2:** Creamos un controlador para nuestro tractor `File->New->New Robot Controller` seleccionamos `Java` y el nombre de nuestro controlador sera `ControladorTractor`.

## Crear un proto Tractor:

**Objetivo:**  
Para añadir sensores (como GPS) a un prototipo (proto) de tractor, es necesario editar su archivo fuente.

**Pasos realizados:**

**1. Copia del archivo fuente:**  
Se copió el archivo fuente del tractor desde un ejemplo en Webots donde aparece la clase tractor (`C:\Program Files\Webots\projects\vehicles\worlds\boomer.wbt`)  y desde donde sacamos la pagina web del archivo fuente de la clase tractor `https://raw.githubusercontent.com/cyberbotics/webots/R2025a/projects/vehicles/protos/generic/Tractor.proto`. Este archivo lo pegamos a un archivo nuevo `.proto` en la carpeta `protos` de nuestro proyecto (`C:\Users\Antonio\Desktop\UPM\TFG\webots\MundoTractor\protos`). El nombre del archivo debe ser el mismo que protoname. En nuestro caso **TractorAutonomo**.

Una vez hecho esto modificaremos el archivo para adactarlo a nuestro contexto.

**2. Actualización de las rutas (EXTERNPROTO):**  
Se editaron las rutas de los directorios dentro del archivo, ya que por defecto apuntaban a las instalaciones de Webots. Se adaptaron estas rutas para que funcionen en el proyecto actual. Una solución fue descargar los recursos directamente desde el repositorio Git de Webots:

`EXTERNPROTO "https://raw.githubusercontent.com/cyberbotics/webots/released/projects/vehicles/protos/abstract/Car.proto" EXTERNPROTO "https://raw.githubusercontent.com/cyberbotics/webots/released/projects/appearances/protos/MattePaint.proto" EXTERNPROTO "https://raw.githubusercontent.com/cyberbotics/webots/released/projects/vehicles/protos/generic/TractorFrontWheel.proto" EXTERNPROTO "https://raw.githubusercontent.com/cyberbotics/webots/released/projects/vehicles/protos/generic/TractorRearWheel.proto"`

Antes del siguiente paso, adaptamos nuestro proto al contexto del proyecto:

- Descargar la siguiente imagen y colocarla en un nuevo directorio:
  
  - Imagen: [steering_wheel.png](https://raw.githubusercontent.com/cyberbotics/webots/released/projects/vehicles/protos/generic/textures/steering_wheel.png)
  
  - Directorio: `C:/Users/Antonio/Desktop/UPM/TFG/webots/MundoTractor/protos/textures/steering_wheel.png`

- Añadir el `EXTERNPROTO` de nuestro tractor al mundo `EvitrObstaculos.wbt`:

        `EXTERNPROTO "../protos/tractorAutonomo.proto"`

**3. Edición del contenido:**  
Una vez solucionado el problema de las rutas, se modificó el archivo para integrar los nuevos sensores y dispositivos necesarios.

El archivo proto indica que hay un campo en el que todo lo que se añada se insertará en el tractor:

`# ******************* # field MFNode sensorSlot [ ]  # Extends the robot with new nodes at the center of the vehicle. # *******************`

Esto significa que todo lo que se agregue dentro de ese slot se colocará en la posición central del vehículo, pudiendo añadir sensores, GPS, etc., sin modificar la estructura del tractor.

## Editar el proto Tractor desde Webots

Desde Webots hay que editar algunos parámetros del Tractor para adaptarlo al mundo.

- **Translation:** `(-,-,0.609)`. Hay que elevar el tractor 0.609 m para que el tractor esté por encima del suelo, y las ruedas traseras del tractor estén a ras del suelo.

- **Rotation:** Axis-Angle `(0,1,0,0.13)`. Ponemos una inclinación hacia delante al tractor para compensar que la rueda trasera es más grande que la delantera.

- **Color:** `(#20730D)` Le pongo un color verde para que se parezca a un John Deere.

- Dentro de **sensorSlot** se añaden varios tipos de sensores:
  
  - RangeFinder: se encarga de medir la distancia hacia un objeto para poder evitar colisiones.
  
  - InertialUnit: con este sensor obtienes el rumbo que tiene el tractor, es decir, la orientación del tractor en radianes.
  
  - GPS: obtienes la posición exacta del tractor en el eje (x,y,z).
  
  - Pen: sensor para dibujar en el suelo de Webots.

### Sensor RangeFinder

Configuración del sensor:

- **Translation**: `(2.36, 0, 0.45)`, lo pongo justo en la parte frontal del tractor.

- **Rotation**: Axis-Angle `(0,1,0,-0.13)`, corrijo la inclinación del tractor para que el sensor apunte paralelo al suelo.

- **Shape (children)**: size `(0.01, 0.05, 0.07)`

- **FieldOfView**: `(0.35)` ángulo de visión horizontal del sensor en radianes, es decir, el cono de visión; cuanto más ancho, mayor cono de visión tienes.

- **Height**: **height=1**, número de **píxeles verticales** de la “imagen de profundidad” que devuelve el sensor.
  
  - `height = 1` → línea horizontal de detección, como un Lidar de un solo rayo.
  
  - `height > 1` → devuelve varios píxeles verticales, útil si quieres detectar objetos más altos o bajos.

- **Near**: `near = 0.1`, distancia mínima de **renderizado** en la “imagen de profundidad” de Webots RangeFinder. Solo afecta al **aspecto visual** si el sensor se usa como cámara de profundidad. No afecta directamente la distancia que devuelve para detección.

- **minRange**: distancia mínima que el sensor devuelve como medida válida.

- **maxRange**: distancia máxima que el sensor puede medir. Objetos más allá de este valor no se detectan y se consideran “fuera de rango”.

### InertialUnit

Se deja igual, solo cambiamos el nombre.

### GPS

Cambiamos el campo **translation** a `(1.6, 0, 0.79)`, cambiamos la posición para dejarlo más cerca del eje delantero del tractor.

### Pen

- **Translation:** `(-0.36, 0, -0.16)`

- **Shape** children: 
  
  ```json
          DEF LAPIZ_FORMA Shape {
            appearance PBRAppearance {
              baseColor 1 0.666667 0
              roughness 1
              metalness 0
            }
            geometry Cylinder {
              height 1
              radius 0.05
            }
          }
  ```

- **inkDensity**: `inkDensity=1`, es la densidad de tinta, controla qué tan intensa será la marca que deja sobre el suelo.
  
  - 1 → máxima opacidad; 0 → no dibuja nada.

- **leadSize**: **`leadSize 0.02`** → tamaño de la punta del lápiz en metros. Determina el grosor de la línea pintada

## Proto Suelo

Vamos a crear un proto de un suelo realista que simule un terreno adecuado para labrar. De esta forma, conseguiremos que el suelo se pueda aplicar a cualquier mundo en Webots.

- **textureURL:** es una URL de donde se obtiene la textura, el color y las características visuales de nuestro suelo. En nuestro caso, lo sacamos del repositorio de Webots, cuya dirección es: `https://raw.githubusercontent.com/cyberbotics/webots/R2025a/projects/default/worlds/textures/dry_grass.jpg`.

- **locked:** `locked=true`. Si lo ponemos en true, indica que el sólido, en este caso el suelo, no se puede mover ni modificar con física; el suelo es estático, por eso se bloquea.

- **shape:** dentro de la forma del suelo, destacable que el campo `castShadows` es `False`, para evitar que el suelo genere sombras.

## WorldInfo nodo principal

Define **información global** y parámetros físicos del mundo. Algunos de sus campos afectan a la simulación completa, no a un robot en particular.

- **ERP**: `(ERP = 0.7)`, **Error Reduction Parameter (ERP)**, Es un parámetro de la **simulación de física** que controla **qué tanto se corrigen los errores de penetración** entre cuerpos rígidos (objetos, robots, ruedas, paredes) durante la simulación.
  
  - Cada paso de simulación puede permitir **pequeñas penetraciones** entre objetos porque la simulación es discreta.
  
  - Si no se corrigen, los objetos pueden atravesarse o comportarse de forma poco realista.
  
  - ERP determina **qué fracción de ese error se corrige en cada paso**.

- **contactProperties**: Define cómo se comportan los contactos y colisiones globales.
  
  ```json
      contactProperties [
      ContactProperties {
        softCFM 0.0001
      }
    ]
  ```
  
  - **`softCFM`**, `(softCFM = 0.0001)`, *Constraint Force Mixing*, controla **la “suavidad” de las restricciones físicas** entre cuerpos que colisionan o están unidos por juntas
    
    Con un **softCFM muy pequeño** (p.ej., `0.00001`):
    
    - Contacto muy rígido → los cuerpos “rebotan” menos, penetración mínima.
    
    - Puede hacer la simulación **más inestable** si el timestep es grande o la velocidad alta.
    
    - Las ruedas pueden rebotar o atravesar superficies al frenar rápido.
    
    Con un **softCFM mayor** (p.ej., `0.001` – `0.01`):
    
    - Contacto más suave → los cuerpos se “comprimen” un poco al chocar.
    
    - La simulación es más estable, pero puede verse que objetos se hunden ligeramente.
    
    - Las ruedas “resbalan” un poco porque el contacto es más blando.

# vsCode

1º Abrimos la carpeta del controler ` \MundoTractor\controllers\ControladorTractor` una vez abierta lo primero que aremos seran añadir los jar (controller.jar, vehicle.jar, antlr-4.13.2-complete.jar).

Em vsCode JavaProject -> ControladorTractor -> Referenced Libreries

---

Vamos a generar un codigo básico usando solo la libreria controller tratando a nuestro robot como si fuera un robot. 

Para compilar:

```powershell
javac -cp "C:\Program Files\Webots\lib\controller\java\Controller.jar;C:\Program Files\Webots\lib\controller\java\vehicle.jar;." *.java 
```

**Controladores:**  
En VSCode, dentro de la carpeta `Controller`, se crean los controladores que permiten que el robot se mueva.

- **TractorAutonomo.java:** contiene todos los métodos necesarios para el funcionamiento del robot, como girar, avanzar, etc., e inicializa todos los sensores. Esta clase utiliza la clase `Apoyo` para centralizar métodos que se repiten, reduciendo código redundante y manteniendo la clase más organizada.

- **ControladorTractor.java:** clase principal donde se instancia un objeto de `TractorAutonomo`, lo que permite acceder a los métodos como `avanzar`.

- **Apoyo.java:** Contiene todos los metodos que se utilizan varias veces dentro de la clase `TractorAutonomo` y que se pueden llevar a una clase externa.

La compilación se realiza incluyendo las librerías `controller.jar` y `vehicle.jar`:

# Desde el terminal

Para ejecutar **Webots desde la terminal** en Windows, es recomendable **añadir al PATH** la ruta:

`C:\Program Files\Webots\msys64\mingw64\bin`

Así se puede lanzar `webots` directamente sin escribir la ruta completa al ejecutable.  
Si no se añade al PATH, hay que usar la ruta completa a `webots.exe`.

---

### Opciones importantes de ejecución

- `--stdout`: redirige la salida estándar de los controladores.

- `--stderr`: redirige la salida de errores.

- `--minimize`: inicia Webots minimizado y sin pantalla de bienvenida (ideal para scripts).

**Comando típico recomendado (con PATH configurado):**

`webots --minimize --stdout --stderr <mundo.wbt>`

---

### Formas de lanzar Webots y sus efectos

#### 1️⃣ Ejecución directa

`webots --minimize --stdout --stderr <mundo.wbt>`

- ❌ El terminal queda bloqueado

- ✅ Se ve `stdout` y `stderr`

- 🔁 El control vuelve al cerrar Webots

---

#### 2️⃣ Usando `start`

`start "" webots --minimize --stdout --stderr <mundo.wbt>`

- ✅ El terminal queda libre

- ✅ Webots corre en otro proceso

- ⚠️ La salida no se maneja bien en consola (mejor redirigir a archivo)

---

#### 3️⃣ Usando `webotsw`

`webotsw --minimize <mundo.wbt>`

- ✅ El terminal queda libre inmediatamente

- ❌ No muestra salida en consola

- ✔️ Ideal para ejecución silenciosa o automática

---

#### 4️⃣ Usando `start /B` (opción recomendada)

Abre un proceso hijo en ese terminal y es lo que realmente se ejecuta:

`start "" /B webots --minimize --stdout --stderr <mundo.wbt> > log.txt 2>&1`

- ✅ El terminal sigue usable

- ✅ `stdout` y `stderr` funcionan correctamente

- ⚠️ Si se cierra el `cmd`, Webots puede cerrarse

- ✔️ Buen equilibrio entre control y automatización`

# Integración Webots + VS Code (ExternalController)

 # Integración Webots + VS Code (External Controller)

Para que el lenguaje PLATA pueda controlar el tractor simulado en Webots, se utiliza un **controlador externo**. Esto permite que el programa Java (ejecutado desde VS Code o terminal) se comunique en tiempo real con la simulación.

## Configuración en Webots

Para habilitar esta comunicación, es necesario configurar el robot dentro de Webots:

- El nodo del robot debe tener el controlador configurado como:
  
  controller "<extern>"

- Esto indica que Webots **no ejecutará un controlador interno**, sino que esperará una conexión desde un programa externo.

---

## Ejecución del controlador externo

El funcionamiento correcto requiere seguir este orden:

### 1. Abrir Webots

- Cargar el mundo (`.wbt`) que contiene el tractor.
- Asegurarse de que el robot está configurado con `controller "<extern>"`.

### 2. Iniciar la simulación

- Pulsar el botón **Play (▶)** en Webots.
- En este momento, Webots queda **a la espera de conexión externa**.

⚠️ IMPORTANTE:  
Si no se inicia la simulación, el controlador externo **no podrá conectarse**.
