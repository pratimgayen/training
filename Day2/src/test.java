import java.util.Scanner;

/**
 * Assignment 1-The reverse of the digit
 * 
 * @author pgayen
 *
 */

public class test {

	public int character;

	public int Count(int character) {
		int count = 0;
		this.character = character;
		while (character > 0) {
			character = character / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		// Scan the Input

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int character = scanner.nextInt();
		test a = new test();
		int nums = a.Count(character);
		int[] numbers = new int[character];

		// Loop to insert number to the array

		for (int iCount = 0; iCount < nums; iCount++) {
			int ch = character % 10;
			numbers[iCount] = ch;
			character = character / 10;
		}
		System.out.print("Reverse of the number is ");

		// Loop to print the array

		for (int iCount = 0; iCount < nums; iCount++) {
			System.out.print(numbers[iCount]);
		}
		scanner.close();
	}

}
