
public class Pokemon {
	private String nome;
	private String type;
	private int CurrentHP;
	final private int HPMAX;
	private int lvl;
	private int ID;
	private String ataque1;
	private String ataque2;
	private String ataque3;
	private String ataque4;
	private boolean defeated; 
	
	public static int npokemons = 0;
		
	public Pokemon(String name, int n, int id, String Atk1, String Atk2, String Atk3, String Atk4) {
		this.nome = name;
		this.ID=id;
		this.CurrentHP = n;
		this.HPMAX =n;
		this.ataque1 = Atk1;
		this.ataque2 = Atk2;
		this.ataque3 = Atk3;
		this.ataque4 = Atk4;
		this.defeated = false;
				
	}
	
	
	
}
