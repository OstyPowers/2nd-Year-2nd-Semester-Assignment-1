package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import sokoban.Level;
import org.junit.jupiter.api.Test;

class TestLevel {

	Level level;
	@BeforeEach
	void setUp() {
	 this.level = new Level("Level1", 5, 6,
	  "######" +
	  "#+x..#" +
	  "#..w.#" +
	  "#....#" +
	  "######");
	}
	@Test
	void testLevelWidth() {
		 assertEquals(6, level.getWidth());
	}
	
	@Test
	void testLevelHeight() {
		 assertEquals(5, level.getHeight());
	}
	
	@Test
	void testLevelMoveCount() {
		 assertEquals(0, level.getMoveCount());
	}
	
	@Test
	void testLevelName() {
		 assertEquals("Level1", level.getName());
	}
	
	@Test
	void testLevelCompletedCount() {
		 assertEquals(0, level.getCompletedCount());
	}
	
	@Test
	void testLevelTargetCount() {
		assertEquals(1, level.targetCount);
	}
	
	@Test
	void testLevel_toString() {
		String expectedLevelString = "Level1" + "\n" +
			   "######" + "\n" +
			   "#+x..#" + "\n" +
			   "#..w.#" + "\n" +
			   "#....#" + "\n" +
			   "######" + "\n" +
			   "move 0" + "\n" +
			   "completed 0 of 1" + "\n";
		 String actualLevelString = level.toString();
		 String errorMessage = "Wanted\n" + expectedLevelString +
			  "\nGOT\n" +
			  actualLevelString;
		 assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		}
	}
