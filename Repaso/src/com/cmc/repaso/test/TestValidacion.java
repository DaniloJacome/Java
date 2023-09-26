package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion1 =new Validacion();
		validacion1.validarMonto(-5);
		validacion1.validarMonto(8);
		validacion1.validarMonto(0);
	}

}
