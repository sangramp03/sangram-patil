/*Q1. Write a menu-driven program in java using switch case.
	1.Addition
	2.Subtraction
	3.Multiplication
	4,Division*/


import java.util.*;
public class SwitchQ1{
   public static void main(String x[]){


	Scanner xyz=new Scanner(System.in);
	int a,b;
	System.out.println("1) Addition");
	System.out.println("2) Subtraction");
	System.out.println("3) Multiplication");
	System.out.println("4) Division");
	
	System.out.println("enter choice");
	int choice=xyz.nextInt();
	
	switch(choice){
	
		case 1:
		System.out.println("Enter first number");
		a=xyz.nextInt();
		System.out.println("Enter Second  number");
		 b=xyz.nextInt();
		System.out.println("Addition is => "+(a+b));
		break;
	
		case 2:
		System.out.println("Enter first number");
		 a=xyz.nextInt();
		System.out.println("Enter Second  number");
		b=xyz.nextInt();
		System.out.println("Subtraction is => "+(a-b));
		break;
	
		case 3:
		System.out.println("Enter first number");
		a=xyz.nextInt();
		System.out.println("Enter Second  number");
		b=xyz.nextInt();
		System.out.println("Multiplication is => "+(a*b));
		break;
	
		case 4:
		System.out.println("Enter first number");
		a=xyz.nextInt();
		System.out.println("Enter Second  number");
		b=xyz.nextInt();
		System.out.println("Division is => "+(a/b));
		break;
		
		default:
		System.out.println("Enter valid input");
	}
  }

}