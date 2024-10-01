//Write a C program to check whether a number is even or odd.

import java.util.*;
public class EvenOdd{
  public static void main(String x[]){
  
   	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	
	/* if(num%2==0){
	System.out.println("Even Number");
	}
	
	else{
	 System.out.println("Odd Number");
	}*/
	String result=(num%2==0 ? ("even"):("odd"));
	System.out.println(result); 
   
  }
}