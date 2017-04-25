package oo.stati;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student();
		Student stu1 = new Student("A", 58, 62, 76);
		Student stu2 = new Student("B", 96, 46, 61);
		Student.pass = 70;
		stu1.print();
		stu2.print();
		GradeStudent gstu1 = new GradeStudent("C", 58, 62, 76, 79);
		gstu1.print();
	}

}
