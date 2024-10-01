//Write a C program to input month number and print number of days in that month

import java.util.*;
public class MonthnumberOfDays{
  public static void main(String x[]){
  	
	Scanner xyz=new Scanner(System.in);
	
	

	System.out.println("enter choice");
	int choice=xyz.nextInt();

	switch(choice){
	
	case 1:
	System.out.println(" january = 31 days");
	break;

	case 2:
	System.out.println("February 28 days");
	break;

	case 3:
	System.out.println("March 31 days");
	break;

	case 4:
	System.out.println("April 30 days");
	break;

	case 5:
	System.out.println("May 31 days");
	break;

	case 6:
	System.out.println("June 30 days");
	break;

	case 7:
	System.out.println("july 31 days");
	break;

	case 8:
	System.out.println(" August 30 days");
	break;

	case 9:
	System.out.println("September 31 days");
	break;

	case 10:
	System.out.println("October 31 days");
	break;

	case 11:
	System.out.println("November 30 days");
	break;

	case 12:
	System.out.println("December 31 days");
	break;

	default:
	System.out.println("invalid input");
	break;
	}
  }
}