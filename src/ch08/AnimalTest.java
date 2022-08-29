package ch08;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
	public void eating() {
		
	}
	//����Ŭ������ �����ϸ� ��� ���� Ŭ�������� ���� ����� �� �ִ�.
	//�ڵ� ������ ��� Ŭ������ �߰��ص� extends����ؼ� �߰��ϸ� �ȴ�.
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �����Դϴ�");	
	}
	public void readBook() {
		System.out.println("����� å�� �б���Ѱ���? ");
	}
	
}

class Rabbit extends Animal{

	@Override
	public void move() {
		System.out.println("�䳢�� ���l���l~");	
	}
	public void cute() {
		System.out.println("�䳢�� ���䳢��~");
		}
	}
class Dog extends Animal{
	public void move() {
		System.out.println("������ �� ���̰� ���� �Ϳ�����><");
	}
	public void bark() {
		System.out.println("���̴� �� ¢���. ���� ���� ");
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
			// arrayList�� �ŰԺ����� �����ϰ� �ٿ�ĳ���� �� ����
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
