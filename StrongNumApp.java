import java.util.*;
public class StrongNumApp
{
public static void main(String x[])
     {
	Scanner xyz=new Scanner(System.in);
	int num,rem,total,temp;
	System.out.println("Enter the number");
	num=xyz.nextInt();
	boolean flag=false;
	temp=num;
	while(num!=0)

	{
	rem=num%10;
	   num=num/10;
	total=num+rem;
	   if(total==num)
	
           {
	       flag=true;
	       break;
	   }
	}
	if(flag)
	  {System.out.println("Strong number");}
	
	else
	{System.out.println("not a Strong number");}
     }
}