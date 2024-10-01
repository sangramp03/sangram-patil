//Write a java program to input angles of a triangle and check whether triangle is valid or not.

import java.util.*;
public class TriangleValidInvalid{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter angle 1");
	int a=xyz.nextInt();
	System.out.println("Enter angle 2");
	int b=xyz.nextInt();
	System.out.println("Enter angle 3");
	int c=xyz.nextInt();
	
	if(a+b+c==180){
	System.out.println("triangle is valid");
	}

	else{
	System.out.println("Triangle is not valid");
	}
  }
}