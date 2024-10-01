//Write a C program to check whether a year is leap year or not.

import java.util.*;
public class LeapYear{
  public static void main(String x[]){
  	Scanner xyz=new Scanner(System.in);
	System.out.println("enter year");
	int year=xyz.nextInt();
	
	/* if(year%4==0){
	 System.out.println("Leap year");
	}
	
	else{
	
	if(year%4!=0){
	 System.out.println(" not a Leap year");
	 }
	
	else{
	 System.out.println("Invalid input");
	 }
	} */
	
	String result=((year%4==0)? ("Leap year"):("Not leap year"));
	 System.out.println(result); 
  }

}