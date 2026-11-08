package model;

public class Persona {


    private String nombre;
    private String rut;
    private Direccion direccion;

    public Persona(String nombre, Direccion direccion, String rut) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (rut == null || !rut.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException("El formato del RUT es inválido");
        }

        this.nombre = nombre;
        this.direccion = direccion;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + ", " + rut + ", " + direccion;
    }
}
