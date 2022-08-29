package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("harry poter1");
		bookQueue.enQueue("harry poter2");
		bookQueue.enQueue("harry poter3");
		bookQueue.enQueue("harry poter4");
		bookQueue.enQueue("harry poter5");
		
		 System.out.println(bookQueue.getSize());
		 System.out.println(bookQueue.deQueue());
		 System.out.println(bookQueue.deQueue());
		 System.out.println(bookQueue.deQueue());
		 System.out.println(bookQueue.deQueue());
		 System.out.println(bookQueue.deQueue());
		 

	}

}
