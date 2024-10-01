import java.util.*;
public class Switch
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
        char ch;
	System.out.println("enter character");
	ch=xyz.next().charAt(0);
	
	switch(ch)
	{
	case 'a':
	System.out.println("vowel");
	break;
	case 'e':
	System.out.println("vowel");
	break;
	case 'i':
	System.out.println("vowel");
	break;
	case 'o':
	System.out.println("vowel");
	break;
	case 'u':
	System.out.println("vowel");
	break;
	default:
	System.out.println("consonent");
		
	}
	}
}