import java.util.Scanner;

class AddWhile{
	int j=1;
	int sum=0;
	public void add(){
	while(j<=10)
	{
		sum=sum+j;
		j++;
	}
	System.out.println("Sum of first 10 Digit using While Loop  ="+sum);
	}
}
class AddFor{
	int i;
	int sum=0;
	public void add(){
		
		for(i=1;i<=10;i++){
			sum=sum+i;
		}
		System.out.println("Sum of first 10 Digit using For Loop  ="+sum);
	}
}
class AddDoWhile{
	int i=1;
	int sum=0;
	public void add(){
		
		do{
			sum=sum+i;
			i++;
		}
		while(i<=10);
		System.out.println("Sum of first 10 Digit using do while Loop  ="+sum);
	}
}
public class Addition {


	public static void main(String[] args) {
		
		
		System.out.println("Enter The Desired loop to Add 1st 10 digit numbers..");
		System.out.println("=====================================================");
		System.out.println("To use For loop Press 1\nTo use while loop Press 2\nTo use do while loop Press 3\n");
		System.out.println("=====================================================");
		Scanner s = new Scanner(System.in);
		int ch=s.nextInt();		
		
		
		
			switch(ch){
		
		case 1: AddFor aa=new AddFor();
				aa.add();
				break;
			
		case 2: AddWhile a=new AddWhile();
				a.add();
				break;
		
		case 3:	AddDoWhile aaa=new AddDoWhile();
				aaa.add();
				break;
				
		default:System.out.println("Sorry Wrong input");
				break;
				
		}
			
	}
	
}
