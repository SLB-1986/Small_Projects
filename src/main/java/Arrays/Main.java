package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Main {
	/** Assignments:
	 1. For an array of elements count the number of occurrences of a given element.
	 (experiment with arrays of numbers and strings)

	 2. Read an array from the keyboard (requires the use of the Scanner class)

	 3. Use the Random class to generate elements for an array.

	 4. Generate a random array of numbers and search for a specific one.
	 If you find it then use a named break to exit the loop.

	 5. For a given array, reverse the order of the elements.

	 6. Implement the bubble sort algorithm. */

	public static void main(String[] args) {

		Random myRandom = new Random(); // my random
		Scanner myScanner = new Scanner(System.in); // my scanner
		System.out.println(); // printing empty line
		System.out.println("Attention!! As bigger the number you enter, is as many times you need to type your next data, minus one!");

		StringBuilder myInput = new StringBuilder(); // using the string builder to read and to return the value of a string
		System.out.println("Type your keys from the keyboard: "); // adding an info that we use the scaner in the next line
		myInput.append(myScanner.nextLine()); // using the scanner to get an input
		System.out.println("myInput is " + myInput); // returning my input as it was given
		myInput.reverse(); // reversing the given input
		System.out.println("myInput reversed is " + myInput); // is printing myInput reversed

		System.out.println("--------------"); // creating a line between inputs
		System.out.println("Attention!! As bigger the number you enter, is as many times you need to type your next data, minus one!");
		System.out.println("Type your int value: "); // Calling to give a value to our int a from the next line using the scanner
		int a = myScanner.nextInt(); // int a get a given value by the user
		System.out.println("Type your String: "); // requesting some input as a string
		String myString []= new String[a]; // I created one array of type String in length of the given value to the int a from above
		for (int j = 0; j < a ; j++) { //
			myString[j] = myScanner.nextLine();
		}// for as high is the given value to the input of int a , j is incrementing as many times the value of the Sting
		for (String thisString : myString){
			System.out.println(myString.length); // i requested to print the length of my array of string of type a
			System.out.println(thisString); //
		}//
			System.out.println();

		/* by the given value to the int a, is the amount of random generated numbers*/
		Integer myInteger [] = new Integer[a];
		Integer reverse[] = new Integer[a];
		for (int i = 0; i < a; i++) {
			myInteger[i] = myRandom.nextInt(100);

				System.out.println(myInteger); // printing the myInteger value, which is equal to the given value to the int a
				System.out.println(reverse); // printing the revers of the int a
		}
		int k = 1;
		for (int x = 0; x < a; x++) {
			reverse [x] = myInteger[myInteger.length - k];
			k++;
		}

		System.out.println("The random generated numbers from the given value of" + a + "are: ");

		for (Integer x :myInteger){
				System.out.println(x);
		}

	}

}
