package com.javase.ejemplo.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
	int n=0;
	public Archivos() {
		// TODO Auto-generated constructor stub
	}
	public void leerArchivos(String archivo)
	{
		try
		{
			BufferedReader bfrd=new BufferedReader(new FileReader(archivo));
			int nLinea=new Scanner(System.in).nextInt();
			bfrd.lines().forEach(s->{n++;if(n==nLinea)System.out.println(n+" "+s);});
			
		}
		catch(FileNotFoundException e)
		{
			System.err.println("El arshivo no c encuentra mi shavo");
			e.printStackTrace();
		} catch (IOException e) 
		{
			System.err.println("Aun no c ler :(");
			e.printStackTrace();
		}
	}
}
