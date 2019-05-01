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
	

	public Treinador (String nome, Pokemon[] p, Item[]it ) {
		this.name=nome;
		for(int i=0;i !=p.length;i++)
			this.time[i]=p[i];
		for(int i=0; i!= it.length;i++)
			this.itempack[i]=it[i];
		this.n_alivePokemon=6;
		
	}
	
	
	
}
