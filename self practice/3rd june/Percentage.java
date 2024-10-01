/* Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F */

import java.util.*;
public class Percentage{
  public static void main(String x[]){
 
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter marks");
	System.out.println("------------");
	System.out.println("Physics ");
	int a=xyz.nextInt();
	System.out.println("Chemistry  ");
	int b=xyz.nextInt();
	System.out.println("Biology  ");
	int c=xyz.nextInt();
	System.out.println("Mathematics  ");
	int d=xyz.nextInt();
	System.out.println("Computer  ");
	int e=xyz.nextInt();
	
	int total=a+b+c+d+e;
	System.out.println("Total Marks==> "+total);
	
	int percentage=total/5;
	System.out.println("Total Percentages ==> "+percentage);
	
	if(percentage>=90){
	System.out.println("Grade ==> A+");
	}
	
	else if(percentage>=80){
	System.out.println("Grade ==> A");
	}
	
	else if(percentage>=70){
	System.out.println("Grade ==> B");
	}
	
	else if(percentage>=60){
	System.out.println("Grade ==> C");
	}
	
	else if(percentage>=50){
	System.out.println("Grade ==> D");
	}
	
	else if(percentage>=40){
	System.out.println("Grade ==> E");
	}
	
	 else {
	System.out.println("Grade ==> F");
	}
  }
}
