package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Destop display");
		
	}

	@Override
	public void typing() {
		System.out.println("Destop typing");
		
	}

	@Override
	public void trunOn() {
		System.out.println("Destop turn off");
	}

	// ����Ŭ������ turn on turnoff �޾Ƽ� �������صδ뿩.
	// ��ü���� Ŭ������ �Ǿ���.
	// ����� ���������� ������ ����� ���� Ŭ����
}
