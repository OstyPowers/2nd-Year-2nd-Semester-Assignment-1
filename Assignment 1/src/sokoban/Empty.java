package sokoban;

public class Empty extends Placeable {
	public Empty(int x,  int y) {
		this.symbol = ".";
		this.x = x;
		this.y = y;
	}

	public void addCrate(Crate crate) {
		this.symbol = crate.toString();
	
		
		
	}

	public void addWorker(Worker worker) {
		this.symbol = worker.toString();
	
	
	}

}
