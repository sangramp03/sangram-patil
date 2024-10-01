import java.util.*;
public class PrimeNumFindN{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Start Value");
	int v=xyz.nextInt();
	System.out.println("Enter end Value");
	int e=xyz.nextInt();
	 
	 int i,j;
	 for(i=v;i<=e;i++)
		int count=0;
	   for(j=1;j<i;j++){
	     if(i%j==0){
		 count++;
		 }
	   }
	   	 if(count==2){
	   System.out.printf("%d\t",i);
	 }

	 
  }
}