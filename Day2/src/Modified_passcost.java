

public class Modified_passcost {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int total_travellers=10;
		boolean traveltype=false;
		boolean daytime=true;
		if (daytime==true){
			System.out.println("Regular pass hours 9 AM � 5 PM, no additional charge applicable"
					);
		}else{
			System.out.println("Evening pass hours 5 PM � 9 PM, additional evening visit charge applicable for each pass");
		
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
int duration=3;
if (traveltype=false && duration==1){
	System.out.println("Added evening fare. No discount");
	
}
else if (traveltype=false && (duration==3 || duration==5) ){
	System.out.println("Added evening fare. Discount for multiple day pass");
	
}

else if (traveltype=true && (duration==1 || duration==3 || duration==5) ){
	System.out.println("No added fare. Discounts based on number of days");
	
}
else if(!(duration==1 || duration==3 || duration==5) ){
	System.out.println("Indicate valid travel pass duration values.");
	
	
}
	}



}
