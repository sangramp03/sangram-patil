import java.util.*;
public class ConvertIntoCelcius{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter temperature in fahreheit");
	double fah=xyz.nextDouble();
	double cel;
	
	cel=(fah-32)*5/9;
	System.out.println("Temperature in celcius is\t"+cel);
	
  }
}