package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Estudiante;
public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Danilo");
		Estudiante estudiante2=new Estudiante("Mayensi");
		estudiante1.calificar(8);
		System.out.println("Nombre del estudiante: " + estudiante1.nombre);
        System.out.println("Calificación: " + estudiante1.nota);
        System.out.println("Resultado: " + estudiante1.resultado);
        System.out.println("*****************");
        estudiante2.calificar(5);
		System.out.println("Nombre del estudiante: " + estudiante2.nombre);
        System.out.println("Calificación: " + estudiante2.nota);
        System.out.println("Resultado: " + estudiante2.resultado);
	}
}
