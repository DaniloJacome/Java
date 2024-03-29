package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		Producto productoD = new Producto("Aspirina");
		Producto productoE = new Producto("Omeprazol",0.77,155);
		
		System.out.println("nombre: "+productoD.getNombre());
		System.out.println("precio: "+productoD.getPrecio());
		System.out.println("stockActual: "+productoD.getStockActual());
		System.out.println("-------------------");
		
		System.out.println("nombre: "+productoE.getNombre());
		System.out.println("precio: "+productoE.getPrecio());
		System.out.println("stockActual: "+productoE.getStockActual());
		System.out.println("-------------------");
		
		productoA.setNombre("Finalin");
		productoA.setDescripcion("Es un analgésico indicado para combatir rápidamente el dolor de cabeza, el malestar y la fiebre.");
		productoA.setPrecio(0.55) ;		
		productoA.setStockActual(182);
		
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("Es un analgésico y antipirético eficaz para el control del dolor leve o moderado causado por afecciones articulares, otalgias, cefaleas, dolor odontogénico, neuralgias, procedimientos quirúrgicos menores etc.");
		productoB.setPrecio(1.75) ;		
		productoB.setStockActual(135);
		
		productoC.setNombre("Ibuprofeno");
		productoC.setDescripcion("El ibuprofeno alivia el dolor y baja la fiebre. En algunos pacientes suele ser más efectivo para aliviar el dolor de corta duración de tipo menstrual, dental, de garganta, esguinces o torceduras.");
		productoC.setPrecio(1.58) ;		
		productoC.setStockActual(225);
		
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stockActual: "+productoA.getStockActual());
		System.out.println("-------------------");
		
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripcion: "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stockActual: "+productoB.getStockActual());
		System.out.println("-------------------");
		
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stockActual: "+productoC.getStockActual());
		
	}

}
