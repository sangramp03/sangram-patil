import java.util.*;
public class MaxMinFunArr{
	static int i;
  public static void main(String x[]){
	Scanner xyz=new Scanner(System.in);
	 
		System.out.println("Enter Elements in array");
			int a[]=new int[5];
			int len=a.length;
			for(i=0;i<5;i++){
			 a[i]=xyz.nextInt();
			}
		showMaxMin(a);
	}
    public static void showMaxMin(int x[])	{
	int max=x[0];
	int min=x[0];
	 for(i=0;i<5;i++){
	  if(x[i]>max){
	   max=x[i];
	  }
	  else if(x[i]<min){
	    min=x[i];
	  }
	  
	 }
	 System.out.println("max element"+max);
	System.out.println("max element"+min);
	}	
  }