package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item("CAMISETAS POLO");
		Item item2 = new Item("CAMISETAS RETRO");
        item1.productosActuales = 20;
        item2.productosActuales = 156;

        System.out.println("Valores iniciales:");
        item1.imprimir();
        item2.imprimir();

        //VENTA
        item1.vender(5);
        item2.vender(58);

        //DEVOLUCION
        item1.devolver(2);
        item2.devolver(12);
        System.out.println("******************************************");
        System.out.println("Después de las VENTAS y DEVOLUCIONES:");
        item1.imprimir();
        System.out.println("******************************************");
        System.out.println("Después de las VENTAS y DEVOLUCIONES:");
        item2.imprimir();
	}

}
