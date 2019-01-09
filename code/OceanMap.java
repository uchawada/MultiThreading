package code;
import java.util.Random;

// This class is responsible for generate a grid representing the island map
// and randomly placing islands onto the grid.
public class OceanMap {
	int[][] grid;
	int dimensions;
	Random rand = new Random();
		
	// Constructor
	// Not adding validation code so make sure islandCount is much less than dimension^2
	public OceanMap(int dimensions){
		this.dimensions = dimensions;
		createGrid();
	}
	
	// Create an empty map
	private void createGrid(){
		 grid = new int[dimensions][dimensions];
		 for(int x = 0; x < dimensions; x++)
			 for(int y = 0; y < dimensions; y++)
				 grid[x][y] = 0;
	}
	
	// Return generated map
	public int[][] getMap(){
		return grid;
	}
	
	public int getDimensions(){
		return dimensions;
	}
	
	public boolean isOcean(int x, int y){
		if (grid[x][y]==0)
			return true;
		else
			return false;
	}
	
}
