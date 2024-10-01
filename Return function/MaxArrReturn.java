import java.util.*;
public class MaxArrReturn{
    static int i;
    public static void main(String x[]){

            Scanner xyz=new Scanner(System.in);
            int a[]=new int[5];
            System.out.println("Enter elements in array");
            for(i=0;i<a.length;i++){
                a[i]=xyz.nextInt();
            }
            int result=MaxArr(a);
            System.out.println("Maximum array element is"+result);
    }
    public static int MaxArr(int x[]){
        int max=x[0];
        for( int i=0;i<5;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return(x[i]);

    }
}