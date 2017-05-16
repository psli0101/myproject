package oo.shopping;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * 題目：
 * 
 * 有一個商店，客戶分為「一般客戶」、「銀級客戶」、「金級客戶」三種。
 * 銀級客戶每次消費有九折折扣
 * 金級客戶除了九折折扣外，每次消費還提供5%還元金
 */

public class ShopTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		
		// 輸出功能設計
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
		
		/* 術入功能設計
		ArrayList<Customer> list2 = new ArrayList<>();
		boolean flag = true;
		do{
			
			System.out.print("會員類型：");
			String type = input.nextLine();
			switch(type){
				case "N":
					System.out.print("消費金額：");
					list2.add(new Customer(Integer.parseInt(input.nextLine())));
					break;
				case "S":
					System.out.print("消費金額：");
					list2.add(new SilverCustomer(Integer.parseInt(input.nextLine())));
					break;
				case "G":
					System.out.print("消費金額：");
					list2.add(new GoldCustomer(Integer.parseInt(input.nextLine())));
					break;
				default:
					flag = false;
					break;
			}
		}while(flag);
		for (int i = 0; i < list2.size(); i++) {
			Customer cust = (Customer) list2.get(i);
			cust.print();
		}
		*/
	}

}
