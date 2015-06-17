import java.util.Scanner;

/**
 * Assignment 2- this is a program to calculate fare
 * 
 * @author pgayen
 *
 */

public class Assignment02 {

	public int aNumber;
	final static int adultfare = 500;

	/**
	 * this is a method to count the fare of adult
	 * 
	 */
	public void countAdult(int aNumber) {
		this.aNumber = aNumber;
		int totalcost = aNumber * adultfare;
		System.out.println("Total Cost of " + aNumber + " Adult's Fare = Rs "
				+ totalcost);
		int totalcosttax = (totalcost * 114) / 100;
		System.out.println("Total Cost of " + aNumber
				+ " Adults's Fare after adding service Tax 14% = Rs "
				+ totalcosttax);
	}

	/**
	 * this is a method to count the fare of adult
	 * 
	 */
	public void countChild(int aNumber) {
		this.aNumber = aNumber;
		int totalcost = (int) (aNumber * adultfare * 0.7);
		System.out.println("Total Cost of " + aNumber + " Children's Fare = Rs "
				+ totalcost);
		int totalcosttax = (totalcost * 114) / 100;
		System.out.println("Total Cost of " + aNumber
				+ " Children's Fare after adding service Tax 14% = Rs "
				+ totalcosttax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scan the Input

		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of adults : ");
		int aCount = scanner.nextInt();
		System.out.println("Number of child : ");
		int cCount = scanner.nextInt();

		Assignment02 as = new Assignment02();
		System.out.println("Base Fare of Adult = Rs " + adultfare);
		as.countAdult(aCount);
		int childfare = (int) (adultfare * 0.7);
		System.out.println("Base Fare of Child = Rs " + childfare);
		as.countChild(cCount);
	}

}
