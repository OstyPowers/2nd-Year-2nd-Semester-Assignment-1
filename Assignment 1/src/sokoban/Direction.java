package sokoban;

import java.awt.Point;

public enum Direction {
	UP (0,-1),
	DOWN (0,1),
	LEFT (-1,0),
	RIGHT (1,0);
	
	private final Point p;
	
	private Direction(int y, int x) {
		p = new Point (y,x);
	}
	
	public Point offset() {
		return p;
	}
	
	public Point getPoint() {
		return p;
	}
	
	

}
