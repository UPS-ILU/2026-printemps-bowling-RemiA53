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
		String[] score = {};
		int scoreFin = game.score(score);
		assertEquals(0, scoreFin);
	}
}
