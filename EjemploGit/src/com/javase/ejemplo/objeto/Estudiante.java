package com.javase.ejemplo.objeto;

import com.javase.ejemplo.ManejoEstructuraControl;

public class Estudiante extends ManejoEstructuraControl
{
	private int codigo;
	private String nombre;
	public Estudiante() 
	{
		
	}
	public Estudiante(int codigo,String nombre)
	{
		setCodigo(codigo);
		setNombre(nombre);
	}
	public int getCodigo()
	{
		return codigo;
	}
	public void setCodigo(int codigo)
	{
		this.codigo=codigo;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
}
