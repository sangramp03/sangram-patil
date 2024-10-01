import java.util.*;
public class DividedDec
{
public static void main(String x[])

    {
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int num=xyz.nextInt();

	if(num%11==0 && num%5==0)
	{
	System.out.println("divisible by 5 or 11");
	}
	else
	{
	System.out.println("not divisible by 5 or 11");
	}
    }
}