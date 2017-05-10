package com.list.demo;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		data = d;
	}
}

public class LinkedList<AnyType> {
	/**
	 * 定义类变量
	 */
	private Node<AnyType> firstNode;// 链表第一个节点
	private int theSize;// 链表的长度

	/**
	 * 初始化链表(空链表)
	 */
	public LinkedList() {
		firstNode = null;
		theSize = 0;
	}

	/**
	 * 在固定位置插入数据元素过程 1.如果要插入的位置为第一个 2.向空链表中插入数据元素 3.正常插入
	 */
	private boolean add(int index, AnyType data) {
		// 如果链表为空或者在第一位置插入数据元素
		// firstNode==null代表链表空
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (index == 0 || firstNode == null) {
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		} else {
			// 正常插入：先获得index-1位置的节点
			Node<AnyType> p = getNode(index - 1);
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	private Node<AnyType> getNode(int index) {// 获取某个索引位置的数据元素（节点）
		if (index < 0 || index > theSize) {// 越界
			// 说明，如果index=theSize;得到的是null,不属于越界
			throw new IndexOutOfBoundsException("");
		}
		Node<AnyType> p = firstNode;
		for (int i = 0; i < index; i++)
			p = p.next;
		return p;
	}

	// 头插法创建单链表
	public void addFirst(AnyType data) {
		add(0, data);
	}

	// 尾插法创建单链表
	public void addLast(AnyType data) {
		add(theSize, data);
	}

	/**
	 * 遍历单链表
	 */
	public void printList(Node<AnyType> first) {
		System.out.print("遍历链表:\t");
		for (Node<AnyType> p = first; p != null; p = p.next) {
			if (p.next == null) {
				System.out.print(p.data + "\n");
			} else {
				System.out.print(p.data + "——>");
			}
		}
	}

	public void printList() {
		System.out.print("遍历链表:\t");
		for (Node<AnyType> p = firstNode; p != null; p = p.next) {
			if (p.next == null) {
				System.out.print(p.data + "\n");
			} else {
				System.out.print(p.data + "——>");
			}
		}
	}

	/**
	 * 获取单链表的长度(开个公共方法)
	 */
	public int getSize() {
		return theSize;
	}

	/**
	 * 在某个位置插入(整合判断成功还是失败提示)
	 */
	public void addElement(int index, AnyType data) {
		if (add(index - 1, data)) {// 第几个位置，单独处理下
			System.out.println("第" + index + "个位置插入数据【" + data + "】成功！");
		} else {
			System.out.println("第" + index + "个位置插入数据【" + data + "】成功！");
		}
	}

	/**
	 * 逆置单链表
	 */
	public Node<AnyType> reverseList() {
		// 使用头插法(需要三个节点：head、 p、q)
		// Node<AnyType> head = new Node<AnyType>(null);
		// head.next = firstNode;
		// Node<AnyType> prev = head.next;
		// Node<AnyType> pCur = prev.next;
		// while(pCur!=null){
		// prev.next = pCur.next;
		// pCur.next = head.next;
		// head.next = pCur;
		// pCur = prev.next;
		// }
		Node<AnyType> p = firstNode;
		Node<AnyType> newNode = null;
		Node<AnyType> temp = null;
		while (p != null) {
			temp = p.next;
			p.next = newNode;
			newNode = p;
			p = temp;
		}
		return newNode;// 返回第一个结点
	}

	public Node<AnyType> get_firstNode() {
		return firstNode;
	}
	// 1 --> 2---3 --->4
	// p q p q
	// q = p.next;
	// p.next = null;

	/**
	 * 需要一个head, prev, pCur
	 * 
	 * @return
	 */
	public Node<AnyType> reverseNode2() {
		Node<AnyType> head = new Node<AnyType>(null);
		head.next = firstNode;
		Node<AnyType> prev = head.next;
		Node<AnyType> pCur = prev.next;
		while (pCur != null) {
           
		}
		return null;
	}
}
