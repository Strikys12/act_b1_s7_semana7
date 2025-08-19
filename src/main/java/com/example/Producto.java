package com.example;

public class Producto {

     protected String nombre;
    protected double precioBase;
    protected String codigo;
    protected int cantidadStock;
    protected String categoria;
    protected boolean activo;


    public Producto(String nombre, double precioBase, String codigo, int cantidadStock, String categoria,
            boolean activo) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.categoria = categoria;
        this.activo = activo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecioBase() {
        return precioBase;
    }


    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public int getCantidadStock() {
        return cantidadStock;
    }


    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }

     public double calcularPrecioFinal() {

        if () {
            
        }
       // TODO: Calcular precio base + IVA (19%)
       // Retornar el precio base multiplicado por 1.19
   }

}
