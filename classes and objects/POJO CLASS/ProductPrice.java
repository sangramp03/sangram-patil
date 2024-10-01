class Product{

    private int id;
    private String name;
    private int price;
	
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
	
	public void setPrice(int price){
	   this.price=price;
	}
	public int getPrice(){
	   return price;
	}
}
	
	public class ProductPrice{
	   public static void main(String x[]){
	
		Product pro=new Product();
		pro.setId(1);
		pro.setName("paneer");
		pro.setPrice(400);

		System.out.println("Id is"+pro.getId());
		System.out.println("Product is "+pro.getName());
		System.out.println("Price is "+pro.getPrice());
	    }
	}