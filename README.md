Llanquihue Tour

Proyecto académico – Desarrollo Orientado a Objetos I
1. Descripción del proyecto

Llanquihue Tour es un proyecto desarrollado en Java que representa el modelo básico de una agencia de turismo ubicada en la Región de Los Lagos, Chile.

El objetivo es organizar y representar información de las personas relacionadas con la agencia, utilizando los principios fundamentales de la Programación Orientada a Objetos (POO).

El proyecto permite representar personas, empleados y sus respectivas direcciones, aplicando relaciones entre clases, encapsulamiento, herencia, composición y manejo de excepciones.
2. Objetivos del proyecto

   Aplicar los conceptos fundamentales de Programación Orientada a Objetos.

   Implementar clases con atributos privados y métodos de acceso.

   Utilizar constructores para inicializar objetos.

   Aplicar herencia mediante una clase base y una clase derivada.

   Implementar composición entre objetos.

   Incorporar validaciones para los datos personales.

   Utilizar excepciones para controlar situaciones de error.


3. Tecnologías utilizadas

   Lenguaje: Java.

   Gestor de proyectos: Apache Maven.

   Entorno de desarrollo: IntelliJ IDEA.

   Control de versiones: Git.

   Repositorio remoto: GitHub.


4. Estructura del proyecto

El proyecto está organizado mediante los siguientes paquetes y clases:

Paquete app

    Main.java: contiene el método principal del programa. Se encarga de crear las instancias de las clases, realizar las pruebas de funcionamiento y mostrar la información mediante consola.

Paquete model

    Persona.java: clase base que representa a una persona mediante sus atributos nombre, RUT y dirección. Incluye constructores, getters, setters, validaciones y sobrescritura del método toString().

    Empleado.java: clase derivada de Persona que utiliza herencia para incorporar el atributo adicional cargo. Implementa su propio constructor y sobrescribe el método toString().

    Direccion.java: clase que representa la dirección de una persona, almacenando calle, ciudad y región.

5. Conceptos de Programación Orientada a Objetos aplicados
   Encapsulamiento

Los atributos de las clases se encuentran declarados como private, permitiendo controlar el acceso y la modificación de los datos mediante métodos getters y setters.
Herencia

La clase Empleado hereda de la clase Persona mediante la palabra reservada extends, reutilizando sus atributos y métodos.
Composición

La clase Persona contiene un objeto de tipo Direccion como atributo, estableciendo una relación de composición entre ambas clases.
Constructores

Se utilizan constructores para inicializar los atributos de los objetos al momento de su creación.
Sobrescritura de métodos

Se implementa toString() mediante @Override para representar la información de los objetos de forma legible.
Manejo de excepciones y validaciones

Se incorporan validaciones para evitar nombres vacíos, comprobar el formato del RUT y controlar la duplicidad de RUT mediante ArrayList.

Se utilizan throw, try-catch y finally para manejar situaciones de error durante las pruebas de registro.
6. Requisitos para ejecutar el proyecto

Para ejecutar el proyecto se necesita:

    Tener instalado Java JDK.

    Tener instalado IntelliJ IDEA.

    Contar con acceso a los archivos del proyecto.

    Tener Maven disponible mediante IntelliJ IDEA.

7. Instalación y ejecución

   Clonar el repositorio desde GitHub:

git clone https://github.com/kevinchacon-dev/Llanquihue-Tour-Evaluacion-DOO-sem-3-.git

    Abrir IntelliJ IDEA.

    Seleccionar Open y buscar la carpeta del proyecto descargado.

    Abrir el archivo pom.xml y esperar a que Maven configure el proyecto.

    Navegar hasta src/main/java/app/Main.java.

    Ejecutar el método main() para iniciar el programa.

8. Autor

Kevin Chacon

Proyecto académico desarrollado para la asignatura Desarrollo Orientado a Objetos I.
9. Repositorio

GitHub: Llanquihue Tour – Evaluación DOO