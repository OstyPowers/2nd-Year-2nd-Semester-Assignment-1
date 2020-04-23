package sokoban;

public class Target extends Placeable {
	public Target(int x,  int y) {
		this.symbol = "+";
		this.x = x;
		this.y = y;
	}

	public void addCrate(Crate crate) {
		this.symbol = crate.toString().toUpperCase();
	
		
	}

	public void addWorker(Worker worker) {
		this.symbol = worker.toString().toUpperCase();
	
		
	}


}
