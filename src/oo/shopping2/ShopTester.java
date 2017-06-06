package oo.shopping2;

import java.util.ArrayList;

import oo.shopping.Customer;

public class ShopTester {

	public static void main(String[] args) {
		ArrayList<NormalCustomer> list = new ArrayList<>();
		list.add(new NormalCustomer());
		list.add(new NormalCustomer());
		list.add(new SilverCustomer());
		list.add(new GoldenCustomer());
		list.add(new NormalCustomer());
		list.add(new SilverCustomer());
		
		for (NormalCustomer cust : list) {
			cust.print();
		}
	}

}
