package com.javase.ejemplo.herencia.venta;

import com.javase.ejemplo.herencia.venta.fruta.Banana;
import com.javase.ejemplo.herencia.venta.fruta.Papaya;
import com.javase.ejemplo.herencia.venta.fruta.Sandia;

public class CajaFrutas 
{
	private Banana[] bananas;
	private Sandia[] sandias;
	private Papaya[] papayas;
	public CajaFrutas() 
	{
		
	}
	public Banana[] getBananas() 
	{
		return bananas;
	}
	public void setBananas(Banana[] bananas) 
	{
		this.bananas = bananas;
	}
	public Sandia[] getSandias() 
	{
		return sandias;
	}
	public void setSandias(Sandia[] sandias) 
	{
		this.sandias = sandias;
	}
	public Papaya[] getPapayas() 
	{
		return papayas;
	}
	public void setPapayas(Papaya[] papayas) 
	{
		this.papayas = papayas;
	}
	public void getExpiracionFrutas()
	{
		for(int i=0;i<getBananas().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Expira en:"+getBananas()[i].getExpiracion()+" días.");
		}
		System.out.println();
		for(int i=0;i<getSandias().length;i++)
		{
			System.out.println("La Sandia "+(i+1)+" Expira en:"+getSandias()[i].getExpiracion()+" días.");
		}
		System.out.println();
		for(int i=0;i<getPapayas().length;i++)
		{
			System.out.println("La Papaya "+(i+1)+" Expira en:"+getPapayas()[i].getExpiracion()+" días.");
		}
	}
	public void getTamanioFrutas()
	{
		for(int i=0;i<getBananas().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Es talla: "+getBananas()[i].getTamanio());
		}
		System.out.println();
		for(int i=0;i<getSandias().length;i++)
		{
			System.out.println("La Sandia "+(i+1)+" Es talla: "+getSandias()[i].getTamanio());
		}
		System.out.println();
		for(int i=0;i<getPapayas().length;i++)
		{
			System.out.println("La Papaya "+(i+1)+" Es talla: "+getPapayas()[i].getTamanio());
		}
	}
	public void getColorFrutas()
	{
		for(int i=0;i<getBananas().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Es de color: "+getBananas()[i].getColor());
		}
		System.out.println();
		for(int i=0;i<getSandias().length;i++)
		{
			System.out.println("La Sandia "+(i+1)+" Es de color: "+getSandias()[i].getExpiracion());
		}
		System.out.println();
		for(int i=0;i<getPapayas().length;i++)
		{
			System.out.println("La Papaya "+(i+1)+" Es de color: "+getPapayas()[i].getExpiracion());
		}
	}
	public void getInformacionFrutas()
	{
		System.out.println("Hay "+getBananas().length+" Bananas");
		for(int i=0;i<getBananas().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Expira en: "+getBananas()[i].getExpiracion()+" días."+
					" Es de color: "+getBananas()[i].getColor()+". Es talla: "+getBananas()[i].getTamanio());
		}
		System.out.println("Hay "+getSandias().length+" Sandias");
		for(int i=0;i<getSandias().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Expira en: "+getSandias()[i].getExpiracion()+" días."+
					" Es de color: "+getSandias()[i].getColor()+". Es talla: "+getSandias()[i].getTamanio());
		}
		System.out.println("Hay "+getPapayas().length+" Papayas");
		for(int i=0;i<getPapayas().length;i++)
		{
			System.out.println("La Banana "+(i+1)+" Expira en:"+getPapayas()[i].getExpiracion()+" días."+
					" Es de color: "+getPapayas()[i].getColor()+". Es talla: "+getPapayas()[i].getTamanio());
		}
	}
}
