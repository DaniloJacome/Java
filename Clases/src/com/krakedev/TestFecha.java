package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha();
		fecha1.setAnio(2000); //set para modificar
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println(fecha1.getAnio()); //get para recuperar

	}

}
