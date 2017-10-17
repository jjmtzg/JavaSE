package com.javase.ejemplo;
import java.util.Scanner;

public class ManejoEstructuraControl 

{
	private boolean b,c;
	public ManejoEstructuraControl() 
	{
		
	}
	public void ManejoIf()
	{
		b=true;
		c=false;
		System.out.println(b||c);
		if(b==c)
			System.out.println("chana");
		else
			System.out.println("Juana");
	}
	public void ManejoElseIf()
	{
		b=true;
		c=false;
		if(b==c)
			System.out.println("chana");
		else if(b==c)
			System.out.println("Juana");
		else if(b==c)
				System.out.println("Melon");
		else if(!b==!c)
			System.out.println("Sandia");
		else if(!(b==!c))
			System.out.println("La vieja del otro dia");
		else
			System.out.println("Ni Modo");
	}
	public void ManejoCase()
	{
		Scanner sc=new Scanner(System.in);
		String cad="";
		String opc="";
		do
		{
			System.out.println("Escriba el caso");
			cad=sc.nextLine();
			switch(cad.toLowerCase())
			{
				case"chana":
					System.out.println("Chana!");
					break;
				case"juana":
					System.out.println("Juana!");
					break;
				case"chona":
					System.out.println("Chona!");
					break;
				default:
					System.out.println("Ninguno compa");
					break;
			}
			System.out.println("Quiere Continuar y/n");
			opc=sc.nextLine();
		}while(!(opc.equals("n")));
		System.err.println("Salimos...");
		sc.close();
	}
}
