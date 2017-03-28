package oo.abstraction;

public class Car {
	String brand;
	String name;
	String type;
	int cc;
	int status;
	float milage;

	public Car(String brand, String name, int cc) {
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	
	public void setMilage(float m){
		this.milage = m;
	}
	
	public void addMilage(float m){
		milage = milage + m;
	}
	
	public void showMilage(){
		System.out.println("目前里程數："+this.milage+"km");
	}
}
