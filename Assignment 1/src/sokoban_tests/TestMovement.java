package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.javafx.scene.traversal.Direction;

import sokoban.Game;


class TestMovement {
	Game game;

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

}
