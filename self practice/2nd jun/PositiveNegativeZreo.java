//Write a C program to check whether a number is negative, positive or zero.

import java.util.*;
public class PositiveNegativeZreo{
  public static void main(String x[]){
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter digit");
	int num=xyz.nextInt();
	
	if(num > 0) {
	 System.out.println("number is positive");
	} 
	else if(num < 0) {
	 System.out.println("number is negative");
	}
	else if(num ==0){
	 System.out.println("number is zero");
	}
	else{
	 System.out.println("invalid input");
	}
  }
}