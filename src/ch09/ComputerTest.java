package ch09;

public class ComputerTest {

	public static void main(String[] args) {


		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		//Computer computer = new Computer(); Cannot instantiate the type Computer라는 에러가 발생합니다!

	}

}
