public class pattern6{
  public static void main(String x[]){

	int i,j;
	boolean flag=true;

	for(i=1;i<=5;i++){
	   for(j=1;j<=9;j++){
		if(i==2 || i==4 || flag==true){
		  if(j%2==0){System.out.print("*"); flag=false;}
		  else{System.out.print("#"); flag=true;}
		}
	        else if(i==1 || i==3 || i==5 ||flag==true){
		   if(j%2==0){System.out.print("#"); flag=false;}
		    else{System.out.print("*"); flag=true;}
		}
	else{System.out.print(" "); flag=false;}
	   }
	System.out.println();
	}
  }
}