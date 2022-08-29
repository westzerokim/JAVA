package ch09;

public abstract  class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("Destop display");
		
	}
	//Computer에 있는 가상 메서드 2개다 안받으면 오류 발생합니다.
	//한가지의 메서드만 쓰고싶은 경우에은 notebook을 가상 클래스로 지정해야 가능하다.
	


}
