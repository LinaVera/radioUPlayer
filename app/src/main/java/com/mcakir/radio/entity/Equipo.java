package com.mcakir.radio.entity;

public class Equipo {

    String nombre = null;
    String cargo = null;
    String imagen = null;

    public Equipo(String nombre, String cargo, String imagen) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
