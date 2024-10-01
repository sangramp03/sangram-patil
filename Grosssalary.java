import java.util.*;
public class Grosssalary
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter basic salary");
	int bs=xyz.nextInt();
	double hra=(bs<=10000)?(bs*0.2):(bs<=20000)?(bs*0.25):(bs*0.3);
	System.out.println("hra is"+hra);
	double da=(bs<=10000)?(bs*0.8):(bs<=20000)?(bs*0.9):(bs*0.95);	
	System.out.println("da is"+da);
	double total=bs+hra+da;
	System.out.println(total);

	}
}