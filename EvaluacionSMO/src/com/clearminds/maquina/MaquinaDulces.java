package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;

	public MaquinaDulces() {
		Celda1 = null;
		Celda2 = null;
		Celda3 = null;
		Celda4 = null;
		Saldo = 0.0;
	}

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		Celda1 = new Celda(codigoCelda1);
		Celda2 = new Celda(codigoCelda2);
		Celda3 = new Celda(codigoCelda3);
		Celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda1: " + Celda1.getCodigo());
		System.out.println("Celda2: " + Celda2.getCodigo());
		System.out.println("Celda3: " + Celda3.getCodigo());
		System.out.println("Celda4: " + Celda4.getCodigo());
		System.out.println("Saldo actual de la máquina: " + Saldo);
	}

	public Celda buscarCelda(String codigoCelda) {
		if (Celda1 != null && Celda1.getCodigo().equals(codigoCelda)) {
			return Celda1;
		}
		if (Celda2 != null && Celda2.getCodigo().equals(codigoCelda)) {
			return Celda2;
		}
		if (Celda3 != null && Celda3.getCodigo().equals(codigoCelda)) {
			return Celda3;
		}
		if (Celda4 != null && Celda4.getCodigo().equals(codigoCelda)) {
			return Celda4;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int stockInicial) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, stockInicial);
		}
	}

	public void mostrarProductos() {
		System.out.println("************CELDA A1");
		Celda celdaA1 = buscarCelda("A1");
		if (celdaA1 != null) {
			System.out.println("Stock: " + celdaA1.getStock());
			Producto productoA1 = celdaA1.getProducto();
			if (productoA1 != null) {
				System.out.println("Nombre Producto: " + productoA1.getNombre());
				System.out.println("Precio Producto: " + productoA1.getPrecio());
				System.out.println("Código Producto: " + productoA1.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		} else {
			System.out.println("La celda no existe!!!");
		}

		System.out.println("*********CELDA A2");
		Celda celdaA2 = buscarCelda("A2");
		if (celdaA2 != null) {
			System.out.println("Stock: " + celdaA2.getStock());
			Producto productoA2 = celdaA2.getProducto();
			if (productoA2 != null) {
				System.out.println("Nombre Producto: " + productoA2.getNombre());
				System.out.println("Precio Producto: " + productoA2.getPrecio());
				System.out.println("Código Producto: " + productoA2.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		} else {
			System.out.println("La celda no existe!!!");
		}

		System.out.println("*********CELDA B1");
		Celda celdaB1 = buscarCelda("B1");
		if (celdaB1 != null) {
			System.out.println("Stock: " + celdaB1.getStock());
			Producto productoB1 = celdaB1.getProducto();
			if (productoB1 != null) {
				System.out.println("Nombre Producto: " + productoB1.getNombre());
				System.out.println("Precio Producto: " + productoB1.getPrecio());
				System.out.println("Código Producto: " + productoB1.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		} else {
			System.out.println("La celda no existe!!!");
		}

		System.out.println("*********CELDA B2");
		Celda celdaB2 = buscarCelda("B2");
		if (celdaB2 != null) {
			System.out.println("Stock: " + celdaB2.getStock());
			Producto productoB2 = celdaB2.getProducto();
			if (productoB2 != null) {
				System.out.println("Nombre Producto: " + productoB2.getNombre());
				System.out.println("Precio Producto: " + productoB2.getPrecio());
				System.out.println("Código Producto: " + productoB2.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		} else {
			System.out.println("La celda no existe!!!");
		}

		System.out.println("SALDO: " + getSaldo1());

		System.out.println("MOSTRANDO PRODUCTOS EN LA MAQUINA:");
		Celda[] celdas = { Celda1, Celda2, Celda3, Celda4 };

		for (Celda celda : celdas) {
			System.out.println("********" + celda.getCodigo());
			System.out.println("Stock: " + celda.getStock());
			Producto productoCelda = celda.getProducto();

			if (productoCelda != null) {
				System.out.println("Nombre Producto: " + productoCelda.getNombre());
				System.out.println("Precio Producto: " + productoCelda.getPrecio());
				System.out.println("Código Producto: " + productoCelda.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}
		}

		System.out.println("Saldo: " + getSaldo1());

		///// VENDER CON CAMBIO
		System.out.println("Precio Producto: " + consultarPrecio("B1"));
		System.out.println("Código Producto: " + buscarProductoEnCelda("B1").getCodigo());

		System.out.println("************CELDA A2");
		Celda celdaA21 = buscarCelda("A2");
		System.out.println("Saldo:" + Saldo);
		System.out.println("Stock: " + celdaA21.getStock());
		Producto productoA2 = celdaA21.getProducto();
		if (productoA2 != null) {
			System.out.println("Nombre Producto: " + productoA2.getNombre());
			System.out.println("Precio Producto: " + productoA2.getPrecio());
			System.out.println("Código Producto: " + productoA2.getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("***********CELDAB1");
		Celda celdaB11 = buscarCelda("B1");
		System.out.println("Saldo:" + Saldo);
		System.out.println("Stock: " + celdaB11.getStock());
		Producto productoB1 = celdaB11.getProducto();
		if (productoB1 != null) {
			System.out.println("Nombre Producto: " + productoB1.getNombre());
			System.out.println("Precio Producto: " + productoB1.getPrecio());
			System.out.println("Código Producto: " + productoB1.getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("**********CELDAB2");
		Celda celdaB21 = buscarCelda("B2");
		System.out.println("Saldo:" + Saldo);
		System.out.println("Stock: " + celdaB21.getStock());
		Producto productoB2 = celdaB21.getProducto();
		if (productoB2 != null) {
			System.out.println("Nombre Producto: " + productoB2.getNombre());
			System.out.println("Precio Producto: " + productoB2.getPrecio());
			System.out.println("Código Producto: " + productoB2.getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
	}

	public double getSaldo1() {
		return Saldo;
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null) {
			return celda.getProducto().getPrecio();
		}
		return 0.0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (Celda1 != null && Celda1.getProducto() != null && Celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda1;
		}
		if (Celda2 != null && Celda2.getProducto() != null && Celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda2;
		}
		if (Celda3 != null && Celda3.getProducto() != null && Celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda3;
		}
		if (Celda4 != null && Celda4.getProducto() != null && Celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return Celda4;
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			int stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidad);
		}
	}

	public class TestVender {

		public static void main(String[] args) {
			MaquinaDulces maquina = new MaquinaDulces();
			maquina.configurarMaquina("A1", "A2", "B1", "B2");

			Producto producto = new Producto("KE34", 0.85, "Papitas");
			maquina.cargarProducto(producto, "B1", 4);

			Producto producto2 = new Producto("D456", 0.70, "Doritos");
			maquina.cargarProducto(producto2, "A1", 6);

			maquina.vender("A1");
			maquina.vender("B1");

			System.out.println("************CELDA A1");
			System.out.println("Stock: " + maquina.buscarCelda("A1").getStock());
			Producto productoA1 = maquina.buscarCelda("A1").getProducto();
			if (productoA1 != null) {
				System.out.println("Nombre Producto: " + productoA1.getNombre());
				System.out.println("Precio Producto: " + productoA1.getPrecio());
				System.out.println("Código Producto: " + productoA1.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}

			System.out.println("************CELDA B1");
			System.out.println("Stock: " + maquina.buscarCelda("B1").getStock());
			Producto productoB1 = maquina.buscarCelda("B1").getProducto();
			if (productoB1 != null) {
				System.out.println("Nombre Producto: " + productoB1.getNombre());
				System.out.println("Precio Producto: " + productoB1.getPrecio());
				System.out.println("Código Producto: " + productoB1.getCodigo());
			} else {
				System.out.println("La celda no tiene producto!!!");
			}

			System.out.println("Saldo: " + maquina.getSaldo1());
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			double precio = celda.getProducto().getPrecio();
			if (valorIngresado >= precio) {
				celda.disminuirStock(1); // Disminuir el stock en 1
				Saldo += precio;
				double cambio = valorIngresado - precio;
				mostrarProductos(); // Llamar a mostrarProductos() para actualizar el estado de la máquina
				return cambio;
			}
		}
		return -1.0; // Valor negativo indica que no se pudo realizar la venta con éxito
	}

	public void vender(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			double precio = celda.getProducto().getPrecio();
			celda.disminuirStock(0);
			Saldo += precio;
		}
	}

	public double getSaldo() {
		return Saldo;
	}
}
