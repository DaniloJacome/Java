package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha();
		Fecha fecha2=new Fecha(1994);
		Fecha fecha3=new Fecha(1996,11,25);
		System.out.println(fecha2.getAnio());
		System.out.println(fecha2.getMes());
		System.out.println(fecha2.getDia());
		System.out.println("-----------");
		System.out.println(fecha3.getAnio());
		System.out.println(fecha3.getMes());
		System.out.println(fecha3.getDia());
		System.out.println("-----------");
		
		fecha1.setAnio(2000); //set para modificar
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println(fecha1.getAnio()); //get para recuperar

	}

}
