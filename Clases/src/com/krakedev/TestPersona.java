package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo Persona
		p = new Persona();// 2. Instanciar un objeto Persona, refereciarlo a p
		Persona p2 = new Persona();

		// 3. Accedo a los atributos y muestro en consola
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		// 4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad (45);
		p.setEstatura (1.56);

		// 5. Accedo a los atributos Modificado y muestro en consola 
		System.out.println("----------------");
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		System.out.println("-------------");
		p2.setNombre ("Angelina");
		System.out.println("p.nombre:" + p.getNombre());
		System.out.println("p2.nombre:" + p2.getNombre());

	}

}
