package ch16.gamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
		
	}

	@Override
	public void jump() {
		System.out.println("���� �ݴϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("�����ƿ�..");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*******�߱��� �����Դϴ�.*******");
		
	}

	
}
