package ch14;

public interface Calc {

	double PI= 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void desciption() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
			
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	//static은 인스턴스 상속과 상관없이 호출될 수 있으니까
}
//private메세지는 인터페이스 내에 구현