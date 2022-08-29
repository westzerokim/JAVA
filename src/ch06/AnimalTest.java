package ch06;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	public void eating() {
		
	}
	//상위클래스에 선언하면 모든 하위 클래스에서 같이 사용할 수 있다.
	//코드 재사용의 방법 클래스를 추가해도 extends사용해서 추가하면 된다.
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 움직입니다");	
	}
	public void readBook() {
		System.out.println("사람이 책을 읽기는한가요? ");
	}
	
}

class Rabbit extends Animal{

	@Override
	public void move() {
		System.out.println("토끼는 깡춍깽춍~");	
	}
	public void cute() {
		System.out.println("토끼는 달토끼지~");
		}
	}
class Dog extends Animal{
	public void move() {
		System.out.println("강아지 중 동이가 제일 귀여워요><");
	}
	public void bark() {
		System.out.println("동이는 잘 짖어요. 아주 장해 ");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal rAnimal = new Rabbit();
		Animal dAnimal = new Dog();
		// 여러타입의 클래스를 Animal로 핸들링함
//		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(rAnimal);
//		test.moveAnimal(dAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(rAnimal);
		animalList.add(dAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}
//상속을 하게되면 상위 클래스 하나로 하위 클래스를 핸들링 할 수 있다.
//상속은 신중하게 설계해야한다 
