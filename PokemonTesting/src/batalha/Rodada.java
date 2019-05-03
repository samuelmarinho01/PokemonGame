package batalha;

public class Rodada {
	private Treinador Atacante;
	private Treinador Defensor;
	 
	public Rodada(Treinador T1, Treinador T2) {
		Atacante = T1;
		Defensor = T2;
	}
	
	private BattleIsGoing bic = new BattleIsGoing(Atacante, Defensor);
	
	public void SwitchTrainer() {
		if(bic.isGoing()) {
			Treinador aux = Atacante;
			Atacante = Defensor;
			Defensor = aux;
		}
	}
}
