/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concurso;

/**
 *
 * @author Jhonk
 */
public class Fotografia {
    String titulo,autor,nacionalidad;
    int puntuacion;

    public Fotografia() {
    }

    public Fotografia(String titulo, String autor, String nacionalidad, int puntuacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.nacionalidad = nacionalidad;
        this.puntuacion = puntuacion;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
}
