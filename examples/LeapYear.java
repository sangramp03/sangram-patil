import java.util.*;
public class LeapYear{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	
	System.out.println("Enter Year");
	int year=xyz.nextInt();
	String result=((year%4==0)? ("Leap year"):("Not leap year"));
	System.out.println(result);
  }
}