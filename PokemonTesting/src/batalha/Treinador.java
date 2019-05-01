package batalha;

public class Treinador {
	private String name;
	private int nintens;
	private int[] Pokemons_id = new int[6];
	private Pokemon[] time = new Pokemon[6];
	private Item[] itempack = new Item[4];
	private boolean defeated = false;
	private int n_alivePokemon;
	private boolean fighting;
	private boolean turnocompleto;
	private int AP; // active pokemon
	

	public Treinador (String nome, Pokemon[] p, Item[]it ) {
		this.name=nome;
		for(int i=0;i !=p.length;i++)
			this.time[i]=p[i];
		for(int i=0; i!= it.length;i++)
			this.itempack[i]=it[i];
		this.n_alivePokemon=6;
		
	}
	
	public Pokemon getTeamMember(int i){
		return time[i];
	}

	
	public int getAP() {
		return AP;
	}

	public void setAP(int aP) {
		AP = aP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNintens() {
		return nintens;
	}

	public void setNintens(int nintens) {
		this.nintens = nintens;
	}

	public int[] getPokemons_id() {
		return Pokemons_id;
	}

	public void setPokemons_id(int[] pokemons_id) {
		Pokemons_id = pokemons_id;
	}

	public Pokemon[] getTime() {
		return time;
	}

	public void setTime(Pokemon[] time) {
		this.time = time;
	}

	public Item[] getItempack() {
		return itempack;
	}

	public void setItempack(Item[] itempack) {
		this.itempack = itempack;
	}

	public boolean isDefeated() {
		return defeated;
	}

	public void setDefeated(boolean defeated) {
		this.defeated = defeated;
	}

	public int getN_alivePokemon() {
		return n_alivePokemon;
	}

	public void setN_alivePokemon(int n_alivePokemon) {
		this.n_alivePokemon = n_alivePokemon;
	}

	public boolean isFighting() {
		return fighting;
	}

	public void setFighting(boolean fighting) {
		this.fighting = fighting;
	}

	public boolean isTurnocompleto() {
		return turnocompleto;
	}

	public void setTurnocompleto(boolean turnocompleto) {
		this.turnocompleto = turnocompleto;
	}
	
	
	
	
}
