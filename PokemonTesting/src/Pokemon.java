
public class Pokemon {
	private String nome;
	private String type;
	private int HP;
	private int lvl;
	private int ID;
	private String ataque1;
	private String ataque2;
	private String ataque3;
	private String ataque4;
	public static int npokemons = 0;
		
	public Pokemon(String name, int n, String Atk1, String Atk2, String Atk3, String Atk4) {
		nome = name;
		HP = n;
		ataque1 = Atk1;
		ataque2 = Atk2;
		ataque3 = Atk3;
		ataque4 = Atk4;
	}
	
	public void SetHP(int v) {
		HP = v;
	}
	
	public void SetNome(String name) {
		nome = name;
	}
	
	public void SetAtaque1(String Atk1) {
		ataque1 = Atk1;
	}
	
	public void SetAtaque2(String Atk2) {
		ataque2 = Atk2;
	}
	
	public void SetAtaque3(String Atk3) {
		ataque3 = Atk3;
	}
	
	public void SetAtaque4(String Atk4) {
		ataque4 = Atk4;
	}
}
