package com.javase.ejemplo.herencia.pokemon.tipo;

import java.util.Timer;

import com.javase.ejemplo.herencia.pokemon.Pokemon;

public class Electrico extends Pokemon
{	
	
	public Electrico(String nombre) 
	{
		setTipo("Electrico");
		setNombre(nombre);
	}
	public void almacenarElectricidad()
	{
		System.out.println("Charging...");
		Timer tmr=new Timer();
		try {
			tmr.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Chuuu!!!");
	}
	public void liberarElectricidad()
	{
		System.err.println("Battery low...");
	}
}
