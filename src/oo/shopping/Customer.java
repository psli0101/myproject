package oo.shopping;

public class Customer {

	static {
		System.out.println("今天, 消費紀錄如下：");
		System.out.println("會員\t原本消費\t折扣後\t還元金");
	}

	public int cost;
	public int dis;
	public int money;

	public Customer() {

	}

	public Customer(int cost) {
		this.cost = cost;
		this.dis = cost;
	}

	public void print() {
		System.out.println("一般會員" + "\t" + cost + "\t" + dis + "\t" + money);
	}

}
