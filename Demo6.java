public class Demo6
{
public static void main(String x[])
	{
	int dailywage=4;
	int number_of_days=5;
	int salary;
	salary=(number_of_days++)*(--dailywage)*(dailywage++)*(number_of_days--);
	salary= -dailywage;
	System.out.println(dailywage+" "+number_of_days+" "+salary);
	}
}