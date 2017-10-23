package com.javase.ejemplo.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public Archivos() {
		// TODO Auto-generated constructor stub
	}
	public void leerArchivos(String archivo)
	{
		try
		{
			BufferedReader bfrd=new BufferedReader(new FileReader(archivo));
			String s="";
			bfrd.lines().forEach(s1->{System.out.println(s1);});
		}
		catch(FileNotFoundException e)
		{
			System.err.println("El arshivo no c encuentra mi shavo");
			e.printStackTrace();
		} catch (IOException e) 
		{
			System.err.println("Aun no c ler");
			e.printStackTrace();
		}
	}
}
