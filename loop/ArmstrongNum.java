import java.util.*;
public class ArmstrongNum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int no=xyz.nextInt();
	int rem,sum=1,count=0, temp=no;

	do{
	
	rem=no%10;
	count++;
	no=no/10;
	sum=rem*count;
	}  
	while(no!=0);
	/* if(sum==temp){
	System.out.println("it is Armstrong number");
	}
	
	else{
	System.out.println("it is not  Armstrong number");
	} */
	System.out.println(sum);
	
}
}