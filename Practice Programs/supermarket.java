abstract class Components {
	
	//method for billing
	public static int billing(int price) {
		return price;	
	} 
	
	//method for stock availability
	public static int stock(int s) {
		return s;
	}
	
	//method for units sold
	public static int sold(int p) {
		return p;
	}
	
	//abstract method for print sale report
	abstract public void printSaleReport();
}

//default inputs taken
//no Scanner is used in this program

class Cosmetics extends Components {

	//applying dynamic polymorphism i.e. method overriding
	 public void printSaleReport(){
			int price = billing(200);
			int stock = stock(120);
			int sold = sold(50);
			System.out.println("==========================");
			System.out.println("Sale report of Cosmetics: ");
			System.out.println("Cosmetic price: "+ price);
			System.out.println("Cosmetics sold: "+ sold);
			System.out.println("Stock available: "+ stock);	
			System.out.println("==========================");

	}	
}

class Groceries extends Components {
	
	//applying dynamic polymorphism i.e. method overriding
	 public void printSaleReport(){
			int price = billing(500);
			int stock = stock(100);
			int sold = sold(60);
			System.out.println("==========================");
			System.out.println("Sale report of Groceries: ");
			System.out.println("Groceries price: "+ price);
			System.out.println("Groceries sold: "+ sold);
			System.out.println("Stock available: "+ stock);	
			System.out.println("==========================");
	
	 }
}

class KitchenTools extends Components {
	
	//applying dynamic polymorphism i.e. method overriding
	 public void printSaleReport(){
			int price = billing(200);
			int stock = stock(120);
			int sold = sold(70);
			System.out.println("==========================");
			System.out.println("Sale report of Kitchen Tools: ");
			System.out.println("Kitchen Tool price: "+ price);
			System.out.println("Kitchen tools sold: "+ sold);
			System.out.println("Stock available: "+ stock);	
			System.out.println("==========================");
	 }
}

class Snacks extends Components {
	
	//applying dynamic polymorphism i.e. method overriding
	 public void printSaleReport(){
			int price = billing(200);
			int stock = stock(120);
			int sold = sold(40);
			System.out.println("==========================");
			System.out.println("Sale report of Snacks: ");
			System.out.println("Snack price: "+ price);
			System.out.println("Snacks sold: "+ sold);
			System.out.println("Stock available: "+ stock);	
			System.out.println("==========================");
	 }
}

class Chocolates extends Components{
	
	//applying dynamic polymorphism i.e. method overriding
	 public void printSaleReport(){
			int price = billing(200);
			int stock = stock(120);
			int sold = sold(90);
			System.out.println("==========================");
			System.out.println("Sale report of Chocolates: ");
			System.out.println("Chocolate price: "+ price);
			System.out.println("Chocolates sold: "+ sold);
			System.out.println("Stock available: "+ stock);
			System.out.println("==========================");
	 }
}

class SuperMarket{
	public static void main(String[] args) {
		Cosmetics obj1 = new Cosmetics();
		obj1.printSaleReport();
		
		Groceries obj2 = new Groceries();
		obj2.printSaleReport();
		
		KitchenTools obj3 = new KitchenTools();
		obj3.printSaleReport();
		
		Snacks obj4 = new Snacks();
		obj4.printSaleReport();
		
		Chocolates obj5 = new Chocolates();
		obj5.printSaleReport();
		
	}
}
