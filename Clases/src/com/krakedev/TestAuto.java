package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2= new Auto();

		auto1.marca = "Tesla";
		auto1.anio= 2022;
		auto1.precio= 250.000;
		
		auto2.marca = "Ferrari";
		auto2.anio= 2018;
		auto2.precio= 150.000;
		
		System.out.println("marca: " + auto1.marca);
		System.out.println("anio: " + auto1.anio);
		System.out.println("precio: " + auto1.precio);
		System.out.println("----------------");
		System.out.println("marca: " + auto2.marca);
		System.out.println("anio: " + auto2.anio);
		System.out.println("precio: " + auto2.precio);

	}

}