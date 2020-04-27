package sokoban;

public class Level {

	public int targetCount = 0;
	private String name;
	private int width;
	private int height;
	private int moveCount = 0;
	private String leveltext;
	private int completedCount = 0;
	
	

	public Level(String name, int height, int width, String leveltext) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.leveltext = leveltext;
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
	// i need to change and add capital symbols in switch
	public void readChara(char cara,int x,int y) {
		Placeable result;
		switch (cara) {
		case '.':
			break;
		case '#':
			break;
		case '+':
			targetCount++;
			break;
		case 'x':
			break;
		case 'w':
			break;
		}
	}
	
	public String toString() {
		String result;
		return result = this.name + "\n" + this.leveltext + "move " + this.moveCount + "\n" + "completed " + this.completedCount + " of " + this.targetCount + "\n";
	}
	
	
}


