//Write a program to count total number of notes in given amount.

import java.util.*;
public class Ammount{
  public static void main(String x1[]){
  
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter ammount");
	int amt=xyz.nextInt();
	int x,rem=0;
	
	if(amt>=500){
	x=amt/500;
	rem=amt%500;
	System.out.println("note 500=>  "+x);
	}
	
	if(rem>=200){
	x=rem/200;
	rem=rem%200;
	System.out.println("note 200=>  "+x);
	}
	
	if(rem>=100){
	x=rem/100;
	rem=rem%100;
	System.out.println("note 100=>  "+x);
	}

	if(rem>=50){
	x=rem/50;
	rem=rem%50;
	System.out.println("note 50=>  "+x);
	}
	
	if(rem>=20){
	x=rem/20;
	rem=rem%20;
	System.out.println("note 20=>  "+x);
	}

	if(rem>=10){
	x=rem/10;
	rem=rem%10;
	System.out.println("note 10=>  "+x);
	}

	if(rem>=1){
	x=rem/1;
	rem=rem%1;
	System.out.println("note 1=>  "+x);
	}
  }
}