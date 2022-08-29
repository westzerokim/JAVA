package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer(10010, "이수만"); customerLee.setCustomerName("이수만");
		System.out.println(customerLee.showCustomerInfo());
		 
		
		VIPCustomer customerAn = new VIPCustomer(10020, "안유진");
		customerAn.bonusPoint = 100000000;
		System.out.println(customerAn.showCustomerInfo());
		
		//Customer vc = new VIPCustomer(12345, "noname");
		
		
		
		//결국에 얘가 vip의 인스턴스라고해도 customer로 형변환이 되면 customer타입만 사용할 수 있다.
	}

	//하위클래스가 생성이 될 때 상위클래스가 먼저 호출이 된다
}

