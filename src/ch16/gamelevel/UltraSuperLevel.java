package ch16.gamelevel;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("너무 빨라서 속도 측정불가~");
		
	}

	@Override
	public void jump() {
		System.out.println("그냥 날수도잇어요.");
		
	}

	@Override
	public void turn() {
		System.out.println("팽이처럼 돌아서 공격.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("**********************원효대사 해골물***********************");
		
	}
	

}
