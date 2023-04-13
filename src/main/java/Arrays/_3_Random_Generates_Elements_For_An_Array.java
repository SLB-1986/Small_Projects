package Arrays;

public class _3_Random_Generates_Elements_For_An_Array {

	/** 3. Use the Random class to generate elements for an array. */

	public static void main(String[] args) {

		// the next 3 lines of code are just for fun
		double x = Math.random(); //I created a real input x which represents a math random, which
		System.out.println(x); // will return the real self generated random, just for fun
		System.out.println();// empty line

		System.out.println("The self-generated random array length between 0 to 30 is: " + myRangeRandomNumber(0,100));
		// I request to see the self generated number
		// in range of the given minimum (0) and maximum(100) of type int
		System.out.println();// empty line
		int myArray[] = new int[myRangeRandomNumber(0,30)]; // my int array have a self-generated range

		System.out.print("The values of the self-generated array of type int are: ");
		// printing the array self-generated values as int,

		for (int i = 0; i < myArray.length; i++) {// as long as the int i it is smaller
			// than the value of the self-generated array which is self-generated
			myArray[i] = myRangeRandomNumber(0,100); // ourArray of type int i is the assigned
			// self generated data as int
		}
		System.out.println();// this is an empty space line
		System.out.println(); // empty line
		int start = 0; // the count starts from zero
		int end = myArray.length - 1; // this is the self-generated input minus one,
		// as the account starts from 0

		while(start < end){ // as long as the account starts from zero (0),
			// and is smaller than the self-generated number
			int temporary = 0; // our temporary number
			temporary = myArray[start]; // temporary number is myArray, which
			myArray[start] = myArray[end];// starts from zero and end at the self-generated number, and
			myArray[end] = temporary; // which, ends with our temporary number
			start++; // incrementing the start number
			end--; // decrementing the self-generated (random) number
		}

		for (int i = 0; i < myArray.length; i++) { // as long as our input i is smaller than,
			// the self-generated number (the array size), the input will increment, so i
			System.out.print(myArray[i] + "; "); //this line should
			// print the self-generated numbers
		}
		

	}
	static int myRangeRandomNumber(int minimum, int maximum){
		//this will solve the Math.random() as getting the input of a given
		// minimum and a maximum range of number minimum and maximum,
		// which are of type int, where
		int number = (int)(Math.random() * (maximum - minimum)) + minimum;
		// the return will be of type int named number, which will account
		// the Math.random() of type int as:
		// (Math.random)*(maximum-minimum)+minimum, and
		return number;// the return number, of type int, will be in the range of
		// the given minimum and the maximum numbers.
	}
}
