package sokoban;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private int currentLevelCount = 0;
	private String currentLevelName = "no levels";

	public int getLevelCount() {
		return this.currentLevelCount;
	}

	public String getCurrentLevelName() {
		return this.currentLevelName;
	}

	public List<String> getLevelNames() {
		ArrayList<String> levname = new ArrayList<String>();
		return levname;
	}
	
	public String toString() {
		return this.getCurrentLevelName();
	}

	public void addLevel(String name, int height, int width, String string2) {
		this.currentLevelName = name;
		this.currentLevelCount++;
	}
		
}
