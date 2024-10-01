public class patternNumPiramid{
  public static void main(String x[]){
 
  
   int i,j,count=1;
   boolean flag=true;
   for(i=1;i<=7;i++){
		for(j=1;j<=7;j++){
		if(j<=5-i || j>=4+i && flag==true){
		System.out.print(count++);
		flag=false;
		}
		else{System.out.print(" ");
		flag=true}
		}
		System.out.println();
   }
  }
}