package com.javase.ejemplo.herencia.venta;

public abstract class Fruta 
{
	private String color;
	private String tamanio;
	private int expiracion; 
	public Fruta()
	{
		color="S/C";
		tamanio="N/A";
		expiracion=0;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public String getTamanio() 
	{
		return tamanio;
	}
	public void setTamanio(String tamanio) 
	{
		this.tamanio = tamanio;
	}
	public int getExpiracion() 
	{
		return expiracion;
	}
	public void setExpiracion(int expiracion) 
	{
		this.expiracion = expiracion;
	}
	public abstract void descomponer();
}
