package DayThreeAssignment;


import java.util.Scanner;

/**
 * Assignment2- Stack function using array
 * @author pgayen
 *
 */
public class Assignment2 {
		final int sNumber=10;
		int array[] = new int[sNumber];  
		int top = -1; 
		
	
	 public void push(int pushedElement) {  
		 
		if (top < sNumber - 1) {  
		   top++;  
		   array[top] = pushedElement;  
		   System.out.println("Element " + pushedElement  
		     + " is pushed to Stack !");  
		   printElements();  
		  } else {  
		   System.out.println("Stack Overflow !");  
		  }  
		 }  
		  
		 public void pop() {  
		  if (top >= 0) {  
		   top--;  
		   System.out.println("Pop operation done !");  
		  } else {  
		   System.out.println("Stack Underflow !");  
		  }  
		 }  
	
		 public void printElements() {  
			  if (top >= 0) {  
			   System.out.println("Elements in stack :");  
			   for (int i = 0; i <= top; i++) {  
			    System.out.println(array[i]);  
			   }  
			  }  
			 }  
		
		public static void main(String[] args) {
		Assignment2 assign=new Assignment2();
		
		String answer;
		do{
			
		System.out.println("===============================================");
		System.out.println("|  Enter The Operation you want in stack      |");
		System.out.println("|  For Push Press                    -    1   |");
		System.out.println("|  For Pop Press                     -    2   |");
		System.out.println("|  For Getting list in Stack Press   -    3   |");
		System.out.println("|                                             |");
		System.out.println("===============================================");
		

		// Scan input

		Scanner scanner = new Scanner(System.in);
		int character = scanner.nextInt();
		switch (character) {

		case 1: System.out.println("Enter the number to Push : "); 
		
			int pushNumber=scanner.nextInt();
			assign.push(pushNumber);
			break;

		case 2: assign.pop();
			break;

		case 3: assign.printElements();
			break;
			
		default: System.out.println("Sorry Wrong input try again");
		break;
		}	
		
		
		
		System.out.println("Want to Continue? \nIf YES then Press Y \nIf NO then Press N ");
		answer=scanner.next();
		
		}
		while(answer.equalsIgnoreCase("Y"));
	}

}
