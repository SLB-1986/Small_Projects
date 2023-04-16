package Arrays;

import org.w3c.dom.ls.LSOutput;

public class Sudoku {
	//We need to define the grid size, which is 3x3
	private static final int Grid_size = 9; // the grid size is 3 x 3, so it is 9
	// the main, running the solution
	public static void main(String[] args) {
		int[][] board ={ // we use zero (0) where is an empty space
				{0, 0, 0, 0, 0, 0, 0, 4, 9},// each line contains the numbers from 1 to 9 once.
				{9, 0, 4, 6, 0, 0, 5, 3, 0},// each line contains the numbers from 1 to 9 once.
				{0, 0, 0, 5, 4, 0, 0, 0, 0},// each line contains the numbers from 1 to 9 once.
				{0, 0, 0, 0, 8, 0, 0, 0, 0},// each line contains the numbers from 1 to 9 once.
				{0, 0, 5, 0, 0, 0, 0, 0, 8},// each line contains the numbers from 1 to 9 once.
				{0, 0, 2, 0, 0, 0, 4, 9, 6},// each line contains the numbers from 1 to 9 once.
				{3, 0, 8, 0, 0, 5, 9, 0, 0},// each line contains the numbers from 1 to 9 once.
				{4, 2, 9, 0, 6, 0, 0, 8, 0},// each line contains the numbers from 1 to 9 once.
				{0, 0, 1, 9, 0, 0, 3, 7, 4} // each line contains the numbers from 1 to 9 once.
		};
		System.out.println();//empty space
		// we need to call the solve method over the board in order to solve the
		if(solveTheBoard(board)){
		System.out.println("Sudoku game solution is: ");
			System.out.println();//empty space
		}else{
			System.out.println("This sudoku game it is unsolvable.");
			System.out.println();// empty space
		}
		printBoard(board);// we call to print the board
	}
	// we need to create a printing board method in order to see our board,
	// and the result of our game, by printing the rows and columns
	private static void printBoard(int[][]board){
		for (int row = 0; row < Grid_size ; row++) {//each row start with empty spots,
			// and contain the numbers from 1 to 9 for the game
			for (int column = 0; column < Grid_size; column++) {
				//each column start with empty spots,
				//and contain the numbers from 1 to 9 for the game
				System.out.print(board[row][column] + "|");
				//so we will print the board by each row and column
				// as it was created above, and we include a line to separate the numbers
			}
			System.out.println();// we must print an empty line under each row
			System.out.println("-+-+-+-+-+-+-+-+-+");// separating line
		}
	}
	//we need to check if the number is in the board: - Once in the row
	private static boolean isNumberInTheRow(int[][] board, int number, int row){
		for (int i = 0; i < Grid_size; i++) { //we check if the int i is in the grid size,
			// so the number should be up to 9, as the grid size is 9
			if(board[row][i] == number){ //We check in the grid if in the board and the
				// row the number represented by the int i it is in any of those to
				// return true
				return true;
				/* the if from above will check the int row first, which represents the row,
				and then will check the int i which represents the number we are searching for. */
			}
		}
		return false;
	}
	//we need to check if the number is in the board: - Once in the column
	private static boolean isNumberInTheColumn(int[][] board, int number, int column){
		for (int i = 0; i < Grid_size; i++) { //we check if the int i is in the grid size,
			// so the number should be up to 9, as the grid size is 9
			if(board[i][column] == number){ //We check in the grid if in the board, in
				// the column the number represented by the int i it is in any of those
				// to return true
				return true;
				/* the if from above will check the int i first,
				which represent the number, and so will check the column;
				ex: if int i is at the position 0, the entire column will be checked, and so on. */
			}
		}
		return false;
	}
	// We need to check if our number is in each box of 3x3 box:
	// by checking on each 3x3 box: the number by each column and row in the grid.
	private static boolean isNumberInTheBox(int[][] board, int number, int row , int column){
		int localBoxRow = row - row % 3; /* we need to check in each box by row if a number
		is in a certain location
		*ex: if we take the row 1 divided by 3 is zero (0), with the reminder of 1
		(in other words we check in the above ex, if in the first location it is zero or not,
		as: row 1 - row 1 = 0)*/
		//we check the same as the row, but for each column
		int localBoxColumn = column - column % 3;
		/* in order to check next in each box from the sudoku grid, we need to use a
		* for nest loop as: */
		for (int i = localBoxRow; i < localBoxRow + 3; i++) {
			// this will iterate to all 3 rows in the grid
			for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
				// this will iterate to all 3 columns in the grid
				if(board[i][j] == number){ //we need to check in each boxRow and
					// boxColumn if the number match or not, if yes
 					return true; // will return true, otherwise will return false
				}
			}
		}// all this, for nest loop, will iterate to each 3 by 3 box in the grid
		// to check in each box, by: boxColumn and boxRow
		return false;
	}
	// We need to check if the number is in the Column, the Row and in each Box,
	// by checking the in the board the number by row and column
	private static boolean is_A_Valid_Position(int[][] board, int number, int row, int column ){
		// we call all the above methods and check if the answer is true or false,
		// and so we check the correct position of each number, by checking
		// the row, the column and the box
		return !isNumberInTheRow(board, number, row) &&
				!isNumberInTheColumn(board, number, column) &&
				!isNumberInTheBox(board, number, row, column);

	}
	// We need to make a revers check in the board in order to see if any of number we check
	// already exist in any other row or column and each box
	// in order to not have a double number, and so a false location for a number
	private static boolean solveTheBoard(int[][] board){// we check in the board
		for (int row = 0; row < Grid_size; row++) {
			// to see if the number is matching the position we are looking for in the row
			for (int col = 0; col < Grid_size; col++) {
				// to see if the number is matching the position we are looking for in the column
				if(board[row][col] == 0){// if the board, by row and column the number is zero (0), 
					// we need to loop all the numbers from 1 to 9 to check the correct number
					for (int numberWeCheck = 1; numberWeCheck <= Grid_size ; numberWeCheck++) {
						//the number we check starts from 1 as 0 (zero represents the empty place),
						// and we already defined the grid at a maximum of 9
						if(is_A_Valid_Position(board, numberWeCheck, row, col)){
							// we check a valid position in the board of the number we check
							// by each row and column, and
							board[row][col] = numberWeCheck;// if that number feet,
							// recursively we call to our solve the board
							if (solveTheBoard(board)){
								return true; // as long as the number is true,
							}else{// otherwise, we reset the board to zero (0)
								board[row][col] = 0;// in order to check for the next number
								/* so in this way, the for nest loop will check:
								* if each number from 1 to 9,
								* for each empty position, by iterating
								* for each row and each column, and box
								* until each empty spot in the board have a number which feet
								* in a correct position., otherwise */
							}
						}
					}
					return false; // if the number is false, will check another number which feet,
					// until the return is true; and
				}
			}
		}
		return true; // if is true: the grid, the columns, the rows, and the boxes are solved;
		// and so the game is solved.
	}
}