package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 켭니다.");
	}
	public void washCar() {}
	//구현부가 있는데 내용statement가 없은거임 저장해도 오류가 안남
	//얘는 뭐에다 쓰냐면 필요한 경우에 재정의함 이런 애들을 훅 메서드라고 합니다.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
