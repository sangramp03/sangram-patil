import java.util.*;
public class PerfectApp
{
 public static void main(String x[])

   {
	Scanner xyz=new Scanner(System.in);
	int i,num,count=0,sum=0;
	System.out.println("enter Number");
	num=xyz.nextInt();
	
	for(i=1;i<=num; i++)
	{
	  if(num%i==0)
		{
		
		sum=sum+i;
		}
		
	
        }
	if(sum==num)
	{System.out.println("prefect");}
	
	else
	{System.out.println(" not prefect");}
   }
}