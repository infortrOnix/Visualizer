package com.ulp.visualizer;

public class Agencia {

    private int foto;
    private String marca;
    private String modelo;
    private double precio;

    public Agencia(int foto, String marca, String modelo, double precio){
        this.foto=foto;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
