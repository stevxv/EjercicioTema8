package com.company;

public class EjercicioTema8 {
    public static void main(String[] args) {

        Persona objPersona = new Persona();

        objPersona.setEdad(18);
        objPersona.setNombre("Steve");
        objPersona.setTelefono(123456789);

        System.out.println("Edad: " + objPersona.getEdad());
        System.out.println("Nombre: " + objPersona.getNombre());
        System.out.println("Telefono: " + objPersona.getTelefono());
    }
}

class Persona {
    // propiedades

    private int edad;
    private String nombre;
    private int telefono;

    // metodos set y get

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
