package ass1_mobile;

public class DiscountRate {

	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	static double getServiceDiscountRate(String type) {
		if(type.equals("serviceDiscountPremium")) return serviceDiscountPremium;
		else if (type.equals("serviceDiscountGold")) return serviceDiscountGold;
		else if (type.equals("serviceDiscountSilver")) return serviceDiscountSilver;
		else return 0.1;//default value
	}
	
	static double getProductDiscountRate(String type) {
		if(type.equals("productDiscountPremium")) return productDiscountPremium;
		else if (type.equals("productDiscountGold")) return productDiscountGold;
		else if (type.equals("productDiscountSilver")) return productDiscountSilver;
		else return 0.1; // default value
	}
}
