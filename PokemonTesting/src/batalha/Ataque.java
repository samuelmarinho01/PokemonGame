package batalha;


import java.util.Random;

public class Ataque {
private String name;
private int damage;
private boolean priority;//somente alguns movimentos possuem prioridade sobre o outro. ex: QuickAttack



public Ataque(boolean p) {
	this.priority= p;
}

public double DamageCalculate(int att, int def, double typeAdv) {
	Random gerador = new Random(1);
	int rand = gerador.nextInt(15) + 85;
	return (((22 * att * damage / def)/50) + 2) * typeAdv * rand/100;
}

public boolean getPri() {
	return priority;
}

public String getMove() {
	return name;
}



public void setName(String atck) {
	this.name= atck;
	
}

public void setDamage(int i) {
	this.damage = i;
}








}