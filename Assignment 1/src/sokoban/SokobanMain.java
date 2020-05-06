package sokoban;

public class SokobanMain {

	public static void main(String[] args) {
		 Game game = new Game();
		 game.addLevel("Test1", 5, 6,
		 "######" +
		 "#+x+.#" +
		 "#..w.#" +
		 "#....#" +
		 "######" );
		 System.out.println(game);

		 System.out.println("*LEFT*");
		 game.move(Direction.LEFT);
		 System.out.println(game);

		 System.out.println("*DOWN*");
		 game.move(Direction.DOWN);
		 System.out.println(game);

		 System.out.println("*RIGHT*");
		 game.move(Direction.RIGHT);
		 System.out.println(game);

		 System.out.println("*UP*");
		 game.move(Direction.UP);
		 System.out.println(game);

		 // to besides wall
		 System.out.println("*MOVE RIGHT, NEXT TO WALL*");
		 game.move(Direction.RIGHT);
		 System.out.println(game);

		 // into a wall
		 System.out.println("*ATTEMPT RIGHT INTO WALL*");
		 game.move(Direction.RIGHT);
		 System.out.println(game);

		 // line up with crate and target
		 System.out.println("*UP*");
		 game.move(Direction.UP);
		 System.out.println(game);

		 // onto empty target
		 System.out.println("*LEFT ONTO EMPTY TARGET*");
		 game.move(Direction.LEFT);
		 System.out.println(game);
	
		 // into crate
		 System.out.println("*LEFT PUSHING CRATE ONTO TARGET*");
		 game.move(Direction.LEFT);
		 System.out.println(game);
		 }


}
