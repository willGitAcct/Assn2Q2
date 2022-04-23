package ass1_mobile;

import java.util.Date;

public class Visit extends Customer{
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	//added customer to the constructor because there were errors trying to assign a name without first assigning a custoemr
	Visit(Customer customer, String name, Date date){
		//this.customer=customer;
		super(name);
		this.customer = customer;
		
		this.date = date;
	}
	
	//methods
	String getName() {
		return customer.name;
	}
	double getServiceExpense() {
		return this.serviceExpense;
	}
	void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}
	double getProductExpense() {
		return this.productExpense;
	}
	void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	double getTotalExpense() {
		return this.productExpense * this.serviceExpense;
	}
	public String toString() {
		return "Customer name: "+customer.name+"\nService Expense: "+this.serviceExpense+ "\nProduct Expense: "+this.productExpense + "\nDate: "+this.date;

	}
}
