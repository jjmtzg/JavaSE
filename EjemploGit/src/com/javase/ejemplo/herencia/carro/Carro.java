package com.javase.ejemplo.herencia.carro;

public class Carro {
	int Velocidad;
	Llantas [] Llanta;
	public Carro()
	{
		Llanta=new Llantas[4];
		for(int i=0;i<Llanta.length;i++)
		{
			Llanta[i]=new Llantas();
			Llanta[i].setRadio(15);
			Llanta[i].setClima("Verano");
		}
	}
	public void setVelocidad(int vel)
	{
		Velocidad=vel;
	}
	public int getVelocidad()
	{
		return Velocidad;
	}
	public void setLlantas(Llantas [] wheel)
	{
		Llanta=wheel;
	}
	public Llantas[] getLlantas()
	{
		return Llanta;
	}
}
