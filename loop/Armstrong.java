import java.util.*;
public class Armstrong{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int no=xyz.nextInt();
	int count=0,rem,sum=0;
	do{
	       rem=no%10;
	       count++;
	       no=no/10;
	       
	}
	while(no!=0);
	
	sum=1;
	do{
	sum=sum+rem;
	}
	while(count!=0);
	
	System.out.println("sum is"+sum);
   }
}