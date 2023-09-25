package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto("Toyota");
		Auto auto4 = new Auto("Hyundai",2014,75.000);
		System.out.println("marca: " + auto3.getMarca());
		System.out.println("anio: " + auto3.getAnio());
		System.out.println("precio: " + auto3.getPrecio());
		System.out.println("----------------");
		System.out.println("marca: " + auto4.getMarca());
		System.out.println("anio: " + auto4.getAnio());
		System.out.println("precio: " + auto4.getPrecio());
		System.out.println("----------------");

		auto1.setMarca("Tesla");
		auto1.setAnio(2022);
		auto1.setPrecio(250.000);
		
		auto2.setMarca ("Ferrari");
		auto2.setAnio(2018);
		auto2.setPrecio(150.000);
		
		System.out.println("marca: " + auto1.getMarca());
		System.out.println("anio: " + auto1.getAnio());
		System.out.println("precio: " + auto1.getPrecio());
		System.out.println("----------------");
		System.out.println("marca: " + auto2.getMarca());
		System.out.println("anio: " + auto2.getAnio());
		System.out.println("precio: " + auto2.getPrecio());

	}

}
