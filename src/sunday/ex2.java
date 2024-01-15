package sunday;

public class ex2{
	public static void main(String[] args) {
	
 maxNumber(10,4);
	}
public static void maxNumber(int num1, int num2) {
	if(num1 > num2) {
		System.out.println(num1);
	}
	else
	{
		System.out.println(num2);
	}
}
}

public class Review{
	  public static void main(String[] args) {
	}
	}

public class Store {
	  // instance fields
	  String productType;
	  int inventoryCount;
	  double inventoryPrice;
	  // constructor method
	  public Store(String product, int count, double price) {
	    productType = product;
	    inventoryCount = count;    
	    inventoryPrice = price;
	  }
	  
	  // main method
	  public static void main(String[] args) {
	  Store cookieShop = new Store("cookies", 12, 3.75);
	  }
	}