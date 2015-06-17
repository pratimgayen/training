import java.util.Scanner;

/**
 * Assignment -11 This is a program to print the shapes of the desired user
 * input
 * 
 * @author pgayen
 *
 */

// Class for making the Square shape

class Patternfour {
	public Patternfour() {

		// Scan the input

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int iInputNumber = scanner.nextInt();

		// Loop through the input numbers

		for (int iCount = 1; iCount <= iInputNumber; iCount++) {
			if (iCount == 1 || iCount == iInputNumber) {
				for (int jCount = 1; jCount <= iInputNumber; jCount++) {

					System.out.print("* ");

				}
				System.out.print("\n");
			}

			else if (iCount > 1 || iCount < iInputNumber) {
				System.out.print("*");
				for (int kCount = 1; kCount < (2 * iInputNumber) - 2; kCount++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.print("\n");
			}
		}
		scanner.close();
	}
}

// Class for making upside down staircase

class Patternthree {
	public Patternthree() {

		// Scan the input

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int iInputNumber = scanner.nextInt();

		// Loop through the input number

		for (int iCount = 1; iCount <= iInputNumber; iCount++) {
			for (int jCount = 0; jCount <= (iInputNumber - iCount); jCount++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();
	}
}

// class for making simple staircase

class Patterntwo {
	public Patterntwo() {
		// Scan Input Number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no: ");
		int iInputNumber = scanner.nextInt();

		// Loop through the input number

		for (int iCount = 1; iCount < iInputNumber; iCount++) {
			for (int jCount = 1; jCount <= iCount; jCount++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}
		scanner.close();
	}
}

// class for making diamond shape

class Patternone {

	public Patternone() {

		// Scan input number

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int iInputNumber = scanner.nextInt();

		// Loop through the input number

		for (int iCount = 1; iCount <= iInputNumber; iCount++) {
			for (int jCount = 0; jCount < (iInputNumber - iCount); jCount++)
				System.out.print(" ");
			for (int jCount = 1; jCount <= iCount; jCount++)
				System.out.print("*");
			for (int k = 1; k < iCount; k++)
				System.out.print("*");
			System.out.println();

		}
		scanner.close();
	}
}

// Main Class

public class Assignment11 {
	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("|  Enter The Desired Shape you want to have   |");
		System.out.println("|  For a square Press                -    1   |");
		System.out.println("|  For a upside down staircase Press -    2   |");
		System.out.println("|  For a simple staircase Press      -    3   |");
		System.out.println("|  For a diamond shape Press         -    4   |");
		System.out.println("|                                             |");
		System.out.println("===============================================");
		System.out.println(".===.");

		// Scan input

		Scanner scanner = new Scanner(System.in);
		int character = scanner.nextInt();
		System.out.println("'==='");

		// Switch case

		switch (character) {

		case 1:
			Patternfour four = new Patternfour();
			break;

		case 2:
			Patternthree three = new Patternthree();
			break;

		case 3:
			Patterntwo two = new Patterntwo();
			break;

		case 4:
			Patternone one = new Patternone();
			break;

		default:
			System.out.println("Sorry Wrong input");
			break;

		}
		scanner.close();
	}

}
