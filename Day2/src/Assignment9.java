import java.util.Scanner;

public class Assignment9 {

	public static void main(String args[]) {
		int sum = 0;
		System.out.println("The original number is: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		do {
			int j = i % 10;
			sum = sum + j;
			i = i / 10;

		} while (i != 0);
		System.out.println("The sum of the number: " + sum);
	}
}
