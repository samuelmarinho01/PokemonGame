package batalha;

public class BattleIsGoing {
	private boolean going = true;
	Treinador T1;
	Treinador T2;
	
	public BattleIsGoing(Treinador T1, Treinador T2) {
		 this.T1 = T1;
		 this.T2 = T2;
	}

	public boolean isGoing() {
		if(T1.isDefeated() || T2.isDefeated())
			 going = false;
		return going;
	}

	public void setGoing(boolean going) {
		this.going = going;
	}
}
