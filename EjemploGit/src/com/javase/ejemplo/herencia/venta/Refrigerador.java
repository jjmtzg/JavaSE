package com.javase.ejemplo.herencia.venta;
public class Refrigerador implements Clavija
{
	private int temperatura;
	private CajaFrutas fruitBox;
	public Refrigerador() 
	{
	}
	public int getTemperatura() 
	{
		return temperatura;
	}
	public void setTemperatura(int temperatura) 
	{
		this.temperatura = temperatura;
	}
	public CajaFrutas getFruitBox() 
	{
		return fruitBox;
	}
	public void setFruitBox(CajaFrutas fruitBox) 
	{
		this.fruitBox = fruitBox;
	}
	@Override
	public void conectarse() 
	{
		// TODO Auto-generated method stub
		
	}
	
}