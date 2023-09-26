package com.krakedev.test;
import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(586,"Carnes");
		producto1.setDescripcion("Carnes para la navidad");
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());
	}

}
