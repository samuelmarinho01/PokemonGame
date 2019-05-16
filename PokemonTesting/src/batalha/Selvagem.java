package batalha;

import java.util.Random;

public class Selvagem {
	Random gerador = new Random();
	private int n= gerador.nextInt(12);
	private Pokemon poke;
	
	public Treinador wild() {
	if(n==0) 
		poke = new Charizard();
	else if(n==1)
		poke = new Blastoise();
	else if(n==2)
		poke = new Venusaur();
	else if(n==3)
		poke = new Pikachu();
	else if(n==4)
		poke = new Ivysaur();
	else if(n==5)
		poke = new Charmander();
	else if(n==6)
		poke = new Charmeleon();
	else if(n==7)
		poke = new Squirtle();
	else if(n==8)
		poke = new Wartortle();
	else if(n==9)
		poke = new Butterfree();
	else if(n==10)
		poke = new Primeape();
	else if(n==11)	
		poke = new Bulbasaur();
	
	Potion spotion = new Potion("SoftCure Potion", 40);
	Potion cpotion = new Potion("PokeNormalCure", 80);
	Potion mcpotion = new Potion("InsaneCure", 150);
	
	 Item[] itemBag= {spotion,cpotion,mcpotion};
	
	Pokemon[] teamYellow = {poke};
	Treinador Selvag = new Treinador("Pokemon Selvagem", teamYellow, itemBag,0);
	Selvag.setN_alivePokemon(1);
	return Selvag;
	}
}