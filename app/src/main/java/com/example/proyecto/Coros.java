package com.example.proyecto;

public class Coros {
    private int id;
    private String titulo;
    private String autor;
    private String letra;

    public Coros() {
    }

    public Coros(int id, String titulo, String autor, String letra) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.letra = letra;
    }



    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return  id +  " ~ " + titulo;
    }

    public  String tostring(){
        return "TÍTULO: " + titulo + "\n"+
                "AUTOR: " + autor + "\n\n"+
                "LETRA: " +  "\n" + letra ;
    }
}
