package ch16.gamelevel;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ʹ� ���� �ӵ� �����Ұ�~");
		
	}

	@Override
	public void jump() {
		System.out.println("�׳� �������վ��.");
		
	}

	@Override
	public void turn() {
		System.out.println("����ó�� ���Ƽ� ����.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********************��ȿ��� �ذ�***********************");
		
	}
	

}
