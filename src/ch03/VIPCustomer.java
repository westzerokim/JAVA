package ch03;

public class VIPCustomer extends Customer {

//Implicit super constructor Customer() is undefined for default constructor.
//Must define an explicit constructor

	
	double salesRatio;
	private String agentID;
	
	/*
	 * public VIPCustomer() {
	 * 
	 * super(0,"no-name");
	 * 
	 * bonusRatio = 0.05; salesRatio = 0.1; customerGrade = "VIP";
	 * 
	 * System.out.println("VIPCustomer() call");
	 * 
	 * }
	 */
			
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	
	
	public String getAgentID() {
		
		return agentID;
	}
}
 