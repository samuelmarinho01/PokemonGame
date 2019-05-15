package batalha;

public class WildBattleControls extends Crontroller{
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
	
	private Treinador Ash = new Treinador("Ash", teamRed, itemBag,3);
	private Treinador Ethan = new Treinador("Ethan", teamBlue, itemBag,3 );
		
	private Treinador ofens = Ash;
	private Treinador defens = Ethan;
	
	
	private static boolean battle=true;
	
	private char[][] map = {
					{ 'P', ' ', ' ', ' ', ' ' , ' ', ' '}, 
					  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},
					  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},			
					  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '},
					  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
					  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
					  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '}};
	
	public static void main(String[] args) throws InterruptedException {
		BattleControls wbc = new WildBattleControls();
		long tm = System.currentTimeMillis();
		while (WildBattleControls.battle == true) {
			wbc.addEvent(wbc.new NovaRodada(tm));
			wbc.run();
		}
		
		
		
		
		
}

	

}
