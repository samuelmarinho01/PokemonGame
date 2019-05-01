
public class Item {
	private String nome;
	protected int valor;
	
	public Item (String nome, int n) {
		this.nome = nome;
		valor = n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}

class Potion extends Item{
	public Potion() {
		super("Potion", 100);
	}
}
