package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerL = new Customer(10020, "Lisa");
		Customer customerJ = new GoldCustomer(10030, "Jenny");
		Customer customerR = new GoldCustomer(10040, "Rosie");
		Customer customerS = new VIPCustomer(10050, "Soo");
		
		customerList.add(customerT);
		customerList.add(customerL);
		customerList.add(customerJ);
		customerList.add(customerR);
		customerList.add(customerS);
		
//		for( Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		int price = 10000; 
//		for(Customer customer : customerList) {
//			
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName() + "����" + cost +"�� �����ϼ̽��ϴ�.");
//			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ��" + customer.bonusPoint + "�Դϴ�.");
//			
//			 
//		}
		
		
		//Gold Ŀ���͸Ӹ� VIP�� �ٲٷ��� �Ѵ�.
		
		//VIPCustomer vc =  (VIPCustomer)customerR;
		
		// �������� ���������� �Ǵµ� JAVA���� ��Ƴ� �� ���
		//������ �ؾ߸� Exception in thread "main" java.lang.ClassCastException: class ch06.GoldCustomer cannot be cast to class ch06.VIPCustomer 
		//(ch06.GoldCustomer and ch06.VIPCustomer are in unnamed module of loader 'app')
		//at ch06.CustomerTest.main(CustomerTest.java:38)
		
		
		// ���� ������ �̷��� �ٲٸ�
//		if(customerR instanceof GoldCustomer) {
//			GoldCustomer vc = (GoldCustomer)customerR;
//			System.out.println(customerR.showCustomerInfo());
//		}
		//�̰� �����ص� ������ �߻����� ����
	}


}

