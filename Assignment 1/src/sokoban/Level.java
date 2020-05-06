package sokoban;

import java.awt.Point;

public class Level {

	public int targetCount = 0;
	private String name;
	private int width;
	private int height;
	protected int moveCount = 0;
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
		targetCount =0;
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
	public Boolean moveCrate(Point cratePosition, Point direction) {
		Point newPosition = new Point();
		newPosition.x = cratePosition.x + direction.x;
		newPosition.y = cratePosition.y + direction.y;
		if(checkMove(newPosition)) {
			Placeable objectAtNewPos =allPlaceables[newPosition.y][newPosition.x];
			
			if(allPlaceables[cratePosition.y][cratePosition.x].getClass() == Empty.class) {
				((Empty)allPlaceables[cratePosition.y][cratePosition.x]).removeCrate();
			}
			else {
				((Target)allPlaceables[cratePosition.y][cratePosition.x]).removeCrate();
			}
			if(allPlaceables[newPosition.y][newPosition.x].getClass() == Empty.class) {
				((Empty)allPlaceables[newPosition.y][newPosition.x]).addCrate(new Crate(newPosition.x,newPosition.y));
			}
			else {
				((Target)allPlaceables[newPosition.y][newPosition.x]).addCrate(new Crate(newPosition.x,newPosition.y));
			}
			refreshLevel();
			return true;
		}
		return false;
	}
	public void move(Direction direction ) {
		Point workerPosition = null;
		for(Placeable[] pList: allPlaceables) {
			for(Placeable p : pList) {
				if(p.toString() == "w" || p.toString() == "W") {
					workerPosition = p.getPosition();
				} 
			}
		}
		Point newPosition = new Point();
		Point moveDirection = direction.getPoint();
		newPosition.x = workerPosition.x + moveDirection.x;
		newPosition.y = workerPosition.y + moveDirection.y;
		if(checkMove(newPosition)) {
			Placeable objectAtNewPos =allPlaceables[newPosition.y][newPosition.x];
			if(objectAtNewPos.symbol == "x"||objectAtNewPos.symbol == "X"){
				if(!this.moveCrate(newPosition, moveDirection)) {
					return;
				}
			}
			
			if(allPlaceables[workerPosition.y][workerPosition.x].getClass() == Empty.class) {
				((Empty)allPlaceables[workerPosition.y][workerPosition.x]).removeWorker();
			}
			else {
				((Target)allPlaceables[workerPosition.y][workerPosition.x]).removeWorker();
			}
			if(allPlaceables[newPosition.y][newPosition.x].getClass() == Empty.class) {
				((Empty)allPlaceables[newPosition.y][newPosition.x]).addWorker(new Worker(newPosition.x,newPosition.y));
			}
			else {
				((Target)allPlaceables[newPosition.y][newPosition.x]).addWorker(new Worker(newPosition.x,newPosition.y));
			}
			
		}
		refreshLevel();
		
	}
	
	public Boolean checkMove(Point newPosition) {
		Placeable objectNewPos = this.allPlaceables[newPosition.y][newPosition.x];
		if (objectNewPos.symbol == "." || objectNewPos.symbol == "+"){
			return true;
		}
		else if(objectNewPos.symbol == "x" || objectNewPos.symbol == "X") {
			
			return true;
		}
		else return false;
			
	}
	
	public void refreshLevel() {
		String tempString ="";
		for(Placeable[] pList: allPlaceables) {
			for(Placeable p : pList) {
				tempString += p.symbol;
			}
		}
		this.leveltext = tempString;
		this.readLevel();
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
		case 'W':
			targetCount++;
			Target tar = new Target(x,y);
			Worker workerOnTar = new Worker(x,y);
			tar.addWorker(workerOnTar);
			result = tar;
			break;
		case 'X':
			targetCount++;
			Target target = new Target(x,y);
			Crate crateOnTarget = new Crate(x,y);
			target.addCrate(crateOnTarget);
			result = target;
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


