package batalha;


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
	
	private class TrocarPokemon extends Event { // Classe de troca de Pokemons
		Treinador T1;
		Treinador T2;
		boolean nextPokemon;
		public TrocarPokemon (long eventTime, Treinador t1, Treinador t2) {
			super(eventTime);
			this.T1 = t1;
			this.T2 = t2;
		}
		public void action() {
			nextPokemon = T1.nextAP();
		}
		
		public String description() {
			if(!nextPokemon){
				return T2.getName() + " DEFEATED " + T1.getName() + "!\n" + T2.getName() + " WON";
			}
			else{
				return T1.getName() + " SENT AWAY " + T1.getTeamMember(T1.getAP()).getNome() + "!\n";
			}
		}
	}
	
	private class PokeAtack extends Event { // Classe de Luta
		Treinador at;
		Treinador def;
		int i;
		int damage;
		public PokeAtack(long eventTime, Treinador P1, Treinador P2, int move) {
			super(eventTime);
			at = P1;
			def = P2;
			i = move;
		}
		public void action() {
	
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

	
	public static void main(String[] args) throws InterruptedException {
		BattleControls bc = new BattleControls();	
		
		
		
		
}

}