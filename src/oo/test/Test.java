package oo.test;

public class Test {
	public void testOne() {
		System.out.println("OK.");
	}
	/*
	 * private void testTwo(){ System.out.println("OK."); }
	 */

	// 方法測試
	private int i; // 紀錄陣列
	private Object[] object = new Object[10];//暫時用法

	public void add(Object ob) {
		i++;
		object[i - 1] = ob;
		//private void ??????
	}
	
	public void set(int i, Object ob){
		object[i - 1] = ob;
	}

	public Object get(int i) {
		return object[i];
	}
	
	public int size(){
		return this.i;
	}
	
	/* 如何生成可無限增長的陣列?
	 * 產生新陣列，將舊陣列的東西放進去，刪除舊陣列
	 */
	//private void ??????
}
