package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo p1=new Rectangulo();
		int areaR1;
		int areaR2;
		double perimetroR1;
		
		r1.base=10;
		r1.altura=5;
		r2.base=8;
		r2.altura=5;
		p1.base=4;
		p1.altura=2;
		
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		perimetroR1=p1.calcularPerimetro();
		
		System.out.println("El area de R1 es: "+areaR1);
		System.out.println("El area de R2 es: "+areaR2);
		System.out.println("El perimetro de P1 es: "+perimetroR1);
	}

}