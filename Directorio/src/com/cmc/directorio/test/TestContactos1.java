package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
    public static void main(String[] args) {
        // Crear dos Contactos con información, incluido el teléfono
        Telefono telef1 = new Telefono(1, "movi", "12345");
        Contacto contacto1 = new Contacto("Danilo", "Jácome", telef1, 75.5);

        Telefono telef2 = new Telefono(2, "claro", "54321");
        Contacto contacto2 = new Contacto("Mayensi", "Salazar", telef2, 60.2);

        // Invocar al método buscarMasPesado y imprimir los datos del Contacto que retorna
        AdminContactos adminContactos = new AdminContactos();
        Contacto masPesado = adminContactos.buscarMasPesado(contacto1, contacto2);
        System.out.println("CONTACTO MAS PESADO:\n" + masPesado);

        // Invocar al método compararOperadoras e imprimir el resultado
        boolean mismaOperadora = adminContactos.compararOperadoras(contacto1, contacto2);
        System.out.println("¿OPERADORES IGUALES?: " + mismaOperadora);
    }
}
