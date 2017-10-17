import static fechas.MesesYDias.MESES;

import java.io.IOException;
import java.util.Scanner;
public class ManejoExcepciones {
	ClaseError err;
	public ManejoExcepciones() {
	}
	void punteroNulo()
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
	void fueraDeLimite()
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
	void formatoIncorrecto()
	{
		try
		{
		}catch(NumberFormatException ex)
		{
			
		}
	}
	void convertirClase()
	{

		try
		{
		}catch(ClassCastException ex)
		{
			
		}
	}
}
