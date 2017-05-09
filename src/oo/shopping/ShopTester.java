package oo.shopping;

import java.util.ArrayList;

/* 
 * 題目：
 * 
 * 有一個商店，客戶分為「一般客戶」、「銀級客戶」、「金級客戶」三種。
 * 銀級客戶每次消費有九折折扣
 * 金級客戶除了九折折扣外，每次消費還提供%還元金
 */

public class ShopTester {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldCustomer(10000));
		
		for (int i = 0; i < list.size(); i++) {
			Customer cust = (Customer) list.get(i);
			cust.print();
		}
	}

}
