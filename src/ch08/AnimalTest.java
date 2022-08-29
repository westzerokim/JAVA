package ch08;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("µ¿¹°ÀÌ ¿òÁ÷ÀÔ´Ï´Ù");
	}
	public void eating() {
		
	}
	//»óÀ§Å¬·¡½º¿¡ ¼±¾ðÇÏ¸é ¸ðµç ÇÏÀ§ Å¬·¡½º¿¡¼­ °°ÀÌ »ç¿ëÇÒ ¼ö ÀÖ´Ù.
	//ÄÚµå Àç»ç¿ëÀÇ ¹æ¹ý Å¬·¡½º¸¦ Ãß°¡ÇØµµ extends»ç¿ëÇØ¼­ Ãß°¡ÇÏ¸é µÈ´Ù.
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("»ç¶÷ÀÌ ¿òÁ÷ÀÔ´Ï´Ù");	
	}
	public void readBook() {
		System.out.println("»ç¶÷ÀÌ Ã¥À» ÀÐ±â´ÂÇÑ°¡¿ä? ");
	}
	
}

class Rabbit extends Animal{

	@Override
	public void move() {
		System.out.println("Åä³¢´Â ±ø­l²¤­l~");	
	}
	public void cute() {
		System.out.println("Åä³¢´Â ´ÞÅä³¢Áö~");
		}
	}
class Dog extends Animal{
	public void move() {
		System.out.println("°­¾ÆÁö Áß µ¿ÀÌ°¡ Á¦ÀÏ ±Í¿©¿ö¿ä><");
	}
	public void bark() {
		System.out.println("µ¿ÀÌ´Â Àß Â¢¾î¿ä. ¾ÆÁÖ ÀåÇØ ");
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
			// arrayList¸¦ ¸Å°Ôº¯¼ö·Î º¯°æÇÏ°í ´Ù¿îÄ³½ºÆÃ ÇÒ ¿¹Á¤
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
