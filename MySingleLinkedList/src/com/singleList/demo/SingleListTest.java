package com.singleList.demo;

public class SingleListTest {
	SingleList<String> singleList = new SingleList<String>();
	/**
	 * 构建单链表(头插法或尾插法)
	 * 
	 * @param str
	 * @param isHeadInsert
	 */
	private void createSingleList(String str, boolean isHeadInsert) {
		String verStr = "";
		for (int i = 0; i < str.length(); i++) {
			// String.valueOf()方法避免了空指针
			verStr = String.valueOf(str.charAt(i));
			if (isHeadInsert) {
				singleList.addFirst(verStr);
			} else {
				singleList.addLast(verStr);
			}
		}
	}
	
	private void displaySingleList() {
		singleList.disPlay();
	}

	public static void main(String args[]) {
		String str = "abcdefg";
		SingleListTest testClass = null;
		testClass = new SingleListTest();
		//创建单链表(头插法)
		testClass.createSingleList(str, true);
		//遍历单链表
		testClass.displaySingleList();
		System.out.println();
		testClass = new SingleListTest();
		//创建单链表(尾插法)
		testClass.createSingleList(str, false);
		//遍历单链表
		testClass.displaySingleList();
	}
}
