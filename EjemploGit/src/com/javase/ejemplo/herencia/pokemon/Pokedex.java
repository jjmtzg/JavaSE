package com.javase.ejemplo.herencia.pokemon;

public class Pokedex 
{

	public Pokedex(Pokemon pkmn) {
		System.out.println("El es: "+pkmn.getNombre()+" de tipo "+
		pkmn.getTipo()+
		". Es de nivel: "+pkmn.getNivelEvolucion()+
		". Su Ataque es: "+pkmn.getNivelAtaque()+
		". Su Defensa es: "+pkmn.getNivelDefensa());
	}
	
}
