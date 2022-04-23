package ass1_mobile;

import java.util.Date;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//init
		Date date1 = new Date();
		Customer cust = new Customer("James");
		Visit visit = new Visit(cust,"James", date1);
		DiscountRate disc = new DiscountRate();
		
		//test methods
		cust.setMember(true);
		cust.setMemberType("Gold");
		System.out.println(cust.toString());
		System.out.println(cust.getMemberType());
		
		System.out.println("\n");
		visit.setProductExpense(45);
		visit.setServiceExpense(23);
		System.out.println(visit.getName());
		System.out.println(visit.getProductExpense());
		System.out.println(visit.getServiceExpense());
		System.out.println(visit.getTotalExpense());
		System.out.println(visit.toString());

		System.out.println("\n");
		System.out.println(disc.getProductDiscountRate("productDiscountPremium"));
		System.out.println(disc.getServiceDiscountRate("serviceDiscountSilver"));
	}

}
