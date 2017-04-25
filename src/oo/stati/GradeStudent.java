package oo.stati;

public class GradeStudent extends Student {
	int thesis;
	static{
		System.out.println("Name\tEnglish\tChinese\tMath\tThesis");
	}
	public GradeStudent(String name, int english, int chinese, int math, int thesis) {
		super(name, english, chinese, math);
		this.thesis = thesis;
	}
	
}
