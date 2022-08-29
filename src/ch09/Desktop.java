package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Destop display");
		
	}

	@Override
	public void typing() {
		System.out.println("Destop typing");
		
	}

	@Override
	public void trunOn() {
		System.out.println("Destop turn off");
	}

	// 상위클래스에 turn on turnoff 받아서 재정의해두대여.
	// 구체적인 클래스가 되었다.
	// 기능을 구현했지만 오로지 상속을 위한 클래스
}
