package com.list.demo;

import java.util.Scanner;

public class TestLinkedList {

	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<String>();
		String str = "";
		/**
		 * ���򴴽�������(ͷ�巨)
		 */
		// System.out.println("�����룺");
		// Scanner scanner = new Scanner(System.in);
		// while(!scanner.hasNext("q")){
		// System.out.println("�����룺");
		// str = scanner.nextLine();
		// linkedList.addFirst(str);
		// }
		// scanner.close();
		/**
		 * ������루β�巨��
		 */
		System.out.println("����һ���ַ���:");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		String[] arrays = str.split("��");
		for (int i = 0; i < arrays.length; i++) {
			linkedList.addLast(arrays[i]);
		}
		scanner.close();
		/**
		 * ����������
		 */
		linkedList.printList();

		/**
		 * ��ȡ��������
		 */
		System.out.println("��������:" + linkedList.getSize());

		/**
		 * ������λ�ò���67����9��λ�ò���10
		 */
		linkedList.addElement(7, "67");
//		linkedList.addElement(9, "10");
		System.out.println("����֮�󣬱���������");
		linkedList.printList();
	}
}
