import java.util.Scanner;

public class Timesc
{public static void main(String x[])
{  Scanner Scanner= new Scanner(System.in);
System.out.println("enter sec");
int sec=Scanner.nextInt();
int s=sec %60;
int hour= sec/60;
int min= hour %60;
 hour=hour/60;
System.out.println(hour+":"+min+":"+s);

}
}