package ch14;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR;
		
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}

	@Override
	public void desciption() {
		System.out.println("CompleteeCalc overriding");
	}
	//이런식으로 재정의가 가능한게 디폴트메서드 정적메서드이다!
	
}
