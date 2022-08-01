package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>(); 
		//얘네를 입력하면 빨간줄이 뜨는데 import를 안해줘서 그런다! ctrl + shift + o입력해서 import해주기!
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for(int i =0; i<library.size(); i++) {
			library.get(i).showBookInfo();

		}
	}
}
