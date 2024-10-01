import java.util.*;
public class ProfitLoss
{
public static void main(String x[])
	{
	int sp,cp;
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter sp");
	sp=xyz.nextInt();
	System.out.println("enter cp");
	cp=xyz.nextInt();
	String result=(sp>=cp)?"profit":"loss";
	System.out.println(result);

	}
}