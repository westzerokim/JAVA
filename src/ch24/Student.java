package ch24;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	

	ArrayList<Subject> subjectList;
	
	
	public Student(int id, String name) {
		this.studentID = id;
		this.studentName = name;

		subjectList = new ArrayList<>();
	}
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	public void showStudentSocre() {
		
		int total = 0;
		
		for(Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(studentName +  " �л��� ������ " + subject.getName() + "������ ������." + subject.getScorePoint() + "�� �Դϴ�."  );
		}
		
		System.out.println(studentName +  " �л��� ������ " + total + "�� �Դϴ�."  );
		
	}
}
