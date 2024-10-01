import java.util.*;
public class VowelConsonent
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
 	System.out.println("enter alphabet");
	 char ch=xyz.next().charAt(0);

  		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("vowel");
		}
		else
		{
		System.out.println("consonent");
		}
	}
}