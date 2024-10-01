import java.util.*;
public class Bike
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int cp,roadprice;
	System.out.println("enter cost price");
	cp=xyz.nextInt();
	   if(cp>=100000)
	{
	    
	   System.out.println("On road price is"+(cp*0.15));
	}
	
	   if(cp>=50000 && cp<=100000)
	{
	   System.out.println("On road price is"+(cp*0.10));
	}

	   if(cp<=500000)
	{
	   System.out.println("On road price is"+(cp*0.05));
	}
	}
}