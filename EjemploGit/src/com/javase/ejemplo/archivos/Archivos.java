package com.javase.ejemplo.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
//import java.util.Properties;
import java.util.Scanner;

import com.google.gson.Gson;

public class Archivos {
	int n=1;
	public Archivos() {
		// TODO Auto-generated constructor stub
	}
	public void leerArchivos(String archivo)
	{
		try
		{
			BufferedReader bfrd=new BufferedReader(new FileReader(archivo));
			int nLinea=new Scanner(System.in).nextInt();
			bfrd.lines().forEach(s->{if(n==nLinea)System.out.println(n+" "+s);n++;});
			bfrd.close();
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
	public void escribirArchivos(String archivo)
	{
		List<String> datos=Arrays.asList("Que","Pedro","Juan");
		Iterator itr=datos.iterator();
		try
		{
			PrintWriter printWriter=new PrintWriter(new BufferedWriter(new FileWriter(archivo)));
			datos.forEach(s->{printWriter.println(itr.next());});
			printWriter.close();
			System.out.println("Jackeline");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void serializarObjeto(String archivo)
	{
		Gson gson=new Gson();
		Gson gson2=new Gson();
		try
		{
			LocalTime tiempo = LocalTime.now();
			String json=gson.toJson(tiempo);
			FileWriter writer = new FileWriter(archivo);
			writer.write(json);
			writer.close();
			
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		} 
	}
	
}
