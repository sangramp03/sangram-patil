import java.util.*;
public class ProfitLossdec
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int cp,sp;
	System.out.println("enter cost price");
	cp=xyz.nextInt();
	System.out.println("enter selling price");
	 sp=xyz.nextInt();
		
		if(cp<=sp)
		{
		System.out.println("profit");
		}
		else
		{
		System.out.println("loss");
		}
	}
}