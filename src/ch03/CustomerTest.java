package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer(10010, "�̼���"); customerLee.setCustomerName("�̼���");
		System.out.println(customerLee.showCustomerInfo());
		 
		
		VIPCustomer customerAn = new VIPCustomer(10020, "������");
		customerAn.bonusPoint = 100000000;
		System.out.println(customerAn.showCustomerInfo());
		
		//Customer vc = new VIPCustomer(12345, "noname");
		
		
		
		//�ᱹ�� �갡 vip�� �ν��Ͻ�����ص� customer�� ����ȯ�� �Ǹ� customerŸ�Ը� ����� �� �ִ�.
	}

	//����Ŭ������ ������ �� �� ����Ŭ������ ���� ȣ���� �ȴ�
}

