package DayThreeAssignment;

import java.util.Scanner;

/**
 * Assignment 4- this is a 2D array with 10 countries name and there 5 cities
 * name
 * 
 * @author pgayen
 *
 */
public class Assignment4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] countries = new String[10][6];
		System.out.println("Enter 10 Countries Name : ");
		// Loop 10 times
		for (int iCount = 0; iCount < 10; iCount++) {
			// Scan the input

			String country_name = scanner.nextLine();
			countries[iCount][0] = country_name;

		}
		// Loop for the array
		for (int iCount = 0; iCount < 10; iCount++) {
			System.out
					.println("Enter 5 cities name of " + countries[iCount][0]);
			for (int jCount = 1; jCount < 6; jCount++) {
				// Scan the input

				String city_name = scanner.nextLine();
				countries[iCount][jCount] = city_name;

			}
		}
		// Loop for printing the array
		for (int iCount = 0; iCount < 10; iCount++) {
			// Loop for the row
			System.out.println(" ");
			for (int jCount = 0; jCount < 6; jCount++) {

				System.out.print(countries[iCount][jCount] + " ");
			}
		}
		scanner.close();
	}

}
