/**Difficult*/
package Chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int [][] grid = new int[9][9];
		
		readAPuzzle(grid);
		if (!isValid(grid))
			System.out.println("The grid not valid.");
		else {
			if (search(grid))
			prindGrid(grid);
			else
			System.out.println("No solution.");
			}
	}

	public static void prindGrid(int[][] grid) {
		System.out.println("OK");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
			System.out.print(grid[i][j] + " ");
			System.out.println();
			}
	}

	/** Search for a solution */
	public static boolean search(int[][] grid) {
		
		int[][] freeCellList = getFreeCellList(grid);
		
		if(freeCellList.length == 0){
			return true;//"No free cells"
		}
		
		int k=0;
		while(true){
			
			int i,j;
			i = freeCellList[k][0];
			j = freeCellList[k][1];
			
			if(grid[i][j] == 0)
				grid[i][j] = 1;
			
			if(isValid(i,j,grid)){
				if((k+1) == freeCellList.length)
					return true;// A solution is found
				else
					k++;// Move to the next free cell
			}
			
			else if(grid[i][j] < 9){
				// Fill the free cell with the next possible value
				grid[i][j]++;
			}
			
			else{
				// free cell grid[i][j] is 9, backtrack
				while(grid[i][j] == 9){
					
					if(k == 0){
						return false;// No possible value
					}
					
					grid[i][j] = 0;// Reset to free cell
					k--;// Backtrack to the preceding free cell
					i = freeCellList[k][0];
					j = freeCellList[k][1];
				}
				// Fill the free cell with the next possible value,
				// search continues from this free cell at k
				grid[i][j] = grid[i][j] + 1;
			}
		}
	}
	
	/** Obtain a list of free cells from the puzzle */
	public static int[][] getFreeCellList(int[][] grid) {
		
		int numberOfFreeCellList = 0;
		for(int i=0;i<grid.length;i++)
			for(int j=0;j<grid[i].length;j++)
				if(grid[i][j] == 0){
					numberOfFreeCellList++;
				}
		
		int[][] freeCellList = new int[numberOfFreeCellList][2];
		
		int k = 0;
		for(int i=0;i<grid.length;i++)
			for(int j=0;j<grid[i].length;j++)
				if(grid[i][j] == 0){
					freeCellList[k][0] = i;
					freeCellList[k][1] = j;
					k++;
				}
		return freeCellList;
	}

	/** Check whether the fixed cells are valid in the grid */
	public static boolean isValid(int[][] grid) {
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j] < 0 || grid[i][j] > 9){
					return false;
				}
				else{
					if(grid[i][j] != 0 && !isValid(i,j,grid))
						return false;
				}
			}	
		}
		return true;
		
	}

	/** Check whether grid[i][j] is valid in the grid */
	public static boolean isValid(int i, int j, int[][] grid) {
		
		// Check whether grid[i][j] is valid at the i's row
		for(int col=0;col < 9;col++)
			if(col!=j && grid[i][col] == grid[i][j]){
				return false;
			}
		
		// Check whether grid[i][j] is valid at the j's col
		for(int row=0;row<9;row++)
			if(row!=i && grid[row][j] == grid[i][j])
				return false;
		
		// Check whether grid[i][j] is valid in the 3 by 3 box
		for(int row=(i / 3) * 3;row<(i / 3) * 3 + 3;row++)
			for(int col=(j / 3) * 3;col<(j / 3) * 3 + 3;col++)
				if((row != i && col != j) && grid[row][col] == grid[i][j])
					return false;
		
		return true;
	}

	/** Read a Sudoku puzzle from Sudoku.txt */
	public static void readAPuzzle(int[][] grid) throws FileNotFoundException {
		
		File file = new File("file/Sudoku.txt");
		Scanner input = new Scanner(file);
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				grid[i][j] = input.nextInt();
			}	
		}
			
	}

}
