
//----------  Reverse arrray -------------


public class ReverseArrayExtraArray {
	public static void reverseArrayExtraArray(int[] arr) {
		int[] reversedArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArr[i] = arr[arr.length - i - 1];
		}

		// Print reversed array
		System.out.print("Reversed Array: ");
		for (int i : reversedArr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] originalArr = {1, 2, 3, 4, 5};
		reverseArrayExtraArray(originalArr);
	}
}



//-------Program for array left rotation by d positions----------



import java.io.*;

class GFG {


// Function to rotate array
static void Rotate(int arr[], int d, int n)
{ d=d%n;
	// Storing rotated version of array
	int temp[] = new int[n];

	// Keeping track of the current index
	// of temp[]
	int k = 0;

	// Storing the n - d elements of
	// array arr[] to the front of temp[]
	for (int i = d; i < n; i++) {
		temp[k] = arr[i];
		k++;
	}

	// Storing the first d elements of array arr[]
	// into temp
	for (int i = 0; i < d; i++) {
		temp[k] = arr[i];
		k++;
	}

	// Copying the elements of temp[] in arr[]
	// to get the final rotated array
	for (int i = 0; i < n; i++) {
		arr[i] = temp[i];
	}
}

// Function to print elements of array
static void PrintTheArray(int arr[], int n)
{
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main (String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int N = arr.length;
		int d = 2;

		// Function calling
		Rotate(arr, d, N);
		PrintTheArray(arr, N);
	}
}

// This code is contributed by ishankhandelwals.
