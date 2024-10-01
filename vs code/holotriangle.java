public class holotriangle{
    public static void main(String x[]){
        int i,j;
        for(i=1;i<=5;i++){
            for ( j = 0; j<=5; j++) {
                if(i==1 && j==1 ){
                    System.out.print("*");
                }
                else if( j==6-i){System.out.print("*");}
                else{System.out.print(" ");}
                
            }
            System.out.println("");
        }
    }
}