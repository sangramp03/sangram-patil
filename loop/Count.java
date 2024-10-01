import java.util.*;
 public class Count{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int n=xyz.nextInt();
	int count=0;
	 do{
	    count++;
	    n=n/10;
	    }
	while(n!=0);
	System.out.println(count);
	
   }
}