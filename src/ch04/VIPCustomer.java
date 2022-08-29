package ch04;

public class VIPCustomer extends Customer {


	
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

	
	
	
	@Override //override된 경우 이름도 임의로 바꿔선 안된다 오류발생함
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}




	public String getAgentID() {
		
		return agentID;
	}
}
 