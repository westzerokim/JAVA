package ch06;

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
		// ¿©·¯Å¸ÀÔÀÇ Å¬·¡½º¸¦ Animal·Î ÇÚµé¸µÇÔ
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
//»ó¼ÓÀ» ÇÏ°ÔµÇ¸é »óÀ§ Å¬·¡½º ÇÏ³ª·Î ÇÏÀ§ Å¬·¡½º¸¦ ÇÚµé¸µ ÇÒ ¼ö ÀÖ´Ù.
//»ó¼ÓÀº ½ÅÁßÇÏ°Ô ¼³°èÇØ¾ßÇÑ´Ù 
