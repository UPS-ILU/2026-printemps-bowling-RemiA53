package bowling;

public class Game {
	private int score = 0;
	private int[] scoreTour = new int[2];
	private int lancerDansTour = 0;
	private boolean precedentIsSpare = false;
	private static int SPARE = 10;
	
	void roll(int nbQuilles) {
		scoreTour[lancerDansTour] = nbQuilles;
		lancerDansTour++;
		
		if (precedentIsSpare) {
			for(int i=0;i<nbQuilles;i++) {
				score();
			}
			precedentIsSpare = false;
		}
		
		if (lancerDansTour==2 & scoreTour[0]+scoreTour[1]==SPARE) {
			precedentIsSpare = true;
		}
		
		if (lancerDansTour==2) {
			lancerDansTour=0;
		}
	
		for(int i=0;i<nbQuilles;i++) {
			score();
		}
	}
	
	public int score() {
		return score++;
	}
}
