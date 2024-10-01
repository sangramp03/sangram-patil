//Write a java program to calculate profit or loss.

import java.util.*;
public class ProfitLoss{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter cost price");
	int cp=xyz.nextInt();
	System.out.println("Enter selling price");
	int sp=xyz.nextInt();
	

	/*if(cp<sp){
	 System.out.println("profit");
	}
	else if(sp<cp){
	System.out.println("loss");
	}
	
	else{
	System.out.println("No profit No loss");
	}*/

	String result=((cp<sp)? ("profit"):(cp>sp)? ("loss"):("No profit No loss"));
	System.out.println(result);
  }
}