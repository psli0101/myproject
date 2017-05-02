package oo.test;

import java.util.ArrayList;

import oo.stati.Student;

public class Tester {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("123");
		list.add("234");
		list.add(1000);
		list.add(true);
		list.add("345");
		System.out.println(list.size());
		list.add("456");
		System.out.println(list.size());
		System.out.println(list);
		list.set(1, "678");
		list.set(2, false);
		System.out.println(list);

		System.out.println();

		ArrayList<String> x = new ArrayList();
		x.add("123");
		x.add("234");
		x.add("345");
		// x.add(123);
		String data = x.get(1);
		System.out.println(x);
		System.out.println(data);

		System.out.println();

		// 2017.05.02
		Student stu = new Student();
		stu.setName("TEST");
		stu.setEnglish(56);
		stu.setChinese(78);
		stu.setMath(86);
		stu.print();

		System.out.println();
		
		// Test 方法測試
		Test t = new Test();
		t.add("A");
		t.add(456);
		t.add(789);
		System.out.println(t.get(0));
		System.out.println(t.size());

		System.out.println();
		
		Test t2 = new Test();
		t2.add(new Student("A", 58, 62, 76));
		Student s = t2.get(0);
		s.print();
	}

}
