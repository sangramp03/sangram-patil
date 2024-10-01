import java.util.*;
public class MaxMinArr{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	
	int a[]=new int[5];
	int i;
	int max=a[0];
         	
        System.out.println("Enter Elements in array");
	for(i=0;i<a.length;i++)
	{
	 a[i]=xyz.nextInt();
	}
	 int min=a[0];
	for(i=0;i<a.length;i++)
	{
	  if(a[i]>max)
	  {
	   max=a[i];
	  }
           if(a[i]<min)
	   {
	   min=a[i];
	   }
	}
	System.out.println("Maximum element"+max);
	System.out.println("minimum element"+min);
  }
}