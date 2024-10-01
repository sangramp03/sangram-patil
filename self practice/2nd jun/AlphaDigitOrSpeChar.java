//Write a C program to input any character and check whether it is alphabet, digit or special character
import java.util.*;
public class AlphaDigitOrSpeChar{
  public static void main(String x[]){
 
 	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter character from keyboard");
	char ch=xyz.next().charAt(0);
	
	
	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
	System.out.println("alphabet");
	}
	
	else if(ch>='0' && ch<='9'){
	System.out.println("digit");
	}
	
	else{
	System.out.println("special character");
	}
  }
}