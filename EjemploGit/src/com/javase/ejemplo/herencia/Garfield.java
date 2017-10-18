package com.javase.ejemplo.herencia;

public class Garfield extends Animal
{

	private String nombre="Garfield";
	public Garfield() 
	{
		
	}
	
	public void comer(String comida)
	{
		if(comida.equalsIgnoreCase("lasagna"))
			System.out.println("YAY");
		else
			System.out.println("N'AY");
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}
