package test;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("흥부", 1);
	
		s1.setScore(80);
		s1.printResult();
		s2.printResult();
		
		System.out.println(Student.studentCount);
	}
}
