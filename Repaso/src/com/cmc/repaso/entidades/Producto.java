package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private int precio;

	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		if (precio < 0) {
			this.precio = precio * -1;
		} else {
			this.precio = precio;
		}
	}

	public double calcularPrecioPromo(double porcentajeDescuento) {
	    double descuento = (porcentajeDescuento / 100) * precio;
	    double precioConDescuento = precio - descuento;
	    return precioConDescuento; 
	}
}