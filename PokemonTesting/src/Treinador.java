
public class Treinador {
	private String nome;
	private int npokemons = 0;
	private Pokemon[] poke;
	
	private void SetNome(String name) {
		nome = name;
	}
	
	private void PegaPokemon(Pokemon poke2) {
		if (npokemons == 5)
			System.out.println("Numero maximo de pokemons ");
		else {
			poke[npokemons] = poke2;
			npokemons++;
		}
	}
	
	
	
}
