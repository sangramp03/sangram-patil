import java.util.*;
public class PrimeNum{
  public static void main(String x[]){
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int n=xyz.nextInt();
	int i,count=0;
	
	for(i=1;i<=n;i++){
	   if(n%i==0){
	     count++;
	   }	
	}
	  if(count==2){
	  System.out.println("It is a prime number");
	}
	  else{System.out.println("It is not a prime number");}
  }
}