package oo.mid;

/*
 * Please write setter and getter methods for three fields of class Ticket:
 */
public class Ticket {
	int id;
	String name;
	float price;

	public void set(int id) {
		this.id = id;
	}

	public void set(String name) {
		this.name = name;
	}

	public void set(float price) {
		this.price = price;
	}

	// 以下為訂正
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
