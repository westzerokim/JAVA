package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		//����Ʈ �����ڸ� �־ ����Ʈ �����ڸ� �Է���
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerAn = new VIPCustomer();
		customerAn.setCustomerName("������");
		customerAn.setCustomerID(10020);
		customerAn.bonusPoint = 100000000;
		System.out.println(customerAn.showCustomerInfo());
	}

}
//��������� ����Ϸ����ϸ� ��������� �޸𸮰� �־���ϴµ� �ش� ��쿡�� �̹� ��������־�� ����� �����ϴ�.
//����� ����ϴ� ���� �� �ϳ� ����ȯ�����̴�
	