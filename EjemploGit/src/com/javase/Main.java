package com.javase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.javase.ejemplo.herencia.venta.Clavija;
import com.javase.ejemplo.herencia.venta.fruta.Papaya;
import com.javase.ejemplo.lambda.Producto;
import com.javase.ejemplo.lambda.Prueba;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Vector;
//import com.javase.codefight.tournament;
//import com.javase.ejemplo.herencia.Garfield;
//import com.javase.ejemplo.herencia.Animal;
//import com.javase.ejemplo.herencia.Nermal;
//import com.javase.ejemplo.herencia.pokemon.Pokedex;
//import com.javase.ejemplo.herencia.pokemon.Pokemon;
//import com.javase.ejemplo.herencia.pokemon.tipo.Electrico;
//import com.javase.codefight.KathoVsSuperMario;
//import com.javase.ejemplo.modificador.Modificadores;
//import com.javase.ejemplo.herencia.carro.Familia;
//import com.javase.ejemplo.herencia.venta.CajaFrutas;
//import com.javase.ejemplo.herencia.venta.Fruta;
//import com.javase.ejemplo.herencia.venta.Refrigerador;
//import com.javase.ejemplo.herencia.venta.fruta.Banana;
//import com.javase.ejemplo.herencia.venta.fruta.Papaya;
//import com.javase.ejemplo.herencia.venta.fruta.Sandia;
public class Main 
{
	//public static long id;
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		/*String cad1="",cad2="s";
		int i=0,j=1,r;
		float d=3.141592678f,c=10.3443434343f,rf;
		System.out.println("Suma: "+(r=i+j)+"\n"+(j+d));*/
		/*int a=8,b=81,c=2;
		double x1,x2;
		System.out.println((x1=((-b)+Math.sqrt((b^2)-(4*a*c)))/(2*a))+"\n"+
				(x2=((-b)-Math.sqrt((b^2)-(4*a*c)))/(2*a)));*/
		//ManejoString s=new ManejoString();
		//ManejoArray a=new ManejoArray();
		//ManejoEstructuraControl cntrl=new ManejoEstructuraControl();
		//cntrl.ManejoIf();
		//cntrl.ManejoElseIf();
		//cntrl.ManejoCase();
		//ManejoCiclo cl=new ManejoCiclo();
		//cl.While();
		//cl.cuentaLetras(7);
		//ManejoExcepciones ex=new ManejoExcepciones();
		//ex.punteroNulo();
		//ex.fueraDeLimite();
		//Estudiante e=new Estudiante();
		//e.setCodigo(378);
		//e.setNombre("Juancho");
		//System.out.println(e.getCodigo()+e.getNombre());
		//Estudiante e = new Estudiante(123,"holo");
		//System.out.println(e.getCodigo()+e.getNombre());
		//Modificadores.tipoEstatico();
		//KathoVsSuperMario vs=new KathoVsSuperMario();
		//int[]time={0,5},time2={1,0};
		//System.out.println(vs.isEarlier(time,time2 ));
		//Oddie o=new Oddie();
		//o.comer();
		//o.dormir();
		//o.ladrar();//
		//Garfield g=new Garfield();
		//g.comer();
		//g.comer("Lasagna");
		//Nermal n=new Nermal();
		//n.molestar(g.getNombre());
		//Electrico pkm=new Electrico("Picachu");
		//Pokedex pkdx=new Pokedex(pkm);
		//int[] a={2,5},b={3,6},c={0,0};
		//tournament t=new tournament();
		//c[0]=t.fractionDivision(a, b)[0];
		//c[1]=t.fractionDivision(a, b)[1];
		//System.out.println(c[0]+"f"+c[1]);
		//Familia car= new Familia();
		//car.setVelocidad(50);
		//System.out.println(car.getVelocidad()+" "+car.getSize()+""+car.getLlantas()[1]);
		//Refrigerador refri=new Refrigerador();
		//refri.setTemperatura(3);
		//System.out.println(refri.getTemperatura());
		//CajaFrutas fruitBox = new CajaFrutas();
		//Papaya papaya=new Papaya();
		//Sandia sandia=new Sandia();
		//Banana banana=new Banana();
		//ArrayList<Fruta> listaFruta=new ArrayList<Fruta>();
		/*Vector<Fruta> vect=new Vector<>();
		vect.add(banana);
		System.out.println(vect.elementAt(0).getExpiracion());*/
		/*for (int i = 0; i < 10; i++) 
		{
			listaFruta.add(papaya);
			listaFruta.add(sandia);
			listaFruta.add(banana);
		}
		listaFruta.add(sandia);
		listaFruta.add(sandia);
		listaFruta.add(sandia);
		listaFruta.add(sandia);
		Iterator<Fruta> itr=listaFruta.iterator();
		String cad="";
		int i=0;*/
		/*while(itr.hasNext())
		{
			Object itr2=(itr.next());
			cad=(itr2.getClass().getName().substring(1+itr2.getClass().getName().lastIndexOf(".")));
			if(itr2.equals(sandia))
				System.out.println("Soy una sandía");
			else if(itr2.equals(banana))
				System.out.println("--Soy una banana");
			else
				System.out.println("Semillas: "+((Papaya)listaFruta.get(i)).getSemillas());
			i++;
		}*/
		//listaFruta.add(sandia);
		//System.out.println("Cantidad Frutas: "+listaFruta.size());
		/*HashMap<Integer, String> miMapa = new HashMap<Integer,String>();
		miMapa.put(100, "Chana");
		miMapa.put(101, "Juana");
		miMapa.put(102, "Primitivo");
		miMapa.put(103, "Primitivo");
		for (Map.Entry entry : miMapa.entrySet()) 
		{
			System.out.println("Entrada"+entry.getKey()+" : "+entry.getValue());
		}*//*
		Hashtable<Integer, String> hashtable=new Hashtable<Integer,String>();
		hashtable.put(100, "Chana");
		hashtable.put(101, "Juana");
		hashtable.put(102, "Primitivo");
		hashtable.put(103, "Primitivo");
		for(Map.Entry entrada:hashtable.entrySet())
		{
			System.out.println("Llave"+entrada.getKey()+"Valor"+entrada.getValue());
		}*/
		//Papaya papaya=new Papaya();
		//papaya.setExpiracion(5);
		//Papaya papayadif=new Papaya();
		//papayadif.setExpiracion(8);
		/*Sandia sandia=new Sandia();
		sandia.setExpiracion(7);
		Banana banana=new Banana();
		banana.setExpiracion(3);
		Papaya[] papayas=new Papaya[4];
		Sandia[] sandias=new Sandia[5];
		Banana[] bananas=new Banana[3];
		for(int i=0; i<papayas.length;i++)
		{
			
			papayas[i]=new Papaya();
			papayas[i].setExpiracion(i+2);
		}
		//papayas[2].setExpiracion(papayas.length+2);
		//papayas[3]=papayadif;
		for(int i=0; i<sandias.length;i++)
		{
			sandias[i]=new Sandia();
			sandias[i].setExpiracion(i);
		}
		for(int i=0; i<bananas.length;i++)
		{
			bananas[i]=banana;
		}
		fruitBox.setBananas(bananas);
		fruitBox.setPapayas(papayas);
		fruitBox.setSandias(sandias);
		refri.setFruitBox(fruitBox);
		//for(int i=0;i<refri.getFruitBox().getBananas().length;i++)
		//{
			//refri.getFruitBox().getExpiracionFrutas();//[i].getExpiracion());
		refri.getFruitBox().getInformacionFrutas();
		//}*/
		/*Scanner lector =new Scanner(System.in);
		System.out.println("Ingrese algo");
		int algo=lector.nextInt();
		assert algo>=60:"Estas Shavo shavo";
		System.out.println("Value of"+algo);*/
		/*for(Mi m:Mi.values())
		{
			System.out.println(m);
		}*/
		//Sin Lambda
		/*Clavija miClavija=new Clavija() 
		{
			@Override
			public void conectarse() 
			{
				// TODO Auto-generated method stub
				System.out.println("Sin lloLambda");
			}
		};
		miClavija.conectarse();
		
		//Con Lambda
		Clavija miClavija2=()->
		{
			System.out.println("Maricarmen");
			
		};
		miClavija2.conectarse();
		Prueba prueba=algo->
		{
			return algo;
		};
		System.out.println("Otra clase\n"+prueba.algoMas("Mica.\nMica?\nMi Cadena jajajaja"));*/
		/*Papaya papayas=new Papaya();
		ArrayList<Papaya> lista=new ArrayList<Papaya>();
		for (int i = 0; i < 1000; i++) 
		{
			lista.add(papayas);
		}
		lista.forEach(n->
		{
			System.out.println(n.getExpiracion());
			System.out.println(n.getColor());
		});*/
		List<Producto> productos=new ArrayList<Producto>();
		productos.add(new Producto(1,"Banana",12));
		productos.add(new Producto(2,"Manzana",4));
		productos.add(new Producto(3,"Berenjena",20));
		System.out.println("Ordenando la coleccion en base a parametro de nombre creo espero y confio");
		Collections.sort(productos,(p1,p2)->{
			return String.valueOf(p1.nombre).compareTo(String.valueOf(p2.nombre));
		});
		productos.forEach(p->{
			System.out.println("Producto"+p.id+" : "+p.nombre+" : "+p.precio);
		});
	}
	
	/*
	public enum Mi
	{
		LUNES, MARTES, MIERCOLES, JUEVES, SABADO, DOMINGO
	}*/
	
}
