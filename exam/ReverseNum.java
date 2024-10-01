import java.util.*;
public class ReverseNum{
  public static void main(String x[]){

 	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");  //input number from user
	int num=xyz.nextInt();
	int rem,rev=0; 
	do{
	    rem=num%10;  //get mod
	    num=num/10;  //divide number 
	    rev=rev*10+rem; //find reverse
	}
	while(num!=0);
	System.out.println("Reverse number-->"rev); //print reverse num
	
  }
}