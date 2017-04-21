package com.singleList.demo;

public class SingleListTest {
	SingleList<String> singleList = new SingleList<String>("");

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

	private void removeAfterAndDispaly(int index) {
		System.out.print("\n删除第" + (index + 1) + "个节点后，遍历结果：");
		singleList.removeNode(index);// 删除第三个节点d
		System.out.println();
		displaySingleList();
	}

	public static void main(String args[]) {
		String str = "abcdefg";
		SingleListTest testClass = null;
		testClass = new SingleListTest();
		// --1.创建单链表(尾插法)，顺序创建
		testClass.createSingleList(str, false);
		// --2. 遍历单链表
		testClass.displaySingleList();

		// --3.删除第3个位置节点元素 "d",并遍历
		testClass.removeAfterAndDispaly(0);
		// testClass = new SingleListTest();
		// // 创建单链表(头插法)，逆序创建
		// testClass.createSingleList(str, false);
		// // 遍历单链表
		// testClass.displaySingleList();
	}
}
