package oo.stati;

public class Student {
	static int pass = 60;
	int english;
	int chinese;
	int math;

	public Student(int english, int chinese, int math) {
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
}
