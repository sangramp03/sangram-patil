//Q4

import java.util.*;
public class SavingTax{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Earning Amount");
	int a=xyz.nextInt();
	
	System.out.println("Enter Investing Amount");
	int b=xyz.nextInt();
	
	int c=a-b;
	System.out.println(c+ " rupees which will not be taxed.");
	
	
  }

}