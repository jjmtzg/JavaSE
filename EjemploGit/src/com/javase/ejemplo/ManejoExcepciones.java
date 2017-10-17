package com.javase.ejemplo;
import static com.javase.valores.fechas.MesesYDias.MESES;

public class ManejoExcepciones 
{
	ClaseError err;
	public ManejoExcepciones() 
	{
	}
	public void punteroNulo()
	{
		try
		{
			err.falla();
		}catch(NullPointerException ex)
		{
			System.out.println("ñel");
		}finally{
			System.out.println("Ya voy saliendo Papus");
		}
		System.out.println("Ya sali prros a donde vamos o khe");
	}
	public void fueraDeLimite()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(MESES[i]);
			}

		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ñel");
		}finally{
			System.out.println("Ya voy saliendo Papus");
		}
		System.out.println("Ya sali prros a donde vamos o khe");
	}
	public void formatoIncorrecto()
	{
		try
		{
		}catch(NumberFormatException ex)
		{
			
		}
	}
	public void convertirClase()
	{

		try
		{
		}catch(ClassCastException ex)
		{
			
		}
	}
}
