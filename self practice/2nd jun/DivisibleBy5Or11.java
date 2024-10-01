//Write a C program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
public class DivisibleBy5Or11{
  public static void main(String x[]){
  
  	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int num=xyz.nextInt();

	/* if(num%5==0 && num%11==0){
	System.out.println("number is divisible by 5 or 11");
	}
	
	else{
	System.out.println("number is not divisible by 5 or 11");
	}	*/

	 String result=((num%5==0 && num%11==0)? ("number is divisible by 5 or 11"):("number is not divisible by 5 or 11"));
	System.out.println(result); 
  }
}