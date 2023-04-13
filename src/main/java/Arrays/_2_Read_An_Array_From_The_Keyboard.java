package Arrays;

import java.util.Scanner;

public class _2_Read_An_Array_From_The_Keyboard {

	/**  2. Read an array from the keyboard (requires the use of the Scanner class) */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// creating the scanner by calling the scanner class

		System.out.println("In the following line you need to enter the size of the array!");
		System.out.println("Pay attention! How long you make it! Because as higher the number you enter 1st, as many inputs you must enter after.");
		System.out.println("Type the size of the array: ");
		// adding the info we need to ask

		int array = scanner.nextInt();
		// calling the scanner to enter an int - named array
		// declaring the array

		int ourArray[] = new int [array];
		//our array is the type of int array which have
		// the length given by the user using the scanner class created above
		System.out.println();// empty line
		System.out.println("Enter the array values as int: ");
		// requesting the input of ourArray values, as long as :

		for (int i = 0; i < array; i++) {// as long as the int i it is smaller
			// than the value of, the typed, input array which is given by user
			ourArray[i] = scanner.nextInt(); // ourArray of type int i is the
			// data typed by the user
		}

		int start = 0; // the count starts from zero
		int end = array - 1; // this is the scanner input minus one,
		// as the account starts from 0

		while(start < end){ // as long as the account starts from zero (0),
			// and is smaller than the typed number
			int temporary = 0; // our temporary number
			temporary = ourArray[start]; // temporary number is ourArray, which
			ourArray[start] = ourArray[end];// starts from zero and end at the typed number, and
			ourArray[end] = temporary; // ends with our temporary number
			start++; // incrementing the start number
			end--; // decrementing the inserted (typed) number
		}

		for (int i = 0; i < array; i++) { // as long as our input i is smaller than,
			// the given number (array size), the input will increment, so we can
			System.out.print(ourArray[i] + ", "); //ask to print the inserted numbers
			// which were given by the user from the keyboard
		}

	}
}
