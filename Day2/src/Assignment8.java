import java.util.Scanner;

/**
 * 
 * @author pgayen
 *
 */
public class Assignment8 {

	public static void main(String[] args) {
		int iProduct = 1;
		System.out.println("Type the number for factorial : ");
		// Scan the input
		Scanner scScanner = new Scanner(System.in);
		int iCount = scScanner.nextInt();

		// while loop for
		while (iCount != 0) {
			iProduct = iProduct * iCount;
			iCount--;
		}
		System.out.println("The factorial of " + iCount + "is :" + iProduct);
		scScanner.close();
	}

}
