package ch16.gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("우사인볼트 달리기 가능.");
		
	}

	@Override
	public void jump() {
		System.out.println("최대 2미터까지 점프가능~");
		
	}

	@Override
	public void turn() {
		System.out.println("회전이 가능합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************당신은 고수입니다*************");
		
	}

	
}
