package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "lee");
		
		studentLee.addSubject("����",100);
		studentLee.addSubject("����",80);
	
		Student studentKim = new Student(1002, "kim");
		
		studentKim.addSubject("����",100);
		studentKim.addSubject("����",80);
		studentKim.addSubject("����",100);
		
		studentLee.showStudentSocre();
		System.out.println("=====================");
		studentKim.showStudentSocre();
	}

}
