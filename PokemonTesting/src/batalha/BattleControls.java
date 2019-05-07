package batalha;

import java.util.Random;


public class BattleControls extends Controller  {
	private Pokemon Chari = new Charizard();
	private Pokemon Bla = new Blastoise();
	private Pokemon Venu = new Venusaur();
	private Pokemon Pika = new Pikachu();
	private Pokemon Ivy = new Ivysaur();
	private Pokemon Mander = new Charmander();
	private Pokemon Meleon = new Charmeleon();
	private Pokemon Squi = new Squirtle();
	private Pokemon War = new Wartortle();
	private Pokemon But = new Butterfree();
	private Pokemon	Pri = new Primeape();
	private Pokemon Bul = new Bulbasaur();
	
	
	private Pokemon[] teamRed = {But, Squi, Venu, Pika, Bul, War};
	private Pokemon[] teamBlue = {Meleon, Chari, Ivy,Pri,Bla,Mander};
	
	private Potion spotion = new Potion("SoftCure Potion", 40);
	private Potion cpotion = new Potion("PokeNormalCure", 80);
	private Potion mcpotion = new Potion("InsaneCure", 150);
	
	private Item[] itemBag= {spotion,cpotion,mcpotion};
	
	private Treinador Ash = new Treinador("Ash", teamRed, itemBag);
	private Treinador Ethan = new Treinador("Ethan", teamBlue, itemBag );
	
	private static boolean battle=true;
	
	private class TrocarPokemon extends Event { // Classe de troca de Pokemons
		Treinador T1;
		Treinador T2;
		int nextPokemon;
		public TrocarPokemon (long eventTime, Treinador t1) {
			super(eventTime);
			this.T1 = t1;
			
		}
		public void action() {
			nextPokemon = T1.nextAP();
		}
		
		public String description() { // a verificar
			if(nextPokemon>=0){
				return "";
		
		}
			return null;
	}
	}
	
	private double TypeAdv(String atac, String def) {
		if(atac == "Fogo" && def == "Grama" || atac == "Fogo" && def == "Inseto") return 2.0;
		else if(atac == "Fogo" && def == "Agua") return 0.5;
		else if(atac == "Grama" && def == "Agua") return 2.0;
		else if(atac == "Grama" && def == "Inseto") return 0.5;
		else if(atac == "Inseto" && def == "Grama" || atac == "Inseto" && def == "Lutador") return 2.0;
		else if(atac == "Inseto" && def == "Fogo") return 0.5;
		else if(atac == "Agua" && def == "Fogo") return 2.0;
		else if(atac == "Agua" && def == "Grama") return 0.5;
		else if(atac == "Eletrico" && def == "Agua") return 2.0;
		else if(atac == "Eletrico" && def == "Grama") return 0.5;
		else if(atac == "Lutador" && def == "Inseto") return 0.5;
		else return 1;
		
	}
	
	private class PokeAtack extends Event { // Classe de Luta
		Treinador at;
		Treinador def;
		int i;
		int damage;
		Random gerador = new Random();
		int atk = gerador.nextInt(4);
	
				
		public PokeAtack(long eventTime, Treinador P1, Treinador P2) {
			super(eventTime);
			at = P1;
			def = P2;
			
		}
		
		public void action() {
			int standarddeffence=30;
			// pegar o ataque do pokemon atual do Treinador atacante
			// diminur o HP do Pokemon atual do Treinador defensor
			// double typeAdv=0.5;
			int d= (int) at.getTeamMember(at.getAP()).moves[atk].DamageCalculate(at.getTeamMember(at.getAP()).moves[atk].getDamage(), standarddeffence, TypeAdv(at.getTeamMember(at.getAP()).getType(), def.getTeamMember(def.getAP()).getType()));
			def.getTeamMember(def.getAP()).Decreasedmg(d);
			if(def.getTeamMember(def.getAP()).isDefeated()) {
				def.setN_alivePokemon(def.getN_alivePokemon()-1);
			}
			
		
						
			
		}
		public String description() {
			
			return at.getTeamMember(at.getAP()).getNome()+ " usou " + at.getTeamMember(at.getAP()).moves[atk].getMove()+" !\n"+
					def.getTeamMember(def.getAP()).getNome() + "tem HP "+ def.getTeamMember(def.getAP()).getCurrentHP();
		}
	}
	
	
	
	private class HealPokemon extends Event { // Classe de Luta
		Pokemon poke;
		Potion cure;

		public HealPokemon(long eventTime, Pokemon poke, Potion cure) {
			super(eventTime);
			this.poke=poke;
			this.cure=cure;
		}
		public void action() {
			cure.HealHP(cure, poke);
		}
	
		public String description() {
			return poke.getNome() + "was healed";
		}
	}
	
	private class RunAway extends Event { // Classe de troca de Pokemons
		Treinador T1;
		Treinador T2;
		boolean nextPokemon;
		public RunAway (long eventTime, Treinador t1, Treinador t2) {
			super(eventTime);
			this.T1 = t1;
			this.T2 = t2;
		}
		public void action() {
			T1.setDefeated(true);
			T1.setFighting(false);
		}
		
		public String description() {
			return T1.getName() + " RUN AWAY! " + "!\n" + T2.getName() + " WON!";
		}
	}
	class NovaRodada extends Event {
		public NovaRodada(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}



		public void action() {
			long tm = System.currentTimeMillis();
			
			
				double n = Math.random();
				if (n < 0.90){
					
						addEvent(new PokeAtack(tm,t1,t2);
				}
				else if (n < 0.95)
					addEvent(new TrocarPokemon();
				else if (n < 0.98)
					addEvent(new HealPokemon();	
				else
					addEvent(new RunAway();
			
			

		}

		public String description() {
		
			return "";
		}
	}
	
	
/*
	public class NovaRodada {
		
	
		private Treinador Atacante;
		private Treinador Defensor;
		 
		public NovaRodada(Treinador T1, Treinador T2) {
			Atacante = T1;
			Defensor = T2;
		}
		
		public void action (Treinador at,Treinador def) {
			
			
		}
		public String description() {
			return "" ;
		}
	}

		public class FimRodada {
			
		
			private Treinador at;
			private Treinador def;
			 
			public FimRodada(Treinador T1, Treinador T2) {
				at = T1;
				def = T2;
			}
			
			public void action (Treinador at,Treinador def) {
				if(def.getN_alivePokemon()!=0) {
					if(def.getTeamMember(def.getAP()).isDefeated()) {
						def.setAP(def.nextAP());
					}
					else {
						battle=false;
					}
				}
			}
			public void SwitchTrainer() {
				if(battle) {
					Treinador aux = at;
					at = def;
					def = aux;
				}
				
			}
				
				
			
			public String descricao() {
				if (!battle) {
					return at.getName()+" DEFEATED ! "+def.getName()+"\n"+ at.getName()+"WON!";
				}
				return "" ;
			}
		}
		*/
	/*	
		
		private BattleIsGoing bic = new BattleIsGoing(Atacante, Defensor);
		
		public void SwitchTrainer() {
			if(battle) {
				Treinador aux = Atacante;
				Atacante = Defensor;
				Defensor = aux;
			}
			
		}
		*/
	
		
	public static void main(String[] args) throws InterruptedException {
		BattleControls bc = new BattleControls();
		long tm = System.currentTimeMillis();
		while (bc.battle == true) {
			bc.addEvent(bc.new NovaRodada(tm));
			bc.addEvent(bc.new FimRodada(tm));
			bc.run();
		}
		
		
		
		
		
}

	
}
