package ass1_mobile;

public class Customer {

	String name;
	boolean member = false;
	String memberType;
	
	Customer(String name){
		this.name = name;
	}
	
	//methods
	boolean isMember() {
		if (this.member == false) return false;
		else return true;
	}
	void setMember(boolean tF) {
		this.member = tF;
	}
	String getMemberType() {
		return this.memberType;
	}
	void setMemberType(String memType) {
		this.memberType = memType;
	}
	public String toString() {
		return "Customer name: "+this.name+"\nIs Member: "+this.member+ "\nMember Type: "+this.memberType;
	}
	
	
}
