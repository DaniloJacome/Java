package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono(1, "movi", "18875695");
		Contacto c = new Contacto("Juan", "Perez", telef, 75.5);
		System.out.println(c);
	}
}