🧠 Actividad Sumativa 1: Realizando validación, excepciones y relaciones entre clases

👤 Autor del proyecto

Nombre completo: Kevin Chacon

Sección: 204

Carrera: Analista Programador

📘 Descripción general del sistema

Este proyecto corresponde a la Actividad Sumativa 1 de la asignatura Desarrollo Orientado a Objetos I.

El sistema desarrollado se denomina Llanquihue Tour y representa una aplicación básica para gestionar información de personas y empleados de una empresa dedicada al turismo en la Región de Los Lagos.

El proyecto fue desarrollado en Java utilizando IntelliJ IDEA y Maven, aplicando conceptos fundamentales de la programación orientada a objetos, tales como:

Encapsulamiento: uso de atributos privados y métodos getters y setters para controlar el acceso a los datos.

Herencia: implementación de la clase Empleado, que hereda los atributos y comportamientos de la clase Persona.

Composición: relación entre las clases Persona y Direccion, donde una persona contiene un objeto de tipo dirección.

Constructores: inicialización de los objetos mediante sus respectivos constructores.

Validación de datos: comprobación de los datos ingresados para evitar información vacía o con formatos incorrectos.

Manejo de excepciones: utilización de try, catch, throw y finally para controlar situaciones de error durante la ejecución del programa.

El objetivo principal es aplicar los conceptos estudiados durante la asignatura mediante la creación de clases relacionadas entre sí y la implementación de validaciones que permitan mantener la consistencia de los datos.

🧱 Estructura general del proyecto

El proyecto utiliza una estructura Maven y se organiza de la siguiente manera:

Realizandovalidacionexcepcionesyrelacionesentreclases/
│
├── src/
│   └── main/
│       └── java/
│           │
│           ├── app/
│           │   └── Main.java
│           │
│           └── model/
│               ├── Persona.java
│               ├── Empleado.java
│               └── Direccion.java
│
├── pom.xml
├── .gitignore
└── README.md

📂 Descripción de los paquetes y clases

Paquete app

Main.java: contiene el método principal del programa. Se encarga de crear los objetos, realizar las validaciones, controlar los RUT registrados y mostrar los resultados por consola.

Paquete model

Persona.java: clase base que representa a una persona. Contiene los atributos nombre, RUT y dirección, además de sus respectivos métodos de acceso y validaciones.

Empleado.java: clase que hereda de Persona y agrega el atributo cargo.

Direccion.java: clase que representa la dirección de una persona, incluyendo calle, ciudad y región.

⚙️ Instrucciones para clonar y ejecutar el proyecto

Para obtener y ejecutar el proyecto, se deben seguir los siguientes pasos:

Clonar el repositorio: abrir Git Bash o una terminal y ejecutar el siguiente comando:

git clone https://github.com/kevinchacon-dev/Llanquihue-Tour-Evaluacion-DOO-sem-3-.git

Abrir el proyecto: iniciar IntelliJ IDEA y seleccionar la opción para abrir un proyecto existente. Luego, seleccionar la carpeta descargada.

Verificar la estructura: comprobar que IntelliJ IDEA reconozca la estructura Maven y que los paquetes app y model estén correctamente identificados.

Ejecutar el programa: abrir la clase Main.java, ubicada en el paquete app, y ejecutar el método main().

Visualizar los resultados: revisar la consola de IntelliJ IDEA para observar la creación de los objetos, las validaciones realizadas y los mensajes correspondientes al manejo de excepciones.

🔗 Repositorio GitHub

Repositorio GitHub: https://github.com/kevinchacon-dev/Llanquihue-Tour-Evaluacion-DOO-sem-3-/

Fecha de entrega: 09/11/2026