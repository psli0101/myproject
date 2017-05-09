package oo.shopping;

public class SilverCustomer extends Customer {

	public static float discount = 0.9f;

	public SilverCustomer(int cost) {
		super(cost);
		this.dis = (int) (cost * discount);
	}
	
}
