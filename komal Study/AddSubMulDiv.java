import java.util.*;
public class AddSubMulDiv{
    public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);	

	System.out.println("1) Addition");
	System.out.println("2) Subtraction");
	System.out.println("3) Multiplication");
	System.out.println("4) Division");
	System.out.println("\nenter choice");
	int choice=xyz.nextInt();
	int num1,num2;

	switch(choice){
	case 1:
	System.out.println("Enter first number");
	num1=xyz.nextInt();
	System.out.println("Enter second number");
	num2=xyz.nextInt();
	System.out.println("Addition is"+(num1+num2));
	break;
	
	
	case 2:
	System.out.println("Enter first number");
	num1=xyz.nextInt();
	System.out.println("Enter second number");
	num2=xyz.nextInt();
	System.out.println("Substraction is"+(num1-num2));
	break;
	
	
	case 3:
	System.out.println("Enter first number");
	 num1=xyz.nextInt();
	System.out.println("Enter second number");
	num2=xyz.nextInt();
	System.out.println("Multiplication is"+(num1*num2));
	break;
	
	
	case 4:
	System.out.println("Enter first number");
	num1=xyz.nextInt();
	System.out.println("Enter second number");
	num2=xyz.nextInt();
	System.out.println("Addition is"+(num1/num2));
	break;
	
	
	default:
	System.out.println("enter valid choice");
	}
   }	
	
}