//Q1

import java.util.*;
public class CwcQualify{
  public static void main(String x[]){


	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter team points");
	int points=xyz.nextInt();
	
	/* if(points>=12){
	System.out.println("YES");
	System.out.println("The team has scored more than 12  points. Hence it does qualify");
	}
	
	else{
	System.out.println("No");
	System.out.println("The team has not scored more than 12 points. Hence it does not qualify.");
	} */
	
	String result=((points>=12)? ("YES  The team has scored more than 12  points. Hence it does qualify"):("NO The team has not scored more than 12 points. Hence it does not qualify."));
	System.out.println(result); 
  }
}