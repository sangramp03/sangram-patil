import java.util.*;
public class HeightOfPerson
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter height");
	double height=xyz.nextDouble();
	String result=(height>=165.0 && height<=195.0)?"person is taller":(height>=150.0 && height<=165.0)?"person is average":"person is Dwarf";
	System.out.println(result);
	}
}