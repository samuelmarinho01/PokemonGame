package batalha;

public class Pokemon {
	private String nome;
	private String type;
	private int CurrentHP;
	final private int HPMAX;
	private int lvl;
	private int ID;
	protected Ataque ataque1 = new Ataque();
	protected Ataque ataque2 = new Ataque();
	protected Ataque ataque3 = new Ataque();
	protected Ataque ataque4 = new Ataque();
	private boolean defeated; 
	
	public static int npokemons = 0;
		
	public Pokemon(String name, int n, int id, String Atk1, String Atk2, String Atk3, String Atk4) {
		this.nome = name;
		this.ID=id;
		this.CurrentHP = n;
		this.HPMAX =n;
		this.ataque1.setNome(Atk1); 
		this.ataque2.setNome(Atk2);
		this.ataque3.setNome(Atk3);
		this.ataque4.setNome(Atk4);
		this.defeated = false;
				
	}
	
	public int Decreasedmg(int dmg) {
		CurrentHP -= dmg;
		if(CurrentHP < 0) CurrentHP = 0;
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
		super("Bulbassauro", 220, 1, "Tackle", "VineWhip", "Razor Leaf", "Double Edge");
		ataque1.setDamage(40);
		ataque2.setDamage(45);
		ataque3.setDamage(55);
		ataque4.setDamage(120);
	}	
}

class Ivysaur extends Pokemon {
	public Ivysaur() {
		super("Ivysaur", 330, 2, "Tackle", "VineWhip", "Double Edge", "Solar Beam");
		ataque1.setDamage(60);
		ataque2.setDamage(65);
		ataque3.setDamage(140);
		ataque4.setDamage(200);
	}	
}

class Venusaur extends Pokemon {
	public Venusaur() {
		super("Venusaur", 440, 3, "Tackle", "PowerWhip", "PetalDance", "Solar Beam");
		ataque1.setDamage(80);
		ataque2.setDamage(120);
		ataque3.setDamage(140);
		ataque4.setDamage(220);
	}	
}

class Charmander extends Pokemon {
	public Charmander() {
		super("Charmander", 220, 4, "Scratch", "Ember", "Slash", "FlameThrower");
		ataque1.setDamage(40);
		ataque2.setDamage(45);
		ataque3.setDamage(70);
		ataque4.setDamage(120);
	}	
}


class Charmeleon extends Pokemon {
	public Charmeleon() {
		super("Charmeleon", 330, 5, "Scratch", "Ember", "FlameThrower", "Fire Blast");
		ataque1.setDamage(60);
		ataque2.setDamage(65);
		ataque3.setDamage(140);
		ataque4.setDamage(200);
	}	
}


class Charizard extends Pokemon {
	public Charizard() {
		super("Charizard", 420, 6, "Wing Attack", "HeatWave", "Flare Blitz", "Fire Blast");
		ataque1.setDamage(90);
		ataque2.setDamage(95);
		ataque3.setDamage(140);
		ataque4.setDamage(220);
	}	
}


class Squirtle extends Pokemon {
	public Squirtle() {
		super("Squirtle", 220, 7, "Tackle", "Bubble", "WaterGun", "HydroPump");
		ataque1.setDamage(40);
		ataque2.setDamage(45);
		ataque3.setDamage(70);
		ataque4.setDamage(120);
	}	
}

class Wartortle extends Pokemon {
	public Wartortle() {
		super("Wartortle", 330, 8, "Tackle", "Bubble", "Hydro Pump", "Skull Bash");
		ataque1.setDamage(60);
		ataque2.setDamage(65);
		ataque3.setDamage(140);
		ataque4.setDamage(200);
	}	
}

class Blastoise extends Pokemon {
	public Blastoise() {
		super("Blastoise", 420, 9, "Headbutt", "Bubble Beam", "Hydro Pump", "Skull Bash");
		ataque1.setDamage(90);
		ataque2.setDamage(95);
		ataque3.setDamage(140);
		ataque4.setDamage(220);
	}	
}

class Butterfree extends Pokemon {
	public Butterfree() {
		super("Butterfree", 370, 10, "Gust", "Psy Beam", "Air Slash", "SolarBeam");
		ataque1.setDamage(70);
		ataque2.setDamage(100);
		ataque3.setDamage(110);
		ataque4.setDamage(240);
	}	
}

class Pikachu extends Pokemon {
	public Pikachu() {
		super("Pikachu", 400, 11, "Iron Tail", "Thunder Punch", "Thunder Bolt", "Thunder");
		ataque1.setDamage(70);
		ataque2.setDamage(100);
		ataque3.setDamage(130);
		ataque4.setDamage(240);
	}	
}
	
class Primeape extends Pokemon {
	public Primeape() {
		super("Primeape", 500, 12, "Rage", "Karate Chop", "Thrash", "Outrage");
		ataque1.setDamage(40);
		ataque2.setDamage(90);
		ataque3.setDamage(110);
		ataque4.setDamage(200);
	}	
}
