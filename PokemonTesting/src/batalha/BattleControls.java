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
	
	private class TrocarPokemon extends Event {
		Treinador P1;
		Treinador P2;
		boolean nextPokemon;
		public TrocarPokemon (long eventTime, Treinador P1, Treinador P2) {
			super(eventTime);
			this.P1 = P1;
			this.P2 = P2;
		}
		public void action() {
			nextPokemon = P1.nextPA();
		}
		public String description() {
			if(!nextPokemon){
				return P2.getName() + " defeated " + P1.getName() + "!\n" + P2.getName() + " got $2000 for winning!";
			}
			else{
				return P1.getName() + " sent out " + P1.getTeamMember(P1.getAP()).getName() + "!\n";
			}
		}
	}
	
	private class PokeAtack extends Event {
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
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		BattleControls bc = new BattleControls();	
		
		
		
		
}

}