import java.util.ArrayList;

public class Customer {

	static final String COMPANY ="CV";
	
	static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
	
	static Counter COUNTER;
	
	String name;
	String geography;
	int ID;
	
	
	public Customer(String name, String geography) {
		
		
		this.name= name;
		this.geography=geography;
	
		this.ID=Customer.COUNTER.getCount();
	    Customer.COUNTER.increment();
	    
	    Customer.CUSTOMERS.add(this);
	    
	}
	
	public static void printAllCustomers() {
		System.out.println("All Customers: ");
		
		for(Customer c: Customer.CUSTOMERS) {
		  System.out.println(c);
		}
		
		System.out.println("\n");
		
	}
	
	public boolean equals(Object obj) {
	    
		Customer otherCustomer= (Customer) obj;
		
		if((this.name.equals(otherCustomer.name)) && (this.geography.equals(otherCustomer.geography))) {
			return true;
		}
		
		return false;
	}
	
	
	public String toString()
	{
		return this.ID+","+this.name+","+Customer.COMPANY+","+this.geography;
		
	}
	
	
	public static int findCustomer(Customer customer) {
		int index =-1;
		
		for(int i=0;i<Customer.CUSTOMERS.size();i++) {
			if(Customer.CUSTOMERS.get(i).equals(customer)) {
				index=i;
				
				break;
			}
		}
		
		return index;
	}
	
	public static void removeCustomer(Customer customer) {
		int removeindex = Customer.findCustomer(customer);
		
		if(removeindex>=0) {
			Customer.CUSTOMERS.remove(removeindex);
		}
	
	}
	
	
	public static void main(String[] args) {
	
		Customer.COUNTER= new Counter(1);
		
		Customer c1 = new Customer("Ben","Los Angales");
		
		Customer.printAllCustomers();
		
		Customer c2 = new Customer("Gwen","Sparkswill");
		
		Customer c3 = new Customer("Willjacks","New York");
		Customer c4 = new Customer("DiamondHead","Neptune");
		
		Customer.printAllCustomers();
		
		Customer.removeCustomer(c4);
		
		Customer.printAllCustomers();
		
	
	}
	
	
	
	
	
	
	

}
