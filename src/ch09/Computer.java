package ch09;

public abstract class Computer {

	//���⼭ computer�� turnOn�� turnOff�� ������ �� ����.
	//��ӹ��� ����Ŭ������ display�� typing�� ��� �������� �𸣴°���
	//computer Ŭ�������� �������� ���� Ŭ������ �߻�Ŭ�����εΰ� ����Ŭ�������� å���� ����
	
	public abstract void display();
	public abstract void typing();
	
	public void trunOn() {
		
		System.out.println("������ �մϴ�.");
		
	}
	
	public void turnOff() {
		
		System.out.println("������ ���ϴ�.");
	}
}
