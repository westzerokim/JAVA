package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer(10010, "�̼���"); 
		customerLee.setCustomerName("�̼���");
		int price = customerLee.calcPrice(150000);
		System.out.println(customerLee.showCustomerInfo() + price);
		 
		
		VIPCustomer customerAn = new VIPCustomer(10020, "������");
		customerAn.bonusPoint = 100000000;
		price = customerAn.calcPrice(250000);
		System.out.println(customerAn.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		System.out.println(	vc.calcPrice(1000));
		
		//����޼��� �����Լ� 
		//C++�� virtualŰ���带 �������� JAVA�� ��� �޼��尡 ���� �޼�����
		
		
		//�����Լ��� ����ȯ 
		//calcprice�� vipcustomer���� �������� �Լ� 
		//vc�� �������� ��Ҷ� customer�� ��ɸ� ���� �� �ִ� ������ 
		
		//vipcustomer���� �ݿ��ȴ�.
		
		

	}


}

