//Write a C program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class VowelOrConsonant{
  public static void main(String x[]){
  	
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter Alphabet");
	char ch=xyz.next().charAt(0);
	
	/* if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

	System.out.println("Vowel");
	}
	else{
	System.out.println("Consonant");
	} */

	String result=((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? ("it is vowel"):("it is consonent"));
	System.out.println(result); 
  }
}