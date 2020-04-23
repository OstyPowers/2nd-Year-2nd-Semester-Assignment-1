package sokoban_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sokoban.Placeable;
import sokoban.Empty;
import sokoban.Wall;
import sokoban.Crate;
import sokoban.Target;
import sokoban.Worker;

class TestPlaceableSymbols {

	@Test
	void testEmptySymbol() {
	 Placeable placeable = new Empty(1, 1);
	 String actualSymbol = placeable.toString();
	 String expectedSymbol = ".";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testWallSymbol() {
	 Placeable placeable = new Wall(1, 1);
	 String actualSymbol = placeable.toString();
	 String expectedSymbol = "#";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testTargetSymbol() {
	 Placeable placeable = new Target(1, 1);
	 String actualSymbol = placeable.toString();
	 String expectedSymbol = "+";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testCrateSymbol() {
	 Placeable placeable = new Crate(1, 1);
	 String actualSymbol = placeable.toString();
	 String expectedSymbol = "x";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testWorkerSymbol() {
	 Placeable placeable = new Worker(1, 1);
	 String actualSymbol = placeable.toString();
	 String expectedSymbol = "w";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testWorkerOnTargetSymbol() {
	 Target target = new Target(1, 1);
	 Worker worker = new Worker(1, 1);
	 target.addWorker(worker);
	 String actualSymbol = target.toString();
	 String expectedSymbol = "W";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testCrateOnTargetSymbol() {
	 Target target = new Target(1, 1);
	 Crate crate = new Crate(1, 1);
	 target.addCrate(crate);
	 String actualSymbol = target.toString();
	 String expectedSymbol = "X";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testWorkerOnEmptySymbol() {
	 Empty empty = new Empty(1, 1);
	 Worker worker = new Worker(1, 1);
	 empty.addWorker(worker);
	 String actualSymbol = empty.toString();
	 String expectedSymbol = "w";
	 assertEquals(expectedSymbol, actualSymbol);
	}
	@Test
	void testCrateOnEmptySymbol() {
	 Empty empty = new Empty(1, 1);
	 Crate crate = new Crate(1, 1);
	 empty.addCrate(crate);
	 String actualSymbol = empty.toString();
	 String expectedSymbol = "x";
	 assertEquals(expectedSymbol, actualSymbol);
	}
}
