package batalha;

public class imprimemapa {
	public void mapa() {
		int l = 0;
	    char[][] map = {
				{ 'T', ' ', ' ', ' ', ' ' , ' ', ' '}, 
				  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},
				  { ' ', 'g', 'g', ' ', 'g' , 'g', ' '},			
				  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '},
				  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
				  { ' ', 'g', 'g', 'g', 'g' , 'g', ' '},
				  { ' ', ' ', ' ', ' ', ' ' , ' ', ' '}};
		
		for(l=0; l <= 6; l++) 
			System.out.print("+---");
		System.out.println("+");
		for(l=0; l <= 6; l++) {	
			for(int m=0; m<=6; m++) {
				System.out.print("| " + map[l][m] + " ");
			}
			System.out.println("|");
			for(int k=0; k <= 6; k++) 
				System.out.print("+---");
			System.out.println("+");
		}
		}
		
	public static void main(String[] args) {
		imprimemapa c = new imprimemapa();
		c.mapa();
	}
}
