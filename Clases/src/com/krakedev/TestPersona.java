package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo Persona
		p = new Persona();// 2. Instanciar un objeto Persona, refereciarlo a p
		Persona p2 = new Persona();

		// 3. Accedo a los atributos y muestro en consola
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;

		// 5. Accedo a los atributos Modificado y muestro en consola 
		System.out.println("----------------");
		System.out.println("nombre:" + p.nombre);
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		System.out.println("-------------");
		p2.nombre = "Angelina";
		System.out.println("p.nombre:" + p.nombre);
		System.out.println("p2.nombre:" + p2.nombre);

	}

}