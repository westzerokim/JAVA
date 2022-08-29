package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void washCar() {}
	//�����ΰ� �ִµ� ����statement�� �������� �����ص� ������ �ȳ�
	//��� ������ ���ĸ� �ʿ��� ��쿡 �������� �̷� �ֵ��� �� �޼����� �մϴ�.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
