package com.clearminds.componentes;

public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    // Constructor que recibe 3 parámetros y asigna sus valores a los atributos.
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    // Método para incrementar el precio en un porcentaje.
    public void incrementarPrecio(int porcentajeIncremento) {
        double incremento = precio * porcentajeIncremento / 100.0;
        precio += incremento;
    }

    // Método para disminuir el precio en un valor de descuento.
    public void disminuirPrecio(double descuento) {
        precio -= descuento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

	public void incrementarStock1(int cantidad) {
		// TODO Auto-generated method stub
		
	}

	public void incrementarStock(int cantidad) {
		// TODO Auto-generated method stub
		
	}
}
