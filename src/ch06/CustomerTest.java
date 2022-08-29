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
//			System.out.println(customer.getCustomerName() + "님이" + cost +"원 지불하셨습니다.");
//			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
//			
//			 
//		}
		
		
		//Gold 커스터머를 VIP로 바꾸려고 한다.
		
		//VIPCustomer vc =  (VIPCustomer)customerR;
		
		// 컴파일이 정상적으로 되는데 JAVA에서 잡아낼 수 없어서
		//실행을 해야만 Exception in thread "main" java.lang.ClassCastException: class ch06.GoldCustomer cannot be cast to class ch06.VIPCustomer 
		//(ch06.GoldCustomer and ch06.VIPCustomer are in unnamed module of loader 'app')
		//at ch06.CustomerTest.main(CustomerTest.java:38)
		
		
		// 위에 내용을 이렇게 바꾸면
//		if(customerR instanceof GoldCustomer) {
//			GoldCustomer vc = (GoldCustomer)customerR;
//			System.out.println(customerR.showCustomerInfo());
//		}
		//이건 실행해도 오류가 발생하지 않음
	}


}

