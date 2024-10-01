import java.util.Scanner;
public class sangram
{
    public static void main(String x[])
    {
        Scanner xyz=new Scanner(System.in);
        System.out.println("press button");
        int button=xyz.nextInt();
        
        /*if(button==1)
        {
            System.out.println("नमस्कार");
        }
        
        else if(button==2) {
            System.out.println("रामराम");
        }

        else if(button==3) {
            System.out.println("नमस्ते");
        }
        else {
            System.out.println("तुझी आई घाल");
        }*/
        switch(button) {

            case 1:
                System.out.println("नमस्कार");
                break;

            case 2:
                 System.out.println("रामराम");
                 break;

            case 3:
                 System.out.println("नमस्ते");
                 break;

            default:
                 System.out.println("तुझी आई घाल");

        }

/*int a=5,b=2;
int c=a/b;
System.out.println(c);
    */
 /*int a = 15;
		int b = 12;
		System.out.print(a%b);
		System.out.print(",");
		System.out.print(b%a);*/
        /*int a = 4;
		int b = 5;
		System.out.print(a>b);
		System.out.print(",");
		System.out.print(a<b);
*/
 
    }
}