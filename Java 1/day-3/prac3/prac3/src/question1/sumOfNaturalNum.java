//Q1) The set of positive numbers starting from 1 is known as Natural Numbers. The sum of
//the first N natural numbers is given by the formula [N * (N + 1)] / 2 For example, given a
//number 5, the sum of the first 5 natural numbers will be[5 * (6)]/2 = 15
//● Write a Java class with a static method that will take a number as a parameter, and print the
//sum of the natural number from 1 to the number supplied as the method argument.
//● Call the above-defined method from the main method of that class by supplying any number
//as an argument and print the result.
//

package question1;

public class sumOfNaturalNum {

	static int sumOfNaturalNumbers(int N) {
		return N * (N + 1) / 2;
	}

	public static void main(String args[]) {
		


		System.out.println("Sum of Natural Numbers is: " + sumOfNaturalNumbers(7));
	}

}
