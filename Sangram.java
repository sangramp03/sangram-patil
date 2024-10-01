import java.util.*;
public class Sangram
{
public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter age");
	int a=xyz.nextInt();
	System.out.println("enter gender");
	char b=xyz.next().charAt(0);
	System.out.println("enter days");
	int c=xyz.nextInt();
	char male='m';
	char female='f';

	  if(a>=18 && a<=30 && b=='m' )
	{
	  System.out.println("wage is " +(c*700));
	}
	
	  else if(a>=30 && a<=40 && b=='m' )
	{
	  System.out.println("wage is " +(c*800));
	}
	else if(a>=40 && a<=50 && b=='m' )
	{
	  System.out.println("wage is " +(c*900));
	}
	else if(a>=50 && a<=60 && b=='m' )
	{
	  System.out.println("wage is " +(c*1000));
	}
	 if(a>=18 && a<=30 && b=='f' )
	{
	  System.out.println("wage is " +(c*750));
	}
	
	  else if(a>=30 && a<=40 && b=='f' )
	{
	  System.out.println("wage is " +(c*850));
	}
	else if(a>=40 && a<=50 && b=='f' )
	{
	  System.out.println("wage is " +(c*950));
	}
	else if(a>=50 && a<=60 && b=='f' )
	{
	  System.out.println("wage is " +(c*1000));
	}
	else 
	{
	  System.out.println("stop working and take rest");
	}
    }
}