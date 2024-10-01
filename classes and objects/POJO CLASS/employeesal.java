class Employee{
   private int id;
   private String name;
   private int sal;

	public void setId(int id){
	  this.id=id;
	}
	public int getId(){
	return id;
	}
	
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return name;
	}
	
	public void setSal(int sal){
	this.sal= sal;
	}
	
	public int getSal(){
	return sal;
	}
}
	
	public class employeesal{
	   public static void main(String x[]){
	
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Sangram");
		emp.setSal(100000);
	
		System.out.println("Id is"+emp.getId());
		System.out.println("name is"+emp.getName());
		System.out.println("salary is"+emp.getSal());
	   }
	}