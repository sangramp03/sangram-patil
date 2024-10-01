import java.util.*;
public class WeekDays{
  public static void main(String x[]){
	
	
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter date");
	int date=xyz.nextInt();
	
	switch(date){

	case 1:
	System.out.println("Sunday");
	break;

	case 2:
	System.out.println("monday");
	break;

	case 3:
	System.out.println("Tuesday");
	break;

	case 4:
	System.out.println("Wednesday");
	break;

	case 5:
	System.out.println("Thursdays");
	break;

	case 6:
	System.out.println("Friday");
	break;
	
	case 7:
	System.out.println("Saturday");
	break;
	}
  }
}