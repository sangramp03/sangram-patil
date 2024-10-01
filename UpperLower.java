import java.util.*;
public class UpperLower
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter alphabet");
char ch= xyz.next().charAt(0);
String result=(ch>='a' && ch<='z')?"lower case":"uppercase";
System.out.println(result);
}

}