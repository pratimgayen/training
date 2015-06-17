import java.util.Scanner;

/**
 * Assignment7 - this is a program to calculate sum n numbers using a for loop
 * 
 * @author pgayen
 *
 */
public class Assignment7 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");

		// Scan the input
		Scanner scScanner = new Scanner(System.in);
		int iInputNumber = scScanner.nextInt();
		int iSum = 0;

		// Loop through the input number
		for (int iCount = 1; iCount <= iInputNumber; iCount++) {
			iSum = iSum + iInputNumber;
		}
		System.out.println("Sum of " + iInputNumber
				+ " Number using For Loop  =" + iSum);

		// Closing the Scanner
		scScanner.close();
	}
}
