import java.util.Scanner;

public class PrimeLoop 
{
    public static void main(String x[])
 {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        boolean flag = true;
        int i = 2;
        while (i <= num / 2) 
	{
            if (num % i == 0) 
		{
                flag = false;
                break;
                }
            i++;
        }
        if (flag)
	 {System.out.println(num + " is a prime number");}
	
	 else 
         {System.out.println(num + " is not a prime number");}
    }
}

