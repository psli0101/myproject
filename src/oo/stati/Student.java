package oo.stati;

public class Student {
	static int pass = 60;
	String name;
	int english;
	int chinese;
	int math;

	static {
		System.out.println("Name\tEnglish\tChinese\tMath");
	}

	public Student() {
		super();
	}

	public Student(String name, int english, int chinese, int math) {
		this.name = name;
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}

	public void setEnglish(int grades) {
		english = grades;
	}

	public void setChinese(int grades) {
		chinese = grades;
	}

	public void setMath(int grades) {
		math = grades;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(name + "\t" + getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
}
