package bowling;

public class Game {
	private int score = 0;
	
	
	void roll(int nbQuilles) {
		for(int i=0;i<nbQuilles;i++) {
			score();
		}
	}
	
	public int score() {
		return score++;
	}
}
