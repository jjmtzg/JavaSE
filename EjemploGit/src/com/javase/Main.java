package com.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

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
import com.javase.ejemplo.herencia.venta.CajaFrutas;
import com.javase.ejemplo.herencia.venta.Fruta;
import com.javase.ejemplo.herencia.venta.Refrigerador;
import com.javase.ejemplo.herencia.venta.fruta.Banana;
import com.javase.ejemplo.herencia.venta.fruta.Papaya;
import com.javase.ejemplo.herencia.venta.fruta.Sandia;
public class Main 
{
	//public static long id;
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
		Refrigerador refri=new Refrigerador();
		refri.setTemperatura(3);
		//System.out.println(refri.getTemperatura());
		CajaFrutas fruitBox = new CajaFrutas();
		Papaya papaya=new Papaya();
		Sandia sandia=new Sandia();
		Banana banana=new Banana();
		ArrayList<Fruta> listaFruta=new ArrayList<Fruta>();
		/*Vector<Fruta> vect=new Vector<>();
		vect.add(banana);
		System.out.println(vect.elementAt(0).getExpiracion());*/
		for (int i = 0; i < 1; i++) 
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
		int i=0;
		while(itr.hasNext())
		{
			Object itr2=(itr.next());
			cad=(itr2.getClass().getName().substring(1+itr2.getClass().getName().lastIndexOf(".")));
			if(itr2.equals(sandia))
				System.out.println("Soy una sand�a");
			else if(itr2.equals(banana))
				System.out.println("--Soy una banana");
			else
				System.out.println("Semillas: "+((Papaya)listaFruta.get(i)).getSemillas());
			i++;
		}
		listaFruta.add(sandia);
		System.out.println("Cantidad Frutas: "+listaFruta.size());
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
		
	}
	
	
}
