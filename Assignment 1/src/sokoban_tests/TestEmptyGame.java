package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import sokoban.Game;
import org.junit.jupiter.api.Test;

class TestEmptyGame {

	Game game;
	@BeforeEach
	void setUp() throws Exception {
		this.game = new Game();
	}
	
	@Test
	void testEmptyGame_getLevelCount() {
		int expectedlevelCount = 0;
		int actualLevelCount = game.getLevelCount();
		assertEquals(expectedlevelCount, actualLevelCount);
	}
	
	@Test
	void testEmptyGame_toString() {
		String expectedString = "no levels";
		String actualString = game.toString();
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testEmptyGame_getCurrentLevelName() {
		String expectedString = "no levels";
		String actualString = game.getCurrentLevelName();
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testEmptyGame_getLevelNames() {
		int expectedLevelNamesCount = 0;
		List<String> levelNames = game.getLevelNames();
		boolean actuallyIsEmpty = levelNames.isEmpty();
		int actualLevelNamesCount = levelNames.size();
		assertEquals(expectedLevelNamesCount, actualLevelNamesCount);
		assertTrue(actuallyIsEmpty);
	}
}
