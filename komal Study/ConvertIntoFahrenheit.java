import java.util.*;
public class ConvertIntoFahrenheit{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter temperature in Celcius");
	double cel=xyz.nextDouble();
	double fah;
	
	fah=(cel*9/5)+32;
	System.out.println("Temperature in Fahrenheit is\t"+fah);
  }
}