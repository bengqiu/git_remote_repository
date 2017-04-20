package com.list.demo;

import java.util.Scanner;

public class TestLinkedList {

	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<String>();
		String str = "";
		/**
		 * 逆序创建单链表(头插法)
		 */
		// System.out.println("请输入：");
		// Scanner scanner = new Scanner(System.in);
		// while(!scanner.hasNext("q")){
		// System.out.println("请输入：");
		// str = scanner.nextLine();
		// linkedList.addFirst(str);
		// }
		// scanner.close();
		/**
		 * 正序插入（尾插法）
		 */
		System.out.println("输入一串字符串:");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		String[] arrays = str.split("、");
		for (int i = 0; i < arrays.length; i++) {
			linkedList.addLast(arrays[i]);
		}
		scanner.close();
		/**
		 * 遍历单链表
		 */
		linkedList.printList();

		/**
		 * 获取单链表长度
		 */
		System.out.println("单链表长度:" + linkedList.getSize());

		/**
		 * 第三个位置插入67，第9个位置插入10
		 */
		linkedList.addElement(7, "67");
//		linkedList.addElement(9, "10");
		System.out.println("插入之后，遍历单链表：");
		linkedList.printList();
	}
}
