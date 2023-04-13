package Arrays;

//import static Arrays._4_Genareate_A_Random_Array_And_Search_A_Specific_One.generateRandom;

import java.util.Scanner;

public class _1_Count_The_Number_Of_Occurrences {

	/** 1. For an array of elements count the number of occurrences of a given element.
			(experiment with arrays of numbers and strings) */

	public static void /*countNumber()*/main(String[] args) {
		System.out.println("------------1-------------");
		/** option one, from a given array: */

		int []array = new int []{9, 5, 5, 3, 4, 3, 2, 3, 1, 2, 4, 8, 7, 10, 2, 9, 0, 2, 2, 4};
		System.out.println("My array have a length of: " + array.length + " and the stored numbers of the array are: ");
		for(int i: array){
			System.out.print(i+ "; "); // printing the array input followed after each number by ;
		}
		System.out.println();// empty line

		int []checkArray = new int [array.length];
		// checkArray represents the length of the array[] of type int, and
		// this is necessary in order to be able to check using the for loop

		int checked = -1; // to check the maximum length -1,

		for (int i = 0; i < array.length; i++) { // for long as the int i is smaller than the length
			// of array, the i will be incremented from 0 in order
			int count = 1; // to count with one, to check the maximum length in the next for loop

			for (int j = i + 1; j < array.length; j++) {// for as long as int j is i +1, and j
				// is smaller than the length of array, the int j will be incremented i +1,
				if(array[i] == array[j]){// if array of int i is equal to array of int j,
					count++;// is counted by incrementation starting with one, as
					checkArray[j] = checked;// long as the checkArray of j is checked
				}
			}

			if (checkArray[i] != checked){// if the checked array of int i is not checked,
				checkArray[i] = count;// the checkArray of int i is counted,
			}
		}
		for (int m = 0; m < checkArray.length; m++) {//for as long the int m is smaller than zeron
			// and up to the length of the checkArray, minus one,
			if(checkArray[m] != checked){
				System.out.println("Frequency of " + array[m] + " occur " +
						(checkArray[m] >= 1 ? "times" : " time"));//if checkArray[m] is higher than 1 print times otherwise print time
			}

		}

		System.out.println();// empty line
		System.out.println("------------2-------------");
		/** option two - the crazy one - , by using the scanner: */

		Scanner scanner = new Scanner(System.in);

//		int number = generateRandom(); // with this line I call the mathRandom from the interface 4

		int[] counting = new int[10/*generateRandom()*/]; // we check how long shall be the counting occurrence

		System.out.println ("Type your numbers from 1 to 10 to check the occurrence, and 0 to run the program: ");
		int number = scanner.nextInt();

		for (int i = 0; i < counting.length; i++) {
			if(number <= 10){
				break;
			}
			if(number > 10){
				continue;
			}

			while (number != 0 ){ //as long as the generated random number/given number,
				// here named number is not equal to zero (0),
				counting[number]++; // is counting by incrementation to check
				// as the generated random/the typed input number
				number = scanner.nextInt();//have an occurrence of the given numbers
			}

		}
		System.out.println("and have and occurrence of: ");
		for (int i = 0; i < counting.length; i++) {// is checking as many times the given
			// int i ont the length is counted by incrementation,
			if(counting[i] != 0){//as long as the counted i is not equal to zero (0)
				System.out.println("Frequency of "+ (i + 1) + " occur "
						+ counting[i] +
						(counting[i] > 1 ? " times" : " time") );
			}
		}

		System.out.println();// empty line
		System.out.println("------------3-------------");
		/**option three - occurrence in a String and erasing a certain char */
		System.out.println("Occurrence in a String: ");
		// the next word is the longest in the world....
		String thisString = "pneumonoultramicroscopicsilicovolcanoconiosis"; // i do not intend to read that word
		char charArrayOfString[] = thisString.toCharArray(); // thisString is set as an array of characters charArrayOfString
		int size = thisString.length(); // checking the length of the string
		System.out.println("The length of this string is: "+thisString.length() + " characters.");
		char characterKey = 'o'; // this will be the char which will be erased
		System.out.println("The characterKey we are searching to delete is: " +characterKey+ " .");
		System.out.println();
		int search = 0; // everything starts the account form zero (0)
		String emptyString = ""; // this is an empty String

		while (search != size){ //as long as the int search is not equal to int size which represents
			// the length of the used String (thisString)
			if (charArrayOfString[search] != characterKey){//if the array of characters charArrayOfString
				// in int search is not equal to the character which we check for as (characterKey)
				emptyString = emptyString + charArrayOfString[search];// than emptyString is
			}
			search++;
		}
		System.out.println("My String is: " + thisString);
		System.out.println();
		System.out.println("The String after erasing a certain characterKey is: "+ emptyString);
		System.out.println("And have a length of "+ emptyString.length() + " .");


	}
}
