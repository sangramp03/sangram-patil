/* Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill */


import java.util.*;
public class Ebill{
 public static void main(String x[]){
 	
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Unit");
	double unit=xyz.nextDouble();
	double b,s,tb;
	
	

	if(unit<=50){
	b=unit*0.50;
	s=b*0.2;
	tb=b+s;
	System.out.println("bill==> "+b);
	System.out.println("surcharges==> "+s);
	System.out.println("total bill==> "+tb);
	}
	
	else if(unit<=150){
	b=unit*0.75;
	s=b*0.2;
	tb=b+s;
	System.out.println("bill==> "+b);
	System.out.println("surcharges==> "+s);
	System.out.println("total bill==> "+tb);
	}
	
	else if(unit<=250){
	b=unit*1.20;
	s=b*0.2;
	tb=b+s;
	System.out.println("bill==> "+b);
	System.out.println("surcharges==> "+s);
	System.out.println("total bill==> "+tb);
	} 
	
	else if(unit>250){
	b=unit*1.50;
	s=b*0.2;
	tb=b+s;
	System.out.println("bill==> "+b);
	System.out.println("surcharges==> "+s);
	System.out.println("total bill==> "+tb);
	}
  }
}
