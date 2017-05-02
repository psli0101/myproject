package oo.stati;

public class GradeStudent extends Student {
	int thesis;
	static {
		System.out.println("Name\tEnglish\tChinese\tMath\tThesis");
	}
	
	public GradeStudent(){
		super();
	}

	public GradeStudent(String name, int english, int chinese, int math, int thesis) {
		super(name, english, chinese, math);
		this.thesis = thesis;
	}

	public void setThesis(int grades) {
		thesis = grades;
	}

	@Override
	public void print() {
		System.out.println(
				name + "\t" + getScore(english) + "\t" + getScore(chinese) + "\t" + getScore(math) + "\t" + thesis);
	}
}
