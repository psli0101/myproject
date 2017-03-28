package oo.collections;

import java.util.*;

public class Invoice {
	/*
	 * 題目： 本次開獎號為331, 821, 886, 554 讓使用者輸入發票碼 (長度不限) 判斷尾數3位是否中獎
	 */
	public static void main(String[] args) {
		boolean flag;
		ArrayList<String> num = new ArrayList();
		num.add("331");
		num.add("821");
		num.add("886");
		num.add("554");
		Scanner inPut = new Scanner(System.in);
		String n = inPut.nextLine();
		String a = n.substring(n.length() - 3);
		for (int i = 0; i < 4; i++) {
			if(a.equals(num.get(i))){
				flag = true;
			}
		}
		if(flag = true){
			System.out.println("有中獎");
		}else{
			System.out.println("沒中獎");
		}
	}

}
