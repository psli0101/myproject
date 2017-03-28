package oo.test;

import java.util.ArrayList;

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
	}

}
