package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
    public static void main(String[] args) {
        // Crear dos Contactos con información diferente, incluido el teléfono
        Telefono telef1 = new Telefono(1, "claro", "98764845");
        Contacto contacto1 = new Contacto("Richard", "Jácome", telef1, 82.3);

        Telefono telef2 = new Telefono(2, "movi", "54321");
        Contacto contacto2 = new Contacto("Cristian", "Jácome", telef2, 70.8);

        // Invocar al método buscarMasPesado y imprimir los datos del Contacto que retorna
        AdminContactos adminContactos = new AdminContactos();
        Contacto masPesado = adminContactos.buscarMasPesado(contacto1, contacto2);
        System.out.println("CONTACTO MAS PESADO:\n" + masPesado);

        // Invocar al método compararOperadoras e imprimir el resultado
        boolean mismaOperadora = adminContactos.compararOperadoras(contacto1, contacto2);
        System.out.println("¿OPERADORAS IGUALES?: " + mismaOperadora);
    }
}
