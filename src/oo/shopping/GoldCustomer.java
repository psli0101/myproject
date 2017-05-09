package oo.shopping;

public class GoldCustomer extends SilverCustomer {

	private float percent = 0.05f;

	public GoldCustomer(int cost) {
		super(cost);
		this.dis = (int) (cost * discount);
		this.money = (int) (cost * percent);
	}

}
