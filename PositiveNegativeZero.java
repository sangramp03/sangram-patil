import java.util.*;
public class PositiveNegativeZero
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter number");
	int number=xyz.nextInt();
	String result=(number<=1 && number>-1)?"zero":(number>=0)?"positive":"negative";
	System.out.println(result);

	}
}