//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package maze;

public class Maze {
	private final int TRIED = 3;
	private final int PATH = 7;
	private int[][] grid = { { 1, 1, 1},{1,1,0},{0,0,1}};
	
	private int nodeIdentifier = 0;

	/*
	 * Versucht, das Labyrinth rekursiv zu durchqueren. F¨ugt spezielle Zeichen ein,
	 * die auf Orte hinweisen, die ausprobiert wurden und die schliesslich Teil der
	 * L¨osung werden.
	 */
	/**
	 * Der code wurde so modifizeirt, dass er einen String ausgibt der mit dem onlinetool
	 * graphviz in ein aufrufdiagramm umgewandelt werden kann.
	 * */
	public boolean traverse(int row, int column) {
		
		String node = Integer.toString(nodeIdentifier++);
		
		boolean done = false;
		if (this.valid(row, column)) {
			generateLabel(node, grid);
			this.grid[row][column] = this.TRIED; // Zelle wurde besucht
			if (row == this.grid.length - 1 && column == this.grid[0].length - 1) {
				done = true; // Labyrinth ist gel¨ost
			}
			else {
				System.out.println(node + "->" +Integer.toString(nodeIdentifier)+"[label=\"d\"]");
				done = this.traverse(row + 1, column); // unten
				
				
				if (!done) {
					System.out.println(node + "->" +Integer.toString(nodeIdentifier)+"[label=\"r\"]");
					done = this.traverse(row, column + 1); // rechts
				}
				if (!done) {
					System.out.println(node + "->" +Integer.toString(nodeIdentifier)+"[label=\"u\"]");
					done = this.traverse(row - 1, column); // oben
				}
				if (!done) {
					System.out.println(node + "->" +Integer.toString(nodeIdentifier)+"[label=\"l\"]");
					done = this.traverse(row, column - 1); // links
				}
			}
			if (done) { // Zelle ist Teil der finalen L¨osung
				this.grid[row][column] = this.PATH;
				System.out.println(node + "->");
			}
		}
		else {
			if (!(row >= 0 && row < this.grid.length && column >= 0 && column < this.grid[row].length))
				System.out.println(node+"[label=\"out of bounds\"]");
			else if(grid[row][column] == 3)
				System.out.println(node+"[label=\"already tried\"]");
			else if(grid[row][column] == 0)
				System.out.println(node+"[label=\"wall\"]");
		}
		return done;
	}
	
	private static void generateLabel(String node, int[][] grid) {
		String gridStr = "";
		
		for(int i = 0; i<grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++){
				gridStr+=grid[i][j];
			}
			gridStr+="\\n";
		}
		
		
		System.out.println(node+"[label=\"" + gridStr + "\"]");
	}
	/**
	 * Uberpr¨uft, ob die Position g¨ultig ist ¨
	 */
	private boolean valid(int row, int column) {
		boolean result = false;
// Ist Zelle innerhalb der Grenzen?
		if (row >= 0 && row < this.grid.length && column >= 0 && column < this.grid[row].length)
// Ist Zelle nicht blockiert und noch nicht ausprobiert?
			if (grid[row][column] == 1)
				result = true;
		return result;
	}

	/**
	 * Zeichenkettenrepr¨asentation des Labyrinths
	 */
	public String toString() {
		String result = "\n";
		for (int row = 0; row < this.grid.length; row++) {
			for (int column = 0; column < this.grid[row].length; column++)
				result += this.grid[row][column] + "";
			result += "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Maze m = new Maze();
		m.traverse(0,0);
	}
}
