import java.util.*;
public class Example
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter value");
	char ch=xyz.next().charAt(0);
	
	if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
	{
	System.out.println("alphabet");
	}

	else if(ch>='0' && ch<='9')
	{
	System.out.println("digit");
	}
	else
	{
	System.out.println("special symbol");
	}
	}
}