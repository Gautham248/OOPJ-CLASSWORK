package Assignment1;
import java.util.*;
 

// INTERFACE
interface Food{
	void setType(String type);
	double calculatePrice();
}
//------CLASS--PIZZA---------------
class Pizza implements Food{
	String size,type;
	double price;
	//PRICE OF PIZZA
		public double calculatePrice() {
			if(size == "Small" && type == "Veg")
				 price = 80;
				 
			else if(size == "Small" && type == "Non")
				 price = 125;
				 
			else if(size == "Medium" && type == "Veg")
				 price = 175;
				 
			else if(size == "Medium" && type == "Non")
				 price = 225;
				 
			else if(size == "Large" && type == "Veg")
				 price = 250;
				 
			else if(size == "Large" && type == "Non")
				 price = 275;
				 
			return price;
		}
// TYPE OF THE PIZZA
	public void setType(String type) {
		this.type=type;
	}
// SIZE OF THE PIZZA
	void setSize(String size) {
		this.size=size;
	}

	
}
//-----End of class PZZA----

//----CLASS LASAGNE---------
class Lasagne implements Food{
	 String type;
	 double price;
//TYPE OF LASAGNE
	 public void setType(String type) {
	 this.type = type;
	 }
//PRICE OF LASAGNE
	 public double calculatePrice() {
	 if(type=="Veg"){
	 price = 200;
	 }
	 else{
	 price = 300;
	 }
	 return price;
	 }
	}

public class RoushdatResto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza italianPizza= new Pizza();
		Lasagne italianLasagne = new Lasagne();
	
		Scanner sc= new Scanner(System.in);
		System.out.println("--ROUSHDAT RESTO--");
		System.out.println("--------MENU------");
		System.out.println("1.PIZZA         " );
		System.out.println("2.LASAGNE       ");
	
		System.out.print("Please select your choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{{
			System.out.println("would you like to hava :\n1.Veg Pizza\n2.Non-Veg Pizza\n");
			int choice_type=sc.nextInt();
			if(choice_type==1) {
				italianPizza.setType("Veg");
			}
			if(choice_type==2) {
				italianPizza.setType("Non");
			}
			System.out.println("Please Select Size:\n1.Small\n2.Medium\n3.Large\n ");
			int choice_size=sc.nextInt();
			if(choice_size==1)
			{
				italianPizza.setSize("Small");
			}
			if(choice_size==2)
			{
				italianPizza.setSize("Medium");
			}
			if(choice_size==3)
			{
				italianPizza.setSize("Large");
			}
			double price=italianPizza.calculatePrice();
			System.out.println("Your Order Costs : ");
			System.out.println(price);
		}
		break;
		}
		case 2:{{  
			
			System.out.println("would you like to hava :\n1.Veg Lasagne\n2.Non-Veg Lasagne\n");
			int choice_type=sc.nextInt();
			if(choice_type==1) {
				italianLasagne.setType("Veg");
			}
			if(choice_type==2) {
				italianLasagne.setType("Non");
			}
			
			System.out.println("Your Order Costs : "+italianLasagne.calculatePrice());
			
		}
		break;	
		}
			
		default:
			System.out.println("Item Not Available!!\n");
		
		}
		
		System.out.println("RoushdatResto dearly awaits your return!");
		
		
		
	}

}
