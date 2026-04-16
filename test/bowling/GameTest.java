package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game;
	
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}
	
	@Test
	void Iter1Test() {
		int score = game.score();
		assertEquals(0, score);
	}
	
	@Test
	void Iter2Test() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		int score = game.score();
		assertEquals(0, score);
	}
}
