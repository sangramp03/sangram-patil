import java.util.*;
public class MenuDriven
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	int a,b,choice;
	System.out.println("enter values");
	 a=xyz.nextInt();
	 b=xyz.nextInt();
	System.out.println("case 1:addition");
	System.out.println("case 2:subtraction");
	System.out.println("case 3:multiplication");
	System.out.println("case 4:division");
	System.out.println("enter choice");
	choice=xyz.nextInt();

	switch(choice)
	{
	case 1:
        {
           
           System.out.println("addition is"+(a+b));
	   break;
        }
	
	case 2:
         {
	    System.out.println("subtraction is"+(a-b));
	    break;
         }
	
	case 3:
          {
             System.out.println("multiplication is"+(a*b));
	     break;
	  }
	case 4:
          {
	     System.out.println("division is"+(a/b));
	     break;
         }
	default:
	System.out.println("invalid input");

	}

	
	}
}