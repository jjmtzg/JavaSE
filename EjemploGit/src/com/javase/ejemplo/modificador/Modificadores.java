package com.javase.ejemplo.modificador;

public class Modificadores {

	public Modificadores() {
		
	}
	public static void tipoEstatico()
	{
		System.out.println("estatico");
	}
	//No puede ser llamado de ningun lado
	public final void tipoFinal()
	{
		System.out.println("Finalista :)");
	}
}
