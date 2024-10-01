import java.util.*;
public class Alphabet
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter alphabet");
	char ch=xyz.next().charAt(0);
	String result=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"vowel":"consonant";
	System.out.println("the given alphabet is "+result);
	}
}