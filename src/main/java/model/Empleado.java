package model;

public class Empleado extends Persona{

    private String cargo;

    public Empleado(String nombre, Direccion direccion, String rut, String cargo) {
        super(nombre, direccion, rut);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString()
                + ", cargo='" + cargo + "'}";



     }
}
