import java.util.*;

public class Leapy
     { 
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("write leap year");
	int year= xyz.nextInt();
        String result=(year%4==0)?"leap year":"not leap year";
	System.out.println("the given year is " +result);
      }
}

