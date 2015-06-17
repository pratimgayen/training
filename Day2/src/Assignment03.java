import java.util.Scanner;
/**
 * Assignment-3 to find the pass cost
 * @author pgayen
 *
 */

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_travellers=10;
		boolean traveltype=true;
		int time;
		//Scan the input
		System.out.println("Enter the time \nFor Daytime travel Press 1 \nFor Eveningtime travel Press 2");
		Scanner scanner=new Scanner(System.in);
		time=scanner.nextInt();
		if (time==1){
			System.out.println("Regular pass hours 9 AM – 5 PM, no additional charge applicable"
					);
		}else{
			System.out.println("Evening pass hours 5 PM – 9 PM, additional evening visit charge applicable for each pass");
		
		}
double cost=2000;
boolean displaytype=true;
if (displaytype==true){
	System.out.println("Total base cost is"+cost);
	
			
}else{
	System.out.println("Total cost is"+3.5*cost);

}
int nonTravelrs=5;
int normTravelrs=total_travellers-nonTravelrs;
double totalcost=(nonTravelrs*3.5*cost)+(normTravelrs*cost);
System.out.println("Total cost is "+totalcost);

	}

}
