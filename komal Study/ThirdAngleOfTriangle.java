import java.util.*;
public class ThirdAngleOfTriangle{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter first angle of tariangle ");
	int angle1=xyz.nextInt();
	System.out.println("Enter second angle of tariangle ");
	int angle2=xyz.nextInt();
	
	int angle3;
	
	angle3=180-(angle1+angle2);
	System.out.println("Third angle of triangle is \t"+angle3);
  }
}