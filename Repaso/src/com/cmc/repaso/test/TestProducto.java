package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Pollo", 100);

		System.out.println("Precio inicial: " + producto1.getPrecio());
		producto1.setPrecio(-80);
		System.out.println("Precio después del setPrecio: $" + producto1.getPrecio());
		double precioConDescuento = producto1.calcularPrecioPromo(30);
		System.out.println("Precio con descuento: $" + precioConDescuento);
	}
}
