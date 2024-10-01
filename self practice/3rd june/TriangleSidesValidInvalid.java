//Write a java program to input all sides of a triangle and check whether triangle is valid or not.

import java.util.*;
public class TriangleSidesValidInvalid{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter side 1---> ");
	int a=xyz.nextInt();
	System.out.println("Enter side 2---> ");
	int b=xyz.nextInt();
	System.out.println("Enter side 3---> ");
	int c=xyz.nextInt();

	if(a+b>c && b+c>a && a+c>b){
	System.out.println("triangle is valid");
	}
	
	else{
	System.out.println("triangle is invalid");
	}
  }
}