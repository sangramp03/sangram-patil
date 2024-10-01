//Write a  program to check whether a character is uppercase or lowercase alphabet

import java.util.*;
public class UpperLowerCase{
 public static void main(String x[]){
 
	Scanner xyz=new Scanner(System.in);
	System.out.println("enter alphabet");
	char ch=xyz.next().charAt(0);
	
	/* if(ch>='a' && ch<='z'){
	System.out.println("lower case");
	}
	
	else if(ch>='A' && ch<='Z'){
	System.out.println("Upper case");
	}
	
	else{
	System.out.println("invalid input");
	} */
	
	String result=((ch>='a' && ch<='z')? ("lower case"):("Upper case"));
	System.out.println(result);
	 
	
  }
}