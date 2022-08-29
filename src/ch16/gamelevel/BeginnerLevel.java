package ch16.gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump는 못해요");
		
	}

	@Override
	public void turn() {
		System.out.println("turn도 못해요");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 삐빅 당신은 초급자 레벨업을 원하신다면 돈을 쓰세요 ^^*****");
		
	}
	
	

}
