package com.mcakir.radio.entity;

public class Programas {
    String imagen;
    String nombre_programa;
    String horario;
    String dia;
    String descrip;

    public Programas(String imagen, String nombre_programa, String horario, String dia, String descrip) {
        this.imagen = imagen;
        this.nombre_programa = nombre_programa;
        this.horario = horario;
        this.dia = dia;
        this.descrip = descrip;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

}
