package com.javase.ejemplo.herencia.pokemon;

//import com.javase.ejemplo.herencia.pokemon.tipo.Electrico;

public class Pokemon 
{
	private int nivelAtaque=0;
	private int nivelDefensa=0;
	private int nivelEvolucion=0;
	private int vida=0;
	private int edad=0;
	private String nombre="";
	private boolean salvaje=true;
	private String tipo="";
	//private String[] ataqueEspecial;
	//private String[] ataqueOculto;
	public Pokemon() 
	{
		
	}
	public void luchar()
	{
		System.out.println("Te reto paps");
	}
	public void crecer()
	{
		System.out.println("Ya no soy un niño mamá");
	}
	public void evolucionar()
	{
		System.out.println("Agumon Digievols aaaa... xD");
	}
	public void setNivelAtaque(int nivelAtaque)
	{
		this.nivelAtaque=nivelAtaque;
	}
	public void setNivelDefensa(int nivelDefensa)
	{
		this.nivelDefensa=nivelDefensa;
	}
	public void setNivelEvolucion(int nivelEvolucion)
	{
		this.nivelEvolucion=nivelEvolucion;
	}
	public void setVida(int vida)
	{
		this.vida=vida;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setTipo(String tipo)
	{
		switch(tipo)
		{
			case"Electrico":
				this.tipo=tipo;
				break;
		}
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setSalvaje(boolean salvaje)
	{
		this.salvaje=salvaje;
	}
	public int getNivelAtaque()
	{
		return nivelAtaque;
	}
	public int getNivelDefensa()
	{
		return nivelDefensa;
	}
	public int getNivelEvolucion()
	{
		return nivelEvolucion;
	}
	public int getVida()
	{
		return vida;
	}
	public int setEdad()
	{
		return edad;
	}
	public String getNombre()
	{
		return nombre;
	}
	public boolean getSalvaje()
	{
		return salvaje;
	}
}
