package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Altis", 1800);
		Car car2 = new Car("Honda", "Accord", 2000);
		Car car3 = new Car("Toyota", "Wish", 2000);

		Car[] cars = new Car[3];
		cars[0] = new Car("Toyota", "Altis", 1800);
		cars[1] = new Car("Honda", "Accord", 2000);
		cars[2] = new Car("Toyota", "Wish", 2000);
		System.out.println(cars[1].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		System.out.println(i);
		for (i = 0; i <= 9; i = i + 2) {
			System.out.println(i);
		}
		System.out.println(i);
		class AA {

		}
		AA aa = new AA();
	}

}
