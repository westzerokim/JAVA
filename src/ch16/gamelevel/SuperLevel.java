package ch16.gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("����κ�Ʈ �޸��� ����.");
		
	}

	@Override
	public void jump() {
		System.out.println("�ִ� 2���ͱ��� ��������~");
		
	}

	@Override
	public void turn() {
		System.out.println("ȸ���� �����մϴ�.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************����� ����Դϴ�*************");
		
	}

	
}
