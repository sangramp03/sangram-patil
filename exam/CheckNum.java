import java.util.*;
public class CheckNum{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Number");  //input number from user
	int num=xyz.nextInt();
	
	if(num>0){   //condition for positive numbers 
	System.out.println("Positive");
	}
	
	else if(num<0){  //condition for negative numbers 
	System.out.println("Negative");
	}
	
	else{   //condition for zero
	System.out.println("Zero");
	}
  }
}