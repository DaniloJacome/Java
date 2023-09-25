package com.krakedev;

public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	
	//CONSTRUCTORES
	public Persona() {
		System.out.println("ingresa al contrusctor");
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
	}
	//FIN CONSTRUCTORES
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
}