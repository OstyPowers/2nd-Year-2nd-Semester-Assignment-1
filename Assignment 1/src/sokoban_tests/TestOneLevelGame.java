package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import sokoban.Game;
import org.junit.jupiter.api.Test;

class TestOneLevelGame {
	Game game;
	@BeforeEach
	void setUp() throws Exception {
		this.game = new Game();
		this.game.addLevel("Level1", 6, 5,
				"######" +
				"#+x..#" +
				"#..w.#" +
				"#....#" +
				"######" );
	}
	
	@Test
	void testOneLevelGame_getLevelCount() {
		int expectedlevelCount = 1;
		int actualLevelCount = game.getLevelCount();
		assertEquals(expectedlevelCount, actualLevelCount);
	}
	
	@Test
	void testOneLevelGame_toString() {
	// avoiding testing the string returned by the actual level
		String expectedStartingString = "Level1";
		String actualStartingString = game.toString();
		actualStartingString = actualStartingString.substring(0,
		expectedStartingString.length());
		assertEquals(expectedStartingString, actualStartingString);
	}
	
	@Test
	void testOneLevelGame_getCurrentLevelName() {
		String expectedString = "Level1";
		String actualString = game.getCurrentLevelName();
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testOneLevelGame_getLevelNames() {
		int expectedLevelNamesCount = 1;
		List<String> levelNames = game.getLevelNames();
		boolean actuallyIsEmpty = levelNames.isEmpty();
		int actualLevelNamesCount = levelNames.size();
		assertFalse(actuallyIsEmpty);
		assertEquals(expectedLevelNamesCount, actualLevelNamesCount);
	}
}
