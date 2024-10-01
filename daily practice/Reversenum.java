import java.util.*;
public class Reversenum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	int rem,rev=0;
	
	do{
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
	}
	
	while(num!=0);
	System.out.println("Reverse number is--> "+rev);
   }
}