package Arrays;

public class _6_BubbleSort {

	/**
	 * 6. Implement the bubble sort algorithm.
	 * Bubble sort algorithm - is known as the simplest sorting algorithm,
	 * comparing two by two elements in order and swapping them in the right order.*/

	public static void main(String[] args) {int my_Arr[] = {9, 15, 45, 30, 41, 300, 2, 27, 14}; // this is the array

		// in order to print the array this must be printed by the length as follows:
		System.out.println("My array contains the following int data: ");
		for (int i = 0; i < my_Arr.length; i++) {// can be written as: for (int i: myArray.length){
			System.out.print(my_Arr[i] + ", ");// will be printed int i
			// which represents my_Arr of type int i plus , and an empty space to be able to read the data
			// here int i is identified as the inputs of type int from the given array (here: my_Arr)
		}
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println("The length of my array is: " + my_Arr.length);
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println("Which is sorted is as: ");
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println("In ascending order: ");bubbleSortIncrement(my_Arr); // this will return
		// the sorted array of elements using the bubble sort created
		for (int i: my_Arr){
			System.out.print(i + ", ");
		}
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println(); // printing empty line in order ot read better the result
		System.out.println("In descending order: ");bubbleSortDecrement(my_Arr);
		for (int i: my_Arr){
			System.out.print(i + ", ");
		}
		System.out.println(); // printing empty line in order ot read better the result
	}


	static void bubbleSortIncrement(int [] myArray) {

		for (int i = 0; i < myArray.length -1 ; i++) { //as long as int i is smaller than the
			// length of myArray -1, increment the int i
			for (int j = 0; j < myArray.length - i - 1; j++) { // as long as the int j is smaller than the
				//length of myArray minus int i -1, incrementing the int j
				if (myArray[j] > myArray[j + 1]){ // in order to revers myArray must be checked if
					// myArray of int j is bigger than myArray of int i -1
					int temporary = myArray[j];// I've created a temporary array in order to be able
					// to sort all myArray inputs which are equal with myArray of int j
					myArray[j] = myArray[j + 1]; // The algorithm will check as long as myArray of j
					// is different of myArray of j+1
					myArray[j + 1] = temporary; // and as long as
				}
			}
		}
	}

	static void bubbleSortDecrement(int [] myArray) {

		for (int i = 0; i < myArray.length -1 ; i++) {//as long as int i is smaller than the
			// length of myArray -1, increment the int i
			for (int j = 0; j < myArray.length - i - 1; j++) {// as long as the int j is smaller than the
				if (myArray[j] < myArray[j + 1]){ // in order to revers myArray must be checked if
					// myArray of int j is smaller than myArray of int i -1
					int temporary = myArray[j];// I've created a temporary array in order to be able
					// to sort all myArray inputs which are equal with myArray of int j
					myArray[j] = myArray[j + 1]; // The algorithm will check as long as myArray of j
					// is different of myArray of j+1
					myArray[j + 1] = temporary; // and as long as
				}
			}
		}
	}

}
