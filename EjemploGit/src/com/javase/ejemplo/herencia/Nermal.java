package com.javase.ejemplo.herencia;

public class Nermal extends Animal 
{

	public Nermal() 
	{
		
	}
	public void molestar(String nombre)
	{
		if(nombre.equalsIgnoreCase("Garfield"))
			System.out.println("Hola "+nombre.toUpperCase());
		else
			System.out.println("�ol");
	}
}
