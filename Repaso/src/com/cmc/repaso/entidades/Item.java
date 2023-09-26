package com.cmc.repaso.entidades;

	public class Item {
	private String nombre;
	public int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public Item(String nombre) {
		this.nombre = nombre;
		this.productosActuales = 0;
		this.productosDevueltos = 0;
		this.productosVendidos = 0;
	}

	public void imprimir() {
		System.out.println("Nombre del Item: " + nombre);
		System.out.println("Productos Actuales: " + productosActuales);
		System.out.println("Productos Devueltos: " + productosDevueltos);
		System.out.println("Productos Vendidos: " + productosVendidos);
	}

	public void vender(int cantidadVendida) {
		if (cantidadVendida <= productosActuales) {
			productosActuales -= cantidadVendida;
			productosVendidos += cantidadVendida;
		} else {
			System.out.println("No hay suficientes productos disponibles para la vender.");
		}
	}

	public void devolver(int cantidadDevuelta) {
		if (cantidadDevuelta <= productosVendidos) {
			productosActuales += cantidadDevuelta;
			productosDevueltos += cantidadDevuelta;
			productosVendidos -= cantidadDevuelta;
		} else {
			System.out.println("No se pueden devolver más productos de los que se han vendido.");
		}
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}
}
