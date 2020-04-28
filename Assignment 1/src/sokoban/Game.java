package sokoban;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private int currentLevelCount = 0;
	private String currentLevelName = "no levels";
	private List<String> levNames = new ArrayList<String>();
	private ArrayList<Level> allMyLevels = new ArrayList<Level>();

	public int getLevelCount() {
		return this.currentLevelCount;
	}

	public String getCurrentLevelName() {
		return this.currentLevelName;
	}

	public List<String> getLevelNames() {
		return this.levNames;
	}
	
	public String toString() {
		return this.getCurrentLevelName();
	}

	public void addLevel(String name, int height, int width, String leveltext) {
		this.currentLevelName = name;
		this.currentLevelCount++;
		Level level = new Level(name, height, width, leveltext);
		this.allMyLevels.add(level);
		this.levNames.add(name);
	}
		
}
