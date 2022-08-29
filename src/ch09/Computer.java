package ch09;

public abstract class Computer {

	//여기서 computer는 turnOn과 turnOff는 구현할 수 있음.
	//상속받을 하위클래스가 display와 typing을 어떻게 구현할지 모르는거임
	//computer 클래스에서 구현하지 못할 클래스는 추상클래스로두고 하위클래스에게 책임을 위임
	
	public abstract void display();
	public abstract void typing();
	
	public void trunOn() {
		
		System.out.println("전원을 켭니다.");
		
	}
	
	public void turnOff() {
		
		System.out.println("전원을 끕니다.");
	}
}
