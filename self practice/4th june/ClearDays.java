//Q2

import java.util.*;
public class ClearDays{
  public static void main(String x[]){


	Scanner xyz=new Scanner(System.in);
	System.out.println("enter rainy days in week");
	int a=xyz.nextInt();
	System.out.println("enter cloudy days week");
	int b=xyz.nextInt();
	int total=a+b;
	
	int c=7-total;
	System.out.println("Number of clear days in week==> "+c);
	
	
  }
	
}





			