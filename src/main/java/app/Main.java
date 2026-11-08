
package app;

import model.Persona;
import model.Empleado;
import model.Direccion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Lista para almacenar los RUT registrados
        ArrayList<String> rutRegistrados = new ArrayList<>();

        // Crear direcciones
        Direccion direccion1 = new Direccion(
                "Av. Vicente Perez Rosales", "Llanquihue", "Los Lagos"
        );

        Direccion direccion2 = new Direccion(
                "Calle San Martin", "Puerto Varas", "Los Lagos"
        );

        Direccion direccion3 = new Direccion(
                "Av. Costanera", "Puerto Montt", "Los Lagos"
        );

        System.out.println("=== LLANQUIHUE TOUR ===");
        System.out.println("\n=== REGISTRO DE PERSONAS ===");

        // Primer registro: Camila
        try {
            String rut = "12345678-9";

            if (rutRegistrados.contains(rut)) {
                throw new IllegalArgumentException("El RUT ya está registrado.");
            }

            Persona persona1 = new Persona("Camila Perez", direccion1, rut);
            rutRegistrados.add(rut);

            System.out.println(persona1);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Segundo registro: Jorge
        try {
            String rut = "98765432-1";

            if (rutRegistrados.contains(rut)) {
                throw new IllegalArgumentException("El RUT ya está registrado.");
            }

            Persona persona2 = new Persona("Jorge Gonzalez", direccion2, rut);
            rutRegistrados.add(rut);

            System.out.println(persona2);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Tercer registro: María
        try {
            String rut = "11222333-4";

            if (rutRegistrados.contains(rut)) {
                throw new IllegalArgumentException("El RUT ya está registrado.");
            }

            Empleado empleado1 = new Empleado(
                    "Maria Torres", direccion3, rut, "Guia turistico"
            );

            rutRegistrados.add(rut);

            System.out.println(empleado1);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Prueba de RUT duplicado
        System.out.println("\n=== PRUEBA DE RUT DUPLICADO ===");

        try {
            String rut = "12345678-9";

            if (rutRegistrados.contains(rut)) {
                throw new IllegalArgumentException("El RUT ya está registrado.");
            }

            Persona personaDuplicada = new Persona(
                    "Carlos Soto", direccion2, rut
            );

            rutRegistrados.add(rut);
            System.out.println(personaDuplicada);

        } catch (IllegalArgumentException e) {
            System.out.println("Error de registro: " + e.getMessage());

        } finally {
            System.out.println("Proceso de registro finalizado.");
        }

        // Prueba de nombre vacío
        System.out.println("\n=== PRUEBA DE VALIDACIÓN DE NOMBRE ===");

        try {
            Persona personaPrueba = new Persona(
                    "",
                    new Direccion("Los Lagos 123", "Llanquihue", "Los Lagos"),
                    "12345678-0"
            );

            System.out.println(personaPrueba);

        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo registrar la persona.");
            System.out.println("Motivo: " + e.getMessage());

        } finally {
            System.out.println("Proceso de registro finalizado.");
        }

        // Mostrar total de registros
        System.out.println("\nTotal de personas registradas: "
                + rutRegistrados.size());
    }
}
