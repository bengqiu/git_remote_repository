package com.train.demo001;

/**
 * 无头结点的单链表的创建
 * 
 * @author yzw
 *
 */
public class MySinglelist<AnyType> {
	// 先定义第一个结点和链表元素个数
	private Node<AnyType> firstNode;
	private int theSize = 0;

	// --1.创建单链表要分以下情况来考虑
	// ①采用头插法还是尾插法（哪种方式好呢）
	// as：头插法（逆插法创建链表）
	// ②链表为空的时候；链表不为空的时候
	// ③链表的长度（结点的个数）
	public void createSingleList(AnyType data) {
		// ①new出一个新的节点
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (theSize == 0 || firstNode == null) {
			firstNode = newNode;
			firstNode.next = null;
			theSize++;
		} else {
			// 链表不为空
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		}
	}

	/**
	 * idx是第几个结点的意思
	 * 
	 * @param idex,idx>=1
	 * @return
	 */
	public Node<AnyType> getNode(int idex) {
		if (idex < 0 || idex > theSize) {
			throw new IndexOutOfBoundsException();
		}
		if (theSize == 0 || firstNode == null || idex == 0) {
			return null;
		}
		Node<AnyType> p = firstNode;
		for (int i = 0; i < idex - 1; i++) {
			p = p.next;
		}
		return p;
	}

	public Node<AnyType> getNodeByIndex(int indx) {// 获取索引位的结点元素，indx>=0
		if (indx < 0 || indx > theSize) {
			throw new IndexOutOfBoundsException();
		}
		Node<AnyType> p = firstNode;
		for (int i = 0; i < theSize; i++) {
			p = p.next;
		}
		return p;
	}

	/**
	 * 创建单链表（尾插法） 1.要获得最后一个节点 2.只有一个节点，
	 */
	public void createSListByTailInsert(AnyType data) {
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (theSize == 0 || firstNode == null) {
			firstNode = newNode;
			firstNode.next = null;
			theSize++;
		} else {
			Node<AnyType> p = getNode(theSize);
			p.next = newNode;
			newNode.next = null;
			theSize++;
		}
	}

	public boolean addNode(int idex, AnyType data) {// 在任意位置insert数据data
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (idex <= 0 || idex > theSize + 1) {
			System.out.println("Fail to Insert,indexoutofbounds");
			return false;
		}
		if (idex == 1 || firstNode.next == null) {// 只有一个元素
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		} else {
			Node<AnyType> p = getNode(idex - 1);// 在第idex个结点insert,需要获取第idex-1个结点
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	/**
	 * 整合（add，头插，尾插法可以共用）
	 */
	public boolean addInsert(int idex, AnyType data) {
		if (idex < 0 || idex > theSize) {
			throw new IndexOutOfBoundsException();
		}
		Node<AnyType> newNode = new Node<AnyType>(data);
		// 链表为空
		// 在头部insert,idex=0
		if (firstNode == null) {
			firstNode = newNode;
			newNode.next = null;
			theSize++;
		}else if (idex == 0) {
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		} else {
			Node<AnyType> p = getNodeByIndex(idex - 1);
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	/**
	 * 遍历单链表 1.如果链表为空，显示失败 2.链表非空，从头开始遍历
	 */
	public void displayList() {
		if (theSize == 0 || firstNode == null) {
			System.out.println("链表为空，无法打印链表元素");
			return;
		}
		// 从第一个结点开始遍历
		Node<AnyType> p = firstNode;
		while (p != null) {// 不知道遍历多少次，就是用while; do-while，循环语句至少遍历一次
			if (p.next == null) {
				System.out.print(p.data);
			} else {
				System.out.print(p.data + "-->");
			}
			p = p.next;
		}
	}

	public int getSize() {
		Node<AnyType> p = firstNode;
		int num = 0;
		while (p != null) {
			++num;
			p = p.next;
		}
		return num;
	}
}

class Node<AnyType> {
	AnyType data;
	Node<AnyType> next;

	public Node(AnyType d) {
		data = d;
	}
}
