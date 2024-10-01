import java.util.*;
public class Leap{
   public static void main(String x[]){
 
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter year");
	int year=xyz.nextInt();
	getLeapYear(year);
   }

	public static void getLeapYear(int y){
 
	
 	if(y%4==0 && y%100!=0 && y%400!=0){
	System.out.println("leap year");             }           
	else {
	int reminder=0;
	System.out.println(reminder);
	}
	}
}