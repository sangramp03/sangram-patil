//Write a C program to find maximum between three numbers.
import java.util.*;
public class MaximumBetThree{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("enter three numbers");
	int a=xyz.nextInt();
	int b=xyz.nextInt();
	int c=xyz.nextInt();
	
	if(a>b && a>c){
	System.out.println("first is greater");
	}
	
	else {
	if(b>a && b>c){
	System.out.println("Second is greater");
	 }
	else{
	System.out.println("third is greater");
	 }
	} 

	//String result((a>b && a>c)? ("first is greater")::(b>a && b>c)? ("second is greater"):("last is greater"));
  }
}