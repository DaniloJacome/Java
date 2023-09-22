package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre="Finalin";
		productoA.descripcion="Es un analgésico indicado para combatir rápidamente el dolor de cabeza, el malestar y la fiebre.";
		productoA.precio= 0.55 ;		
		productoA.stockActual= 182;
		
		productoB.nombre="Paracetamol";
		productoB.descripcion="Es un analgésico y antipirético eficaz para el control del dolor leve o moderado causado por afecciones articulares, otalgias, cefaleas, dolor odontogénico, neuralgias, procedimientos quirúrgicos menores etc.";
		productoB.precio= 1.75 ;		
		productoB.stockActual= 135;
		
		productoC.nombre="Ibuprofeno";
		productoC.descripcion="El ibuprofeno alivia el dolor y baja la fiebre. En algunos pacientes suele ser más efectivo para aliviar el dolor de corta duración de tipo menstrual, dental, de garganta, esguinces o torceduras.";
		productoC.precio= 1.58 ;		
		productoC.stockActual= 225;
		
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripcion: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stockActual: "+productoA.stockActual);
		System.out.println("-------------------");
		
		System.out.println("nombre: "+productoB.nombre);
		System.out.println("descripcion: "+productoB.descripcion);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stockActual: "+productoB.stockActual);
		System.out.println("-------------------");
		
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripcion: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stockActual: "+productoC.stockActual);
		
	}

}
