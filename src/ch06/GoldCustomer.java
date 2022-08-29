package ch06;

public class GoldCustomer extends Customer {
	//Implicit오류는 다른 프레임 워크 클래스를 상속받아도 이 오류가 발생하지만 지금과 같은 경우 디폴트 생성자가 없어서 발생함
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "Gold";
 	
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
