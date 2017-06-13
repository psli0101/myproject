package oo.test2;

public class Member {
	private String id;
	private int age;
	private String name;
	
	public Member(){
		
	}

	public Member(String name) {
		System.out.println("member construction");
		this.name = name;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return this.age;
	}
}
