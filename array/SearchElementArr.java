import java.util.*;
public class SearchElementArr{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	int a[]=new int[5],i;
	boolean flag=false;
	System.out.println("Enter elements in array");

	for(i=0;i<a.length;i++)
        {
	 a[i]=xyz.nextInt();
	}
	System.out.println("Display Array");
	for(i=0;i<a.length;i++)
        {
	 System.out.println(a[i]);
	}
	
	System.out.println("Enter search elements");
	int skey=xyz.nextInt();
	
	for( i=0;i<a.length;i++)
          {
	   if(a[i]==skey)
            {
	    flag=true;
	    break;
	   }
	}
	if(flag==true)
         {
             System.out.println("Element found");
         }
	else
         {
            System.out.println("Element not found");
         }
	
	
  }
}