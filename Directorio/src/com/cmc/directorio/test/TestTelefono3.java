package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(1, "movi", "12345");
        Telefono t2 = new Telefono(2, "claro", "54321");
        Telefono t3 = new Telefono(3, "movi", "67890");

        AdminTelefono admin = new AdminTelefono();
        int count = admin.contarMovi(t1, t2, t3);
        System.out.println("Cantidad de teléfonos 'MOVI': " + count);
    }
}

