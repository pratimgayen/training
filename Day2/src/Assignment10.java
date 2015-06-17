import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("The original number: " + i);
		System.out.print("The reverse number: ");
		do {
			int j = i % 10;
			i = i / 10;
			System.out.println(+j);
		} while (i != 0);
	}

}
