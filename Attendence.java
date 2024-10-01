import java.util.*;
public class Attendence
{
public static void main(String xp[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter total days");
	int a=xyz.nextInt();
	System.out.println("enter absent days");
	int b=xyz.nextInt();
	int percentage=(a/b)/100;
	System.out.println("Total percentage"+percentage);
	if(percentage>=75)
	  {
	  System.out.println("able to sit in exam");
	  }
	  else
	{
	System.out.println(" not able to sit in exam");
	}
	}
}