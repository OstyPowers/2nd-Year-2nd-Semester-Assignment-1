package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import sokoban.Game;
import org.junit.jupiter.api.Test;

class TestThreeLevelGame {

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
		this.game.addLevel("Level2", 6, 5,
				"######" +
				"#+x..#" +
				"#..w.#" +
				"#....#" +
				"######" );
	this.game.addLevel("Level3", 6, 5,
			"######" +
			"#+x..#" +
			"#..w.#" +
			"#....#" +
			"######" );
	}
	
	@Test
	void testThreeLevelGame_getLevelCount() {
		int expectedlevelCount = 3;
		int actualLevelCount = game.getLevelCount();
		assertEquals(expectedlevelCount, actualLevelCount);
	}
	
	@Test
	void testThreeLevelGame_toString() {
	// avoiding testing the string returned by the actual level
		String expectedStartingString = "Level3";
		String actualStartingString = game.toString();
		actualStartingString = actualStartingString.substring(0,
		expectedStartingString.length());
		assertEquals(expectedStartingString, actualStartingString);
	}
	
	@Test
	void testThreeLevelGame_getCurrentLevelName() {
		String expectedString = "Level3";
		String actualString = game.getCurrentLevelName();
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testThreeLevelGame_getLevelNames() {
		int expectedLevelNamesCount = 3;
		List<String> levelNames = game.getLevelNames();
		boolean actuallyIsEmpty = levelNames.isEmpty();
		int actualLevelNamesCount = levelNames.size();
		assertFalse(actuallyIsEmpty);
		assertEquals(expectedLevelNamesCount, actualLevelNamesCount);
	}
}
