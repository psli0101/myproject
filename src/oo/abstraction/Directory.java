package oo.abstraction;

public class Directory {
	int ID_number;
	char gender;
	String name;
	String birthday;
	String phone_number;

	public Directory(int ID_number, char gender, String name) {
		this.ID_number = ID_number;
		this.gender = gender;
		this.name = name;
	}

	public Directory(int ID_number, char gender, String name, String birthday, String phone_number) {
		this(ID_number, gender, name);
		this.birthday = birthday;
		this.phone_number = phone_number;
	}
}
