package batalha;


import java.util.Random;



public class WildBattleControls extends Controller{
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
	private char local = ' ';
	private static char aux = ' ';
	private static boolean battle=false;
	
	private Pokemon[] teamRed = {But, Squi, Venu, Pika, Bul, War};

	
	private Potion spotion = new Potion("SoftCure Potion", 40);
	private Potion cpotion = new Potion("PokeNormalCure", 80);
	private Potion mcpotion = new Potion("InsaneCure", 150);
	
	private Item[] itemBag= {spotion,cpotion,mcpotion};
	
	private Treinador Ash = new Treinador("Ash", teamRed, itemBag,3);

		
	private Treinador ofens = Ash;
	Selvagem h = new Selvagem();
	private Treinador defens = h.wild();
	
	private static int k=1;

	
	private static boolean wbattle=true;
	
	private int i=0, j=0; 
	private char[][] map = {
					{ 'T', ' ', ' ', ' ', ' ' , ' ', ' '}, 
					  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},
					  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},			
					  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '},
					  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
					  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
					  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '}};
	
	public void mapa() {
		int x=0;
		int y=0;
		
		
		
		
		
	}
	
	class Move extends Event{

		
		public Move(long eventTime) {
			super(eventTime);
			
		}

		public void action() {
			Random gerador = new Random();
			int n= gerador.nextInt(4);
			
			
			if(n == 0) { 
				if(j > 0){
					local=aux;
					map[i][j] = local;
					j-= 1;
					if(map[i][j]=='g') {
						double num = Math.random();
						if(num>0.5) {
							wbattle=true;
						}
						else
							aux='g';
					}
					else {
						map[i][j] = 'T';
						aux=' ';
					}
					
				}
			}
			if(n == 1) {
				if(i > 0) {
					local=aux;
					map[i][j] = local;
					i-= 1;
					if(map[i][j]=='g') {
						double num = Math.random();
						if(num>0.5) {
							wbattle=true;
						}
						else
							aux='g';
					}
					else {
						map[i][j] = 'T';
						aux=' ';
					}
					
				}
			}
			if(n == 2) {
				if(j<6){
					local=aux;
					map[i][j] = local;
					j+= 1;
					if(map[i][j]=='g') {
						double num = Math.random();
						if(num>0.5) {
							wbattle=true;
						}
						else
							aux='g';
					}
					else {
						map[i][j] = 'T';
						aux=' ';
					}
					
				}
			}
			if(n == 3) {
				if(i < 6){
					local=aux;
					map[i][j] = local;
					i+= 1;
					if(map[i][j]=='g') {
						double num = Math.random();
						if(num>0.5) {
							wbattle=true;
						}
						else
							aux='g';
					}
					else {
						map[i][j] = 'T';
						aux=' ';
					}
					
				}
			}
		}

		public String description() {
			
		if(battle=true)
			return "Pokemon Selvagem apareceu";
		else
			return "";
		}
		
	}
	private class TrocarPokemon extends Event { // Classe de troca de Pokemons
		Treinador T1;
		
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
				return ofens.getName() + " trocou seu Pokemon\n"+ofens.getTeamMember(ofens.getAP()).getNome()+" entrou na batalha";
		
		}
			return null;
	}
	}
	private double TypeAdv(String atac, String def) {
		if(atac == "Fogo" && def == "Grama" || atac == "Fogo" && def == "Inseto") return 10.0;
		else if(atac == "Fogo" && def == "Agua") return 1.0;
		else if(atac == "Grama" && def == "Agua") return 10.0;
		else if(atac == "Grama" && def == "Inseto") return 1.0;
		else if(atac == "Inseto" && def == "Grama" || atac == "Inseto" && def == "Lutador") return 10.0;
		else if(atac == "Inseto" && def == "Fogo") return 1.0;
		else if(atac == "Agua" && def == "Fogo") return 10.0;
		else if(atac == "Agua" && def == "Grama") return 1.0;
		else if(atac == "Eletrico" && def == "Agua") return 10.0;
		else if(atac == "Eletrico" && def == "Grama") return 1.0;
		else if(atac == "Lutador" && def == "Inseto") return 1.0;
		else return 1;
		
	}
	
	private class PokeAtack extends Event { // Classe de Luta
		Treinador at;
		Treinador def;

		Random gerador = new Random();
		int atk = gerador.nextInt(4);
	
				
		public PokeAtack(long eventTime, Treinador P1, Treinador P2) {
			super(eventTime);
			at = P1;
			def = P2;
			
		}
		
		public void action() {
			int standarddeffence=5;

			int d= (int) at.getTeamMember(at.getAP()).moves[atk].DamageCalculate(at.getTeamMember(at.getAP()).moves[atk].getDamage(), standarddeffence, TypeAdv(at.getTeamMember(at.getAP()).getType(), def.getTeamMember(def.getAP()).getType()));
			def.getTeamMember(def.getAP()).Decreasedmg(d);
			if(def.getTeamMember(def.getAP()).isDefeated()) {
				def.setN_alivePokemon(def.getN_alivePokemon()-1);
			}
			
		
						
			
		}
		public String description() {
			
			return ofens.getName() + "'s " +  at.getTeamMember(at.getAP()).getNome()+ " usou " + at.getTeamMember(at.getAP()).moves[atk].getMove()+" !\n"+
					def.getTeamMember(def.getAP()).getNome() + " tem HP "+ def.getTeamMember(def.getAP()).getCurrentHP();
		}
	}
	
	
	
	private class HealPokemon extends Event { // Classe de Luta
		Pokemon poke;
		Potion cure;

		public HealPokemon(long eventTime, Pokemon poke, Item cure) {
			super(eventTime);
			this.poke=poke;
			this.cure=(Potion) cure;
		}
		public void action() {
			cure.HealHP(cure, poke);
		}
	
		public String description() {
			return poke.getNome() + " was healed\n"+poke.getNome()+" HP "+ poke.getCurrentHP();
		}
	}
	
	private class RunAway extends Event { // Classe de troca de Pokemons
		Treinador T1;
		Treinador T2;

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
		
		}



		public void action() {
			long tm = System.currentTimeMillis();
			double n;
			if(k%2==0)
				n=0.7;
			else
				n = Math.random();
				if (n < 0.80){
					
					addEvent(new PokeAtack(tm+1000,ofens, defens));
				}
				else if (n < 0.85) 
					addEvent(new TrocarPokemon(tm+1000,ofens));
				
				else if (n < 0.95) {
					if(ofens.getNintens()!=0)	{			
					addEvent(new HealPokemon(tm+1000,ofens.getTeamMember(ofens.getAP()),ofens.getItem(3- ofens.getNintens())));
					ofens.setNintens(ofens.getNintens()-1);
					}
				}
				else {
					addEvent(new RunAway(tm+1000,ofens, defens));
					battle=false;
				}
				if(defens.getN_alivePokemon()!=0) {
					if(defens.getTeamMember(defens.getAP()).isDefeated()) {
						defens.setAP(defens.nextAP());
					}
				}
					else 
						battle=false;
				if(battle) {
					Treinador aux = ofens;
					ofens = defens;
					defens = aux;
					k+=1;
				}

		}

		public String description() {
		
			return "";
		}
	}
	public static void main(String[] args) throws InterruptedException {
		WildBattleControls wbc = new WildBattleControls();
		long tm = System.currentTimeMillis();
		while(WildBattleControls.wbattle == false) {
			wbc.addEvent(wbc.new Move(tm));
			wbc.mapa();
			wbc.run();			
			
		}
		while (WildBattleControls.wbattle == true) {
			wbc.addEvent(wbc.new NovaRodada(tm));
			wbc.run();
		}
		
		
		
		
		
}

	

}
