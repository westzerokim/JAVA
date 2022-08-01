package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "lee");
		
		studentLee.addSubject("국어",100);
		studentLee.addSubject("수학",80);
	
		Student studentKim = new Student(1002, "kim");
		
		studentKim.addSubject("국어",100);
		studentKim.addSubject("수학",80);
		studentKim.addSubject("영어",100);
		
		studentLee.showStudentSocre();
		System.out.println("=====================");
		studentKim.showStudentSocre();
	}

}
