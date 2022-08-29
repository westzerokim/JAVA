package ch03;

public class Customer {

	
	protected int customerID; //private는 이 클래스 안에서만 사용가능하며 상속을 받은 경우라도 외부 클래스에서는 사용이 불가능하다.
	protected String customerName;// 그런경우 pritected를 사용한다.
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() call");
//	}
//	이런식으로 디폴트 컨스트럭터를 삭제하면 오류가 발생한다.

	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) call");
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는" + bonusPoint + "입니다";

	}
	
}
