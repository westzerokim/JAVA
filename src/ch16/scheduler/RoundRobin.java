package ch16.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
		
	}
	

}
