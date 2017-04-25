package oo.mid;

import java.util.ArrayList;

/*
 * If you need to design a class named Meal for MacDonald's ordering process. 
 * What does it look like?
 */
public class Meal {
	ArrayList<String> allOrder = new ArrayList();
	ArrayList<Integer> price = new ArrayList();
	int allPrice;

	// 以下為訂正
	float discount;
	public Meal(String type){
		switch (type) {
		case "A":
			discount = 1f;
			break;
		case "B":
			discount = 0.9f;
			break;
		case "C":
			discount = 0.5f;
			break;
		}
	}
	// 以上為訂正

	public void order(String food, int price) {
		allOrder.add(food);
		this.price.add(price);
		allPrice = allPrice + price;
	}

	public void show() {
		for (int i = 0; i < allOrder.size(); i++) {
			System.out.println(allOrder.get(i) + " " + price.get(i) + " doller(s)");
		}
		System.out.print("Total: " + allPrice*discount);
	}
}
