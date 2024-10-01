import java.util.*;
public class Commission{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Sales amount");  //input value of sales from user
	int sales=xyz.nextInt();
	double c;

	if(sales<100){ //find commission less than 100rs
 	System.out.println("NO COMMISSION"); //print commission 
 	}

	else if(sales>=100 && sales<1000){  //find commission greater than 100rs
	c=sales*0.10;
	System.out.println("Commission is--> "+c);
	}

	
	else if(sales>=1000){ //find commission greater than 1000rs
	c=sales*0.08;
	System.out.println("Commission is--> "+(c+100));
	}
  }
}