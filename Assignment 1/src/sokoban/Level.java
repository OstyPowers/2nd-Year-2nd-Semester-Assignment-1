package sokoban;

public class Level {

	public int targetCount = 0;
	private String name;
	private int width;
	private int height;
	private int moveCount = 0;
	private String leveltext;
	private int completedCount = 0;
	protected Placeable[] [] allPlaceables;
	
	

	public Level(String name, int height, int width, String leveltext) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.leveltext = leveltext;
		this.allPlaceables = new Placeable [height][width];
		readLevel();
	}

	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getMoveCount() {
		return this.moveCount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCompletedCount() {
		int completedCount = 0;
		return completedCount;
	}
	
	public void readLevel() {
		String tempString = "";
		for(int i = 0, y = 0; y < this.height; y++) {
			for(int x = 0; x < this.width; x++, i++) {
				char charAtI = leveltext.charAt(i);
				tempString += charAtI;
				readChara(charAtI,x,y);
			}
			tempString += "\n";
			
		}
		leveltext = tempString;
	}
	
	public void readChara(char cara,int x,int y) {
		Placeable result;
		switch (cara) {
		case '.':
			result = new Empty(x,y);
			break;
		case '#':
			result = new Wall(x,y);
			break;
		case '+':
			result = new Target(x,y);
			targetCount++;
			break;
		case 'x':
			Empty empty = new Empty(x,y);
			Crate crate = new Crate(x,y);
			empty.addCrate(crate);
			result = empty;
			break;
		case 'w':
			Empty emp = new Empty(x,y);
			Worker worker = new Worker(x,y);
			emp.addWorker(worker);
			result = emp;
			break;
		default: 
			result = new Empty(x,y);
			break;
		}
		this.allPlaceables[y][x] = result;
	}
	
	public String toString() {
		String result;
		return result = this.name + "\n" + this.leveltext + "move " + this.moveCount + "\n" + "completed " + this.completedCount + " of " + this.targetCount + "\n";
	}
	
	
}


