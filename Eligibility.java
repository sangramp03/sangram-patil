  import java.util.*;
public class Eligibility
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("maths");
	int a=xyz.nextInt();
	System.out.println("physics");
	int b=xyz.nextInt();
	System.out.println("chemistry");
	int c=xyz.nextInt();
	int total=a+b+c;
     System.out.println("total marks "+total);
	int at=a+b;
     System.out.println("maths and physics "+at);
	if(a+b+c>=190)
	{

	
         if(a+b>=140)
	{
	System.out.println("candidate is eligible");
	}
	else
	{
	System.out.println("candidate is not eligible");
	}
	}
	
	}
}