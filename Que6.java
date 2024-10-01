import java.util.*;
public class Que6
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter character from keyboard ");
	char ch =xyz.next().charAt(0);

	if(ch>='a' && ch<='z')
	{System.out.println("it is an small alphabet ");}

	else if(ch>='A' && ch<='Z')
	{System.out.println("it is an capital alphabet ");}
	
	
	else if(ch>=1 && ch<=9)
	{System.out.println("it is an numeric value ");}
	
	else
	{System.out.println("it is special symbol ");}

	}
}
	