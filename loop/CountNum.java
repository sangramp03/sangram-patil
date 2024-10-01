import java.util.*;
public class CountNum{
   public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int num=xyz.nextInt();
	int count=0;	
	while(num!=0){
  	num=num/10;
	++count;
	}
	System.out.println("count of number is\t"+count);
   }
}