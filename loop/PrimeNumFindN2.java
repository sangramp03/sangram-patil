import java.util.*;
public class PrimeNumFindN2{
  public static void main(String x[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Start Value");
	int v=xyz.nextInt();
	System.out.println("Enter end Value");
	int e=xyz.nextInt();
	 
	 int i,j,num;
	 for(i=v;i<=e;i++)
                       { num=i;
                         System.out.print(i+"------>");
	       for(j=1;j<=num;j++)
                             {
	         if(j>1)
                                   {
	  	   while(num%j==0)
                                                {
                                                     System.out.print(j+" ");
                                                     num=num/j;
                                                }
		}
	         }
                      System.out.println();
	   	
	   }
  }
}