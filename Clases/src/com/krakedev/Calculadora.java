package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado; //Declarar la variable
		resultado=valor1+valor2; //guardo el resultado en una variable
		return resultado;
	}
	
	public int restar(int valor1, int valor2) {
		int resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	
	public double multiplicar(int valor1, int valor2) {
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	
	public double dividir(double valor1, double valor2) {
		double resultado;
		resultado=valor1/valor2;
		return resultado;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double resultado;
		resultado=(valor1+valor2+valor3)/3;
		return resultado;
	}
	
	public void mostrarResultado() { //void si el metodo no retorna nada
		System.out.println("Ahorita no joven, sali al almuerzo. Regreso en 15 minutos"); 
	}
}
