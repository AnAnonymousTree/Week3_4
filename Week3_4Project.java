package Week3_4_Project;

public class Week3_4Project {

	public static void main(String[] args) {
		
		// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93. 
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		
		// a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int result = ages[ages.length-1] - ages[0];
		System.out.println(result);
		
		// b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		// int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 34 };
		// int result = ages[ages.length-1] - ages[0];
		//System.out.println(result);
		
		// c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
		    sum += ages[i];
		}
		double average = sum / ages.length;
		System.out.println(average);
		
		
		// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		
		// a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		double nameSum = 0;
		for (int i = 0; i < names.length; i++) {
		    nameSum += names[i].length();
		}
		double nameAverage = nameSum / names.length;
		System.out.println(nameAverage);
		
		// b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String group = "";
		for (int i = 0; i < names.length; i++) {
			group += names[i] + " ";
		}
		System.out.println(group);
		
		// 3.	How do you access the last element of any array?
		// By taking the array length and subtracting 1. ages[ages.length-1];
		
		
		// 4.	How do you access the first element of any array?
		// By accessing the 0 position of the array. ages[0];
		
		
		// 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
		}
		
		
		// 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int newSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			newSum += nameLengths[i];
		}
		System.out.println(newSum);
		
		// 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	}
	
		public static String theRepeater(String word, int n) {
		    String finalProduct = "";
		    for (int i = 0; i < n; i++) {
		    	finalProduct += word;
		    }
		    return finalProduct;
		}
		
		// 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

		public static String fullName(String firstName, String lastName) {
			
		    return firstName + " " + lastName;
		}
		
		// 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

		public static boolean sumGreaterThan100(int[] intArray) {
		    int arraySum = 0;
		    for (int intNumber : intArray) {
		    	arraySum += intNumber;
		    }
		    return arraySum > 100;
		}
		
		// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		public static double elementAverage(double[] elementArray) {
		    double elementSum = 0.0;
		    for (double elementNumber : elementArray) {
		    	elementSum += elementNumber;
		    }
		    return elementSum / elementArray.length;
		}
		
		// 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		public static boolean checkArrays(double[] checkArray1, double[] checkArray2) {
		    double checkSum1 = 0.0;
		    double checkSum2 = 0.0;
		    for (double checkNumber : checkArray1) {
		        checkSum1 += checkNumber;
		    }
		    for (double checkNumber2 : checkArray2) {
		    	checkSum2 += checkNumber2;
		    }
		    double checkAverage1 = checkSum1 / checkArray1.length;
		    double checkAverage2 = checkSum2 / checkArray2.length;
		    return checkAverage1 > checkAverage2;
		}
		
		// 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		    return isHotOutside = true && moneyInPocket > 10.50;
		}
		
		// 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		// I've been looking at what variables in my routine are constants for what I would call a good day vs a bad day in order to alter my routine in a way that better prepares -
		// me for how my day is going to end up. 

		public static boolean gonnaBeAGoodDay(boolean rested, boolean slowWorkDay, boolean goodMentalHealth, boolean caughtUp) {
		    if (rested = true && slowWorkDay == true && goodMentalHealth == true && caughtUp == true) {
		    return true; 
		    }
		    else {
		    	return false;
		    }
		}
}

	

