package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av. Siempre Viva");
		dir.setCalleSecundaria("La que Cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		
		String nombre=p1.getNombre();
 		Direccion d1=p1.getDireccion();
		System.out.println("Nombre: "+nombre);
		//d1 esta null y trato de invocar  a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
						//null.algunMetodo();						
	}

}
 