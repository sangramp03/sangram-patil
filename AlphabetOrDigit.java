import java.util.*;
public class AlphabetOrDigit
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter value");
	char ch=xyz.next().charAt(0);
	String result=(ch>='0' && ch<='9')?"numric":(ch>='a' && ch<='z')?"alphabet":"Special symbols";
	System.out.println(result);
	}

}