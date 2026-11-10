# Kata 1: Familiarización con IntelliJ IDEA y flujo básico de trabajo

Escuela de Ingeniería Informática — Universidad de Las Palmas de Gran Canaria  
Asignatura: Ingeniería de Software 2  

## 1. Objetivo de la entrega

El objetivo de esta práctica es automatizar el uso cotidiano del entorno de desarrollo IntelliJ IDEA y el flujo de trabajo con Git y GitHub antes del crecimiento de la base de código. 

A través de un microproyecto en Java, la práctica busca reducir la fricción técnica al crear, ejecutar, navegar, depurar y refactorizar código, así como consolidar la disciplina de trabajo en ramas (`main` y `develop`), realización de commits pequeños y verificación de la compilación fuera del entorno original.

## 2. Dependencias y versión de JDK

* **JDK:** Java 25 (OpenJDK 25)
* **Gestor de dependencias:** Maven
* **Librerías externas:** Ninguna. Se utiliza exclusivamente el JDK estándar (Core Java).

## 3. Estructura de la entrega y clases principales

El proyecto respeta la convención de paquetes bajo el dominio `software.ulpgc` y separa la lógica de dominio de la orquestación principal:


## 5. Shortcuts de IntelliJ IDEA utilizados

Durante el desarrollo y las repeticiones se han practicado y utilizado los siguientes atajos de teclado para agilizar las acciones dentro del IDE:

| Acción | Shortcut (Windows/Linux) |
| :--- | :--- |
| **Ejecutar Main** | `Shift + F10` |
| **Depurar (Debug)** | `Shift + F9` |
| **Refactorizar / Renombrar** | `Shift + F6` |
| **Formatear código** | `Ctrl + Alt + L` |
| **Navegar a clase** | `Ctrl + N` |
| **Búsqueda en todo el proyecto** | `Shift` (doble pulsación) |
| **Autocompletado inteligente** | `Ctrl + Space` |
| **Generar código (Getters/Constructor)** | `Alt + Insert` |

## 6. Flujo Git y GitHub

El desarrollo se ha estructurado siguiendo el modelo de ramificación con rama principal y rama de desarrollo:

1. **Estructura de ramas:**
   * `main`: Contiene la versión estable, limpia y evaluable del proyecto.
   * `develop`: Rama de trabajo diario donde se han realizado los avances y commits progresivos.

## 7. Repetición deliberada y variaciones

Siguiendo la dinámica de aprendizaje por repetición orientada a automatizar acciones en el IDE:

* **Repetición 1 (Base):** Creación inicial del microproyecto con la clase `Person` y cálculo de edad básica. Se identificaron los accesos directos principales para compilación y ejecución.
* **Repetición 2 (Flujo Git y Depuración):** Reconstrucción del proyecto en la rama `develop` practicando el uso de breakpoints en el constructor y en el método de cálculo derivado.
* **Repetición 3 (Refactorización y Variación):** Tercera ejecución completa introduciendo una pequeña variación en la entidad (cálculo de identificador formateado o estado derivado) y aplicando refactorización segura con `Shift + F6` para el renombrado de atributos y métodos en lugar de reemplazo manual.

## 8. Evidencias de verificación y pruebas realizadas

Se han ejecutado las siguientes comprobaciones manuales para validar el correcto funcionamiento:

1. **Ejecución de Main:** Confirmación de la salida por consola con los datos formateados de la entidad y el cálculo derivado.
2. **Uso del Depurador (Debugger):**
   * Breakpoint en el constructor de `Person`: Verificación de la asignación correcta de parámetros en la pila de llamadas (*Frames*).
   * Breakpoint en el método de cálculo derivado: Inspección del estado interno del objeto y evaluación de expresiones en tiempo de ejecución.
3. **Refactorización:** Renombrado automático del método de cálculo mediante `Shift + F6`, verificando la actualización automática de las referencias en `Main.java`.
4. **Verificación de entorno limpio:** Confirmación de que el archivo `.gitignore` evita la subida de carpetas temporales (`target/`, `.idea/`, `*.iml`, `out/`).
5. **Verificación remota:** Clonado y ejecución exitosa desde un directorio alternativo.

## 9. Vídeo explicativo

Enlace al vídeo explicativo (Duración máxima: 7 minutos):  
https://drive.google.com/file/d/14i3K9mdTClHPBCmCvWtE4PiKP-V2MeEj/view?usp=drive_link
