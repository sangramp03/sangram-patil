/* Write a java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95% */


import java.util.*;
public class GrossSalary{
public static void main(String x[]){

	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter basic salary");
	double bs=xyz.nextDouble();
	double hra,da,total;

	/* hra=(bs<=10000)? (bs*0.2):(bs<=20000)? (bs*0.25):(bs>2000)? (bs*0.30);
	da=(bs<=10000)? (bs*0.8):(bs<=20000)? (bs*0.9):(bs>2000)? (bs*0.95);
	
	total=bs+hra+da;
	System.out.println("Gross Salary==>"+total); */

	if(bs<=10000){
	da=bs*0.8;
	hra=bs*0.2;
	total=bs+da+hra;
	System.out.println("Gross Salary==>"+total);
	}
	

	else if(bs<=20000){
	da=bs*0.9;
	hra=bs*0.25;
	total=bs+da+hra;
	System.out.println("Gross Salary==>"+total);
	}
	

	else if(bs<=10000){
	da=bs*0.95;
	hra=bs*0.30;
	total=bs+da+hra;
	System.out.println("Gross Salary==>"+total);
	}
	
	else{
	System.out.println(" ");
	}
  }
}
