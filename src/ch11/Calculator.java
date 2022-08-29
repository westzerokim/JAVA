package ch11;

public abstract class Calculator implements Calc {
// 구현하지 않는 클래스를 포함하기때문이다
	@Override
	public int add(int num1, int num2) {
		return num1 +  num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 -  num2;
	}



}
