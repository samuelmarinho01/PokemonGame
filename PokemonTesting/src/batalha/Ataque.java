package batalha;


import java.util.Random;

public class Ataque {
private String nome;
private int damage;
private boolean priority;





public double DamageCalculate(int att, int def, double typeAdv) {
	Random gerador = new Random(1);
	int rand = gerador.nextInt(15) + 85;
	return (((22 * att * damage / def)/50) + 2) * typeAdv * rand/100;
}

public boolean getPri() {
	return priority;
}

public String getMove() {
	return nome;
}



public int getDamage() {
	return damage;
}

public void setNome(String atck) {
	this.nome= atck;
	
}

public void setDamage(int i) {
	this.damage = i;
}








}