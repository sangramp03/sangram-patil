import java.util.*;
public class DuckNumApp
{
  public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int num,rem;
	System.out.println("Enter number");
	num=xyz.nextInt();
	boolean flag=false;
	while(num!=0)
	{
	   rem=num%10;
	   num=num/10;
	   if(rem==0)
	
           {
	       flag=true;
	       break;
	   }
	}
	
	if(flag)
	{
           System.out.println("duck number");
        }
        else
	{
           System.out.println("Not a duck number");}
	}
}