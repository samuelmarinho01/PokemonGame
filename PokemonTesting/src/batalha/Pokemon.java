package batalha;

public class Pokemon {
	private String nome;
	private String type;
	private int CurrentHP;
	final private int HPMAX;
	private int ID;
	protected Ataque ataque1 = new Ataque();
	protected Ataque ataque2 = new Ataque();
	protected Ataque ataque3 = new Ataque();
	protected Ataque ataque4 = new Ataque();
	private boolean defeated; 
	private boolean highestpriority=false; // se true significa que tem maior speed, maior iniciativa
	private static int npokemons;
	public Ataque[] moves = new Ataque[5] ;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCurrentHP() {
		return CurrentHP;
	}

	public void setCurrentHP(int currentHP) {
		CurrentHP = currentHP;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isDefeated() {
		return defeated;
	}

	public boolean isHighestpriority() {
		return highestpriority;
	}

	public void setHighestpriority(boolean highestpriority) {
		this.highestpriority = highestpriority;
	}

	public void setDefeated(boolean defeated) {
		this.defeated = defeated;
	}

	public static int getNpokemons() {
		return npokemons;
	}

	public Ataque getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(Ataque ataque1) {
		this.ataque1 = ataque1;
	}

	public Ataque getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(Ataque ataque2) {
		this.ataque2 = ataque2;
	}

	public Ataque getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(Ataque ataque3) {
		this.ataque3 = ataque3;
	}

	public Ataque getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(Ataque ataque4) {
		this.ataque4 = ataque4;
	}


	public int getHPMAX() {
		return HPMAX;
	}

	public Pokemon(String name, int n, int id, String Atk1, String Atk2, String Atk3, String Atk4, String type) {
		this.nome = name;
		this.ID=id;
		this.CurrentHP = n;
		this.HPMAX =n;
		this.ataque1.setNome(Atk1); 
		this.ataque2.setNome(Atk2);
		this.ataque3.setNome(Atk3);
		this.ataque4.setNome(Atk4);
		this.defeated = false;
		this.moves[0] = new Ataque();
		this.moves[0].setNome(Atk1);
		this.moves[1] = new Ataque();
		this.moves[2] = new Ataque();
		this.moves[3] = new Ataque();
		this.moves[1].setNome(Atk2);
		this.moves[2].setNome(Atk3);
		this.moves[3].setNome(Atk4);
		this.type = type;
				
	}
	
	public int Decreasedmg(int dmg) {
		CurrentHP -= dmg;
		if(CurrentHP <= 0) { 
			CurrentHP = 0;
			this.defeated=true;
		}
		return CurrentHP;
		}
	
	public int Heal(int val) {
		CurrentHP += val;
		if(CurrentHP > HPMAX) CurrentHP = HPMAX; 
		return CurrentHP;
	}
		
}

class Bulbasaur extends Pokemon {
	public Bulbasaur() {
		super("Bulbassauro", 220, 1, "Tackle", "VineWhip", "Razor Leaf", "Double Edge", "Grama");
		moves[0].setDamage(40);
		moves[1].setDamage(45);
		moves[2].setDamage(55);
		moves[3].setDamage(120);
	}	
}

class Ivysaur extends Pokemon {
	public Ivysaur() {
		super("Ivysaur", 330, 2, "Tackle", "VineWhip", "Double Edge", "Solar Beam", "Grama");
		moves[0].setDamage(60);
		moves[1].setDamage(65);
		moves[2].setDamage(140);
		moves[3].setDamage(200);
	}	
}

class Venusaur extends Pokemon {
	public Venusaur() {
		super("Venusaur", 440, 3, "Tackle", "PowerWhip", "PetalDance", "Solar Beam", "Grama");
		moves[0].setDamage(80);
		moves[1].setDamage(120);
		moves[2].setDamage(140);
		moves[3].setDamage(220);
	}	
}

class Charmander extends Pokemon {
	public Charmander() {
		super("Charmander", 220, 4, "Scratch", "Ember", "Slash", "FlameThrower", "Fogo");
		moves[0].setDamage(40);
		moves[1].setDamage(45);
		moves[2].setDamage(70);
		moves[3].setDamage(120);
	}	
}


class Charmeleon extends Pokemon {
	public Charmeleon() {
		super("Charmeleon", 330, 5, "Scratch", "Ember", "FlameThrower", "Fire Blast", "Fogo");
		moves[0].setDamage(60);
		moves[1].setDamage(65);
		moves[2].setDamage(140);
		moves[3].setDamage(200);
	}	
}


class Charizard extends Pokemon {
	public Charizard() {
		super("Charizard", 420, 6, "Wing Attack", "HeatWave", "Flare Blitz", "Fire Blast", "Fogo");
		moves[0].setDamage(90);
		moves[1].setDamage(95);
		moves[2].setDamage(140);
		moves[3].setDamage(220);
	}	
}


class Squirtle extends Pokemon {
	public Squirtle() {
		super("Squirtle", 220, 7, "Tackle", "Bubble", "WaterGun", "HydroPump", "Agua");
		moves[0].setDamage(40);
		moves[1].setDamage(45);
		moves[2].setDamage(70);
		moves[3].setDamage(120);
	}	
}

class Wartortle extends Pokemon {
	public Wartortle() {
		super("Wartortle", 330, 8, "Tackle", "Bubble", "Hydro Pump", "Skull Bash", "Agua");
		moves[0].setDamage(60);
		moves[1].setDamage(65);
		moves[2].setDamage(140);
		moves[3].setDamage(200);
	}	
}

class Blastoise extends Pokemon {
	public Blastoise() {
		super("Blastoise", 420, 9, "Headbutt", "Bubble Beam", "Hydro Pump", "Skull Bash", "Agua");
		moves[0].setDamage(90);
		moves[1].setDamage(95);
		moves[2].setDamage(140);
		moves[3].setDamage(220);
	}	
}

class Butterfree extends Pokemon {
	public Butterfree() {
		super("Butterfree", 370, 10, "Gust", "Psy Beam", "Air Slash", "SolarBeam", "Inseto");
		moves[0].setDamage(70);
		moves[1].setDamage(100);
		moves[2].setDamage(110);
		moves[3].setDamage(240);
	}	
}

class Pikachu extends Pokemon {
	public Pikachu() {
		super("Pikachu", 400, 11, "Iron Tail", "Thunder Punch", "Thunder Bolt", "Thunder", "Eletrico");
		moves[0].setDamage(70);
		moves[1].setDamage(100);
		moves[2].setDamage(130);
		moves[3].setDamage(240);
	}	
}
	
class Primeape extends Pokemon {
	public Primeape() {
		super("Primeape", 500, 12, "Rage", "Karate Chop", "Thrash", "Outrage", "Lutador");
		moves[0].setDamage(40);
		moves[1].setDamage(90);
		moves[2].setDamage(110);
		moves[3].setDamage(200);
	}	
	
}
