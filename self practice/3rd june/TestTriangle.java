//Write a java program to check whether the triangle is equilateral, isosceles or scalene triangle.


import java.util.*;
public class TestTriangle{
  public static void main(String x[]){
	
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter side 1--> ");
	int a=xyz.nextInt();
	System.out.println("Enter side 2--> ");
	int b=xyz.nextInt();
	System.out.println("Enter side 3--> ");
	int c=xyz.nextInt();
	
	if(a==b && b==c && c==a){
	System.out.println("Equilateral Triangle");
	}
	
	else if(a==b){
	System.out.println("isosceles Triangle");
	}
	
	else {
	System.out.println("scalene Triangle");
	}
  }
}