public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate;
	
	public Order(MyDate d, double amt, String c) {
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = "Anvil";
		quantity = 1;
	}
	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is : " + anAmount * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
	
	public Order(MyDate orderDate, double orderAmount, String customer, String product, int quantity){
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
