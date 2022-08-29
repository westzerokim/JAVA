package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		//디폴트 생성자만 있어서 디폴트 생성자만 입력함
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이수만");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerAn = new VIPCustomer();
		customerAn.setCustomerName("안유진");
		customerAn.setCustomerID(10020);
		customerAn.bonusPoint = 100000000;
		System.out.println(customerAn.showCustomerInfo());
	}

}
//멤버변수를 사용하려고하면 멤버변수가 메모리가 있어야하는데 해당 경우에는 이미 만들어져있어서서 사용이 가능하다.
//상속을 사용하는 이유 중 하나 형변환때문이다
	