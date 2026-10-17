# Gestor de tareas

## Integrantes
* Gael Andrés Torres González
* Maria Camila Montesinos Romero




## Descripción
Aplicación Java de consola diseñada para administrar tareas personales. Permite registrar nuevas tareas, listar las existentes y marcarlas como completadas.

## Requisitos
* Tener instalado Java JDK.
* Tener Git instalado.
* IntelliJ IDEA (recomendado).

## Instalación y ejecución
1. Clonar este repositorio usando Git o desde IntelliJ IDEA.
2. Abrir el proyecto en IntelliJ y esperar a que Gradle sincronice las dependencias.
3. Ejecutar la clase principal `Main.java` (o la clase que contenga el método main).


## Estructura del proyecto
El proyecto sigue la estructura estándar de Gradle para aplicaciones Java, con el código fuente ubicado dentro de la ruta `src/main/java/`.

## Flujo de colaboración
Se utilizó el flujo de trabajo por ramas. Ningún integrante programó directamente en `main`. Cada funcionalidad se desarrolló en una rama separada (`feature/...`) y se integró a `main` a través de un Pull Request revisado por otro miembro del equipo.

## Pruebas
Se realizaron pruebas manuales ejecutando la aplicación de consola. Se verificó que:
1. Se pueden registrar al menos tres tareas correctamente.
2. La lista muestra todas las tareas guardadas.
3. Al elegir completar una tarea, su estado cambia correctamente.
4. El programa no se cierra con un error si el usuario elige una opción inválida en el menú.

## Resolución de conflicto
Se generó un conflicto provocado cuando dos integrantes del equipo modificaron la misma línea de este archivo `README.md` en ramas diferentes al mismo tiempo.
* **Resolución:** Al intentar hacer el *merge*, IntelliJ marcó el conflicto. Se utilizó la herramienta de resolución de conflictos del IDE (Merge Conflicts) para revisar los cambios y se decidió combinar ambas líneas para conservar la información de los dos integrantes.

---

## Preguntas de reflexión

**1. ¿Qué diferencia existe entre Git y GitHub?**
Git es el programa que instalamos en la computadora para llevar el control de versiones localmente. GitHub es la página web (la plataforma en la nube) donde subimos y compartimos esos repositorios para trabajar en equipo.

**2. ¿Por qué conviene revisar git diff antes de hacer commit?**
Para estar seguros de que solo estamos guardando los cambios que realmente queremos subir y evitar mandar código con errores, pruebas a medias o archivos basura por accidente.

**3. ¿Cuál es la diferencia entre commit y push?**
El `commit` guarda los cambios localmente en tu propia computadora. El `push` es el que realmente manda esos cambios guardados al servidor de GitHub para que los demás los vean.

**4. ¿Qué función tiene .gitignore y qué limitación presenta?**
Sirve para decirle a Git qué archivos o carpetas debe ignorar y no subir a GitHub (como archivos compilados o contraseñas). Su principal limitación es que, si un archivo ya se había subido antes de agregarlo al .gitignore, Git lo seguirá rastreando hasta que lo borremos de la caché manualmente.

**5. ¿Por qué se versiona el Gradle Wrapper?**
Para asegurar que cualquier persona que descargue el proyecto use exactamente la misma versión de Gradle que nosotros usamos para crearlo, sin necesidad de que lo instalen por su cuenta.

**6. ¿Cómo ayuda el README a que otra persona reproduzca el proyecto?**
Sirve como un manual rápido que explica de qué trata el código, qué programas se necesitan y da las instrucciones paso a paso para poder correrlo sin adivinar.

**7. ¿Qué aportan las ramas y los pull requests al control de calidad?**
Las ramas permiten probar cosas nuevas sin echar a perder el código principal (`main`). Los pull requests ayudan a que otro compañero revise tu código antes de juntarlo, lo que ayuda a atrapar errores antes de que afecten el proyecto final.

**8. ¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios?**
Se resolvió usando la herramienta de conflictos de IntelliJ, eligiendo qué cambios conservar de cada rama. Para evitarlos en el futuro, el equipo debe tener mejor comunicación para no editar los mismos archivos al mismo tiempo y hacer `pull` frecuentemente para tener la versión más actualizada.