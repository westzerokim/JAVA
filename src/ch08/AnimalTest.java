package ch08;

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
	
//		
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(rAnimal);
//		test.moveAnimal(dAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(rAnimal);
		animalList.add(dAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
			// arrayList를 매게변수로 변경하고 다운캐스팅 할 예정
		}
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if ( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if ( animal instanceof Rabbit) {
				 Rabbit rabbit = (Rabbit)animal;
				 rabbit.cute();
			}
			else if( animal instanceof Dog) {
				Dog dog = (Dog)animal;
				dog.bark();
			}
			else {
				 System.out.println("unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}
