package ch06;

public class GoldCustomer extends Customer {
	//Implicit������ �ٸ� ������ ��ũ Ŭ������ ��ӹ޾Ƶ� �� ������ �߻������� ���ݰ� ���� ��� ����Ʈ �����ڰ� ��� �߻���
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
