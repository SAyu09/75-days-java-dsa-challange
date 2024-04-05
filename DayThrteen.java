
//-----Wrapper class ----


// Importing input output classes 
import java.io.*;

// Main class
class GFG {

	// Main driver method
	public static void main (String[] args) {

		// Creating and initializing two integer numbers
		// Value is passed as an argument to which it is initialized
		
		// Custom entries 
		// Number 1 where N = 5
		Integer num1 = new Integer(5);
		// Number 2 where N = 5
		Integer num2 = new Integer(5);
		
		// Creating objects of Integer class
		// using valueOf() method
	
		// Again, creating and initializing two integer numbers
		// Value is passed as an argument to which it is initialized
		Integer num3 = Integer.valueOf(5);
		Integer num4 = Integer.valueOf(5);
		

		// Now by far, all the objects contain the same value
		// N = 5
		
		// Boolean will return true if numbers are equal
		// else returning false

		// Comparing two numbers 
		boolean value1 = (num1 == num2);
		boolean value2 = (num3 == num4);
		
		// Print and display the bool results 
		System.out.println(value1);
		System.out.println(value2);
	}
}
