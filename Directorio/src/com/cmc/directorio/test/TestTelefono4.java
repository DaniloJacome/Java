package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(1, "movi", "124545");
        Telefono t2 = new Telefono(2, "claro", "5445821");
        Telefono t3 = new Telefono(3, "movi", "67890");
        Telefono t4 = new Telefono(4, "claro", "9876455");

        AdminTelefono admin = new AdminTelefono();
        int count = admin.contarClaro(t1, t2, t3, t4);
        System.out.println("Cantidad de teléfonos 'CLARO': " + count);
    }
}