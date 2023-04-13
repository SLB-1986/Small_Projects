package Arrays;

public class _5_Revers_The_Order_Of_The_Elements {

	/** 5. For a given array, reverse the order of the elements.*/

	public static void main(String[] args) {

		int thisArray[] = {9, 15, 45, 30, 41, 300, 2, 27, 14}; // this is thisArray
		System.out.println("My array contains the following int data: ");
		// in order to print the array this must be printed by the length as follows:

		for (int i = 0; i < thisArray.length; i++) { // can be written as: for (int i: thisArray.length){
			System.out.print(thisArray[i] + ", "); // will be printed i
			// which represents thisArray of type int i plus , and an empty space to be able to read the data
		}

		System.out.println(); // printing empty line in order ot read better the result
		System.out.println();// empty line
		// appealing the revers array algorithm which we applied to the given array (here: thisArray)
		System.out.println("My reversed array is: ");
		reversMyArray(thisArray); // the reverse array is output of the int i thisArray
		for (int i: thisArray){ //can be written as: for (int i = 0; i < thisArray; i++){
			System.out.print(i + ", ");
		}
	}

	// creating the algorithm to revers the data in the array
	static void reversMyArray(int [] myArrayChecked){
		for (int x = 0; x < myArrayChecked.length / 2; x++) { // as long as int x is smaller than
			// the length of my array divided by 2, which we will check:
			int temporary = myArrayChecked[x]; // using a temporary int assigned as
			// the array which is checked of the type int x, which:
			myArrayChecked[x] = myArrayChecked[myArrayChecked.length - x - 1]; // as long as
			// the array is checked of type int x is assigned as the checked array with the value of
			// the length checked array minus int x minus 1, where
			myArrayChecked[myArrayChecked.length - x - 1] = temporary; // the checked array with value
			// of the length of the checked array minus int x minus 1 is assigned as the temporary int
		}
	}
}
