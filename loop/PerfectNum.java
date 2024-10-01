import java.util.*;
public class PerfectNum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int n=xyz.nextInt();
	int sum=0,temp=n;
	boolean flag=false;
	for(int i=1;i<n;i++){
	  if(n%i==0){
	      sum=sum+i;
	    }
	
	   if(sum==temp){
	          flag=true;
	     }
	}
	
	if(flag){
	System.out.println("perfect");
	}
	else {
	System.out.println("not perfect");
	}
   }	
}