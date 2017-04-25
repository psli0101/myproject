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

	public void order(String food, int price) {
		allOrder.add(food);
		this.price.add(price);
		allPrice = allPrice + price;
	}

	public void show() {
		for (int i = 0; i < allOrder.size(); i++) {
			System.out.println(allOrder.get(i) + " " + price.get(i)+" doller(s)");
		}
		System.out.print("Total: "+allPrice);
	}

}
