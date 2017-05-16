package oo.shopping;

public class SilverCustomer extends Customer {

	public static float discount = 0.9f;

	public SilverCustomer(int cost) {
		super(cost);
		this.dis = (int) (cost * discount);
	}
	
	@Override
	public void print() {
		System.out.println("銀級會員" + "\t" + cost + "\t" + dis + "\t" + money);
	}
}
