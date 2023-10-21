package com.clearminds.componentes;

public class Celda {
    private Producto producto;
    private int stock;
    private String codigo;

    public Celda(String codigo) {
        this.codigo = codigo;
    }

    // Método para ingresar un Producto y el stock inicial a la celda
    public void ingresarProducto(Producto producto, int stockInicial) {
        this.producto = producto;
        this.stock = stockInicial;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

	public void mostrarInformacionProducto() {
		// TODO Auto-generated method stub
		
	}

	public void incrementarStock(int cantidad) {
		// TODO Auto-generated method stub
		
	}

	public void disminuirStock1(int i) {
		// TODO Auto-generated method stub
		
	}

	public void disminuirStock(int i) {
		// TODO Auto-generated method stub
		
	}
}

