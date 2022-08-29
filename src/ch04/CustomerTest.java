package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer(10010, "이수만"); 
		customerLee.setCustomerName("이수만");
		int price = customerLee.calcPrice(150000);
		System.out.println(customerLee.showCustomerInfo() + price);
		 
		
		VIPCustomer customerAn = new VIPCustomer(10020, "안유진");
		customerAn.bonusPoint = 100000000;
		price = customerAn.calcPrice(250000);
		System.out.println(customerAn.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		System.out.println(	vc.calcPrice(1000));
		
		//가상메서드 가상함수 
		//C++은 virtual키워드를 가지지만 JAVA는 모든 메서드가 가상 메서드임
		
		
		//가상함수와 형변환 
		//calcprice는 vipcustomer에서 재정의한 함수 
		//vc는 재정의한 요소라서 customer의 기능만 받을 수 있는 상태임 
		
		//vipcustomer에만 반영된다.
		
		

	}


}

