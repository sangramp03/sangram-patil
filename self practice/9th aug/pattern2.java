public class pattern2{
  public static void main(String x[]){
  
	
	int i,j,count;
	for(i=1;i<=5;i++){
	  for(j=1;j<=5;j++){
	  
	  if(i==1 ||i==3 ||i==5){
		if(j%2==0){System.out.print("1");}
		else{System.out.print("0");}
		}
	else if(i==2 ||i==4 ){
	if(j%2==0){System.out.print("0");}
	else{System.out.print("1");} 
	}
	}
System.out.println();
}
}
}