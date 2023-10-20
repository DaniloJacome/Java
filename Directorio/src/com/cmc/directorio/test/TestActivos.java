package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        // Crear un Contacto sin WhatsApp
        Telefono telef = new Telefono(1, "movi", "48458485");
        Contacto contacto = new Contacto("Danilo", "Jácome", telef, 65.7);

        System.out.println("CONTACTO ANTES DE ACTIVAS WHATSAPP:\n" + contacto);

        // Invocar el método activarUsuario
        AdminContactos adminContactos = new AdminContactos();
        adminContactos.activarUsuario(contacto);

        System.out.println("CONTACTO DESPUES DE ACTIVAR WHATSAPP:\n" + contacto);
    }
}
