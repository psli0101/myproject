package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(58, 62, 76);
		Student stu2 = new Student(96, 46, 61);
		Student.pass = 70;
		stu1.print();
		stu2.print();
	}

}
