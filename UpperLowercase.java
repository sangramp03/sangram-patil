import java.util.*;
public class UpperLowercase
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter alphabet");
	char ch=xyz.next().charAt(0);
	
		if(ch>='a' && ch<='z')
		{
		System.out.println("small letters");
		}
		else
		{
		System.out.println("capital letters");
		}
	}
}