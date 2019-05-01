package batalha;

public class Item {
	private String nome;
	protected int valor;
	
	public Item (String nome) {
		this.nome = nome;

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
	private int curaHP;
	public Potion(String name, int HP) {
		super(name);
		this.curaHP=HP;
			
	}
	
	public int getCuraHP() {
		return curaHP;
	}

	public void setCuraHP(int curaHP) {
		this.curaHP = curaHP;
	}

	public void HealHP(Potion cure,Pokemon p) {
		p.setCurrentHP(p.getCurrentHP()+cure.getCuraHP());
		if (p.getCurrentHP() > p.getHPMAX()) {
			p.setCurrentHP(p.getHPMAX());
		}
		
	}
}
