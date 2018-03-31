import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in a set of numbers to sort. Separate each number with a space...");
		
		//Initiate an array with all the user-inputed numbers as Strings
		String[] numArrAsString = in.nextLine().split(" ");
		
		int[] numArr = new int[numArrAsString.length];
		
		//Convert all numbers to integers which will be stored in  numArr
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(numArrAsString[i]);
		}
		
		//Sort
		for(int i = 0; i < numArr.length - 1; i++) {
			for(int j = 0; j < numArr.length - i - 1; j++) {
				if(numArr[j] > numArr[j + 1]) {
					int toSwap = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = toSwap;
				}
			}
		}
		
		/*Explanation:
		 * Nested for loops are needed to because if you only have the first loop, only the largest number will be sorted (it will "bubble" up to the last index of the aray).
		 * Continuous passes through the array are needed in order to make sure ever element is sorted.
		 * A temporary variable, toSwarp, is created because elements in the array need to be swapped. 
		 * 	 When copying one element to the other, both indices will contain the same element. 
		 *   In order to copy the original value to another index, a temporary variable must be created to hold the value before switching.
		 * Lastly, bubble sort requires one last pass through the whole array without any swaps to ensure completion.
		 */
		
		//Print out final, sorted array of numbers
		System.out.println(Arrays.toString(numArr));
		
		//Close the scanner to prevent leaks
		in.close();
		

	}

}
