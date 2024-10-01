import java.util.*;
public class MarksOfSub
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter marks of 5 sub");
	int mar=xyz.nextInt();
	int math=xyz.nextInt();
	int sci=xyz.nextInt();
	int his=xyz.nextInt();
	int hindi=xyz.nextInt();
	int total=(mar+math+sci+his+hindi);
	double per=total/5;
	System.out.println(per);
	String result=(per>=90)?"first":(per>=80 && per<=90)?"second":"third";
	System.out.println(result);
	}
}