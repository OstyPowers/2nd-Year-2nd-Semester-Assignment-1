package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sokoban.Direction;
import sokoban.Game;


class TestMovement {
	Game game;
    //arrange 
	@BeforeEach
	void setUp() throws Exception {
		this.game = new Game();
		this.game.addLevel("Level1", 5, 6, "######" + "#+x+.#" + "#..w.#" + "#....#" + "######");
	}

	@Test
	void testMovement_moveLeft() {
	// act
		this.game.move(Direction.LEFT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#.w..#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 1" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveRight() {
	// act
		this.game.move(Direction.RIGHT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#...w#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 1" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveUp() {
	// act
		this.game.move(Direction.UP);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+xW.#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 1" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveDown() {
	// act
		this.game.move(Direction.DOWN);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#....#" + "\n" +
				"#..w.#" + "\n" +
				"######" + "\n" +
				"move 1" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveDownIntoWall() {
	// act
		this.game.move(Direction.DOWN);
		this.game.move(Direction.DOWN);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#....#" + "\n" +
				"#..w.#" + "\n" +
				"######" + "\n" +
				"move 2" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveRightIntoWall() {
	// act
		this.game.move(Direction.RIGHT);
		this.game.move(Direction.RIGHT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#...w#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 2" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveLeftIntoWall() {
	// act
		this.game.move(Direction.LEFT);
		this.game.move(Direction.LEFT);
		this.game.move(Direction.LEFT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#w...#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 3" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveUpIntoWall() {
	// act
		this.game.move(Direction.UP);
		this.game.move(Direction.UP);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+xW.#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 2" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveUpOntoTarget() {
	// act
		this.game.move(Direction.UP);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+xW.#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 1" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveUpOntoTargetandOffTarget() {
	// act
		this.game.move(Direction.UP);
		this.game.move(Direction.RIGHT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+w#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 2" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveCratetoTarget() {
	// act
		this.game.move(Direction.UP);
		this.game.move(Direction.LEFT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#Xw+.#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 2" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	
	@Test
	void testMovement_moveCratetoWall() {
	// act
		this.game.move(Direction.LEFT);
		this.game.move(Direction.UP);
		this.game.move(Direction.UP);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+x+.#" + "\n" +
				"#.w..#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 3" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}
	@Test
	void testMovement_moveCratetoTargetthenOff() {
	// act
		this.game.move(Direction.LEFT);
		this.game.move(Direction.LEFT);
		this.game.move(Direction.UP);
		this.game.move(Direction.RIGHT);
		this.game.move(Direction.RIGHT);
	// assert
		String expectedLevelString = "Level1" + "\n" +
				"######" + "\n" +
				"#+.Wx#" + "\n" +
				"#....#" + "\n" +
				"#....#" + "\n" +
				"######" + "\n" +
				"move 5" + "\n" +
				"completed 0 of 2" + "\n";
		String actualLevelString = game.getCurrentLevel().toString();
		String errorMessage = "Wanted\n" + expectedLevelString + "\nGOT\n" + actualLevelString;
		assertTrue(expectedLevelString.equals(actualLevelString), errorMessage);
		
	}

}
