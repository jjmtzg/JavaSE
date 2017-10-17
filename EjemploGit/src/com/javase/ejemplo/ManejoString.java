package com.javase.ejemplo;

public class ManejoString {

	public ManejoString()
	{
		String cadena="Parangaricutirimicuaro";
		System.out.println(cadena);
			//Criptografía Cesar
		String cadenaCesar="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio=3;//Delimitamos a partir de donde cambia
		for(int i=0;i<cadena.length();i++)
		{
			System.out.println(cadena.charAt(i));//Observamos cambios
			cadena=(cadena.replace(cadena.charAt(i), cadenaCesar.charAt(i+espacio)));//Guardamos en la cadena cada cambio
		}
		System.out.println(cadena);
		System.out.println(cadena.substring(0,2)+cadena.substring(2, 6).toLowerCase()+cadena.substring(6));
		System.out.println(cadena.toLowerCase());
	}
}
