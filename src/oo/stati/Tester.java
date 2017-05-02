package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student();
		Student stu1 = new Student("A", 58, 62, 76);
		Student stu2 = new Student("B", 96, 46, 61);
		Student.pass = 70;
		stu1.print();
		stu2.print();
		System.out.println();
		GradeStudent gstu1 = new GradeStudent("C", 58, 62, 76, 79);
		gstu1.print();
		System.out.println();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("A", 58, 62, 76));
		list.add(new Student("B", 96, 46, 61));
		list.add(new GradeStudent("C", 58, 62, 76, 79));
		for(int i =0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}
}
