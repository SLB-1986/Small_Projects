package Arrays;

public class _4_Genareate_A_Random_Array_And_Search_A_Specific_One {

	/** 4. Generate a random array of numbers and search for a specific one.
	 If you find it then use a named break to exit the loop.
	 * @return*/

	public static void /*generateRandom()*/ main(String[] args) {
		// if is changed the class with interface and comment the public,
		// and changing the void with int
		// and by commenting main(String[] args amd uncomment generateRandom())
		// we can run this program in other class as self-generating random numbers

		int mathRandom = rangeRandom(6,10);
		//i've called the Math.random of type int to generate an int of
		// range 0 to a maximum 10 for a random value
		// which will represent my int mathRandom, by calling the rangeRandom
		System.out.println("The self-generated array have a length of: " + mathRandom);
		// the above line will return the self-generated number
		// which will represent the array size
		System.out.println(); // this is an empty space line

		int myArray[] = new int[mathRandom]; //int myArray will be of the length
		// of self generated Math.random() of type int for the mathRandom of type int

		System.out.print("The values of the self-generated array of type int are: ");
		// printing the array self-generated values as int,

		for (int i = 0; i < myArray.length; i++) {// as long as the int i it is smaller
			// than the value of the self-generated array which is self-generated
			myArray[i] = rangeRandom(0,49); // ourArray of type int i is the assigned
			// self generated data as int
		}
		System.out.println();// this is an empty space line

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

//		return mathRandom; // this line is created in order to be able to implement mathRandom to other interfaces
		System.out.println(); // empty line
		System.out.println(); // empty line
		System.out.println("Searching for my Lottery 6 numbers from a total of 49 numbers: ");
		System.out.println("If returns -1, means: number not fount. " +
				"Otherwise will return the position of the number which is accurate in the array.");
		System.out.println(); //empty line
		System.out.println(binarySearch(myArray, 9));
		System.out.println(binarySearch(myArray, 10));
		System.out.println(binarySearch(myArray, 24));
		System.out.println(binarySearch(myArray, 13));
		System.out.println(binarySearch(myArray, 33));
		System.out.println(binarySearch(myArray, 46));
	}

	static int rangeRandom(int min, int max){
		//this will solve the Math.random() as getting the input of a given
		// min and a max range of number min and max,
		// which are of type int, where
		int number = (int)(Math.random() * (max - min)) + min;
		// the return will be of type int named number, which will account
		// the Math.random() of type int as:
		// (Math.random)*(max-min)+min, and
		return number;// the return number, of type int, will be in the range of
		// the given min and the max numbers.
	}

	private static int binarySearch (int []numbers, int nrToFind){
		int low = 0; // the lowest nr
		int high = numbers.length -1; // the highest number in the length from the array

		while (low <= high){ // wile the low nr is smaller or equal to the high number
			int middlePostion = (low + high) / 2; // the middlePosition is (low + high) /2
			int middleNumber = numbers[middlePostion];

			if(nrToFind == middleNumber){
				return middlePostion;
			}
			if(nrToFind < middleNumber){
				high = middlePostion - 1;
			}else{ // we know that middlePosition it is greater
				low = middlePostion + 1;
			}
		}
		return -1; // if -1 is returned it means it was not found
	}

}
