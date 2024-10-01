//Write a C program to find maximum between two numbers

import java.util.*;
public class MaximumNum{
  public static void main(String x[]){
  	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=xyz.nextInt();
	int b=xyz.nextInt();

	/* if(a>b){
	System.out.println(" first is greater");
	}
	
	else{
	System.out.println(" Second is greater");
	} */

	String result=((a>b)? ("first is greater"):("second is greater"));
	System.out.println(result);
  }
}