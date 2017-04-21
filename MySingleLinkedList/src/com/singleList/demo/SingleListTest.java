package com.singleList.demo;

public class SingleListTest {
	SingleList<String> singleList = new SingleList<String>();
	/**
	 * ����������(ͷ�巨��β�巨)
	 * 
	 * @param str
	 * @param isHeadInsert
	 */
	private void createSingleList(String str, boolean isHeadInsert) {
		String verStr = "";
		for (int i = 0; i < str.length(); i++) {
			// String.valueOf()���������˿�ָ��
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
		//����������(ͷ�巨)
		testClass.createSingleList(str, true);
		//����������
		testClass.displaySingleList();
		System.out.println();
		testClass = new SingleListTest();
		//����������(β�巨)
		testClass.createSingleList(str, false);
		//����������
		testClass.displaySingleList();
	}
}
