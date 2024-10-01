//q4

import java.util.*;
public class MasterchefFinal{
  public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Rank Of Chef");
	int rank=xyz.nextInt();
	
	if(rank<=10 && rank>=1){
	System.out.println("chef is already in top 10");
	}

	else if(rank >= 11 && rank<=15){
	System.out.println("Chef can make it to the top 10");
	}
	
	else {System.out.println("chef can't go to the top 10");}
  }
}