package com.singleList.demo;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		data = d;
	}
}

public class SingleList<T> {
	private Node<T> head = null;// 头结点，不是firstNode first = head.next;
	private int theSize = 0;

	public SingleList(T data) {
		head = new Node<T>(data);
		head.next = null;
		theSize = 0;
	}

	public boolean insert(int index, T data) {
		Node<T> newNode = new Node<T>(data);
		if (head.next == null || index == 0) {// 空链表或只有一个数据元素
			newNode.next = head.next;
			head.next = newNode;
			theSize++;
		} else {
			Node<T> p = getNode(index - 1);// 在index位置插入data，要获得index-1位索引
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	/**
	 * 得到索引index位的结点
	 * 
	 * @param idx
	 * @return
	 */
	private Node<T> getNode(int idx) {
		if (idx < 0 || idx > theSize) {
			throw new IndexOutOfBoundsException("索引范围越界，输入的索引位：" + idx);
		}
		Node<T> p = head.next;// firstNode
		for (int i = 0; i < idx; i++) {
			p = p.next;
		}
		return p;
	}

	/**
	 * 头插法
	 * 
	 * @param data
	 */
	public void addFirst(T data) {
		insert(0, data);
	}

	/**
	 * 尾插法
	 * 
	 * @param data
	 */
	public void addLast(T data) {
		insert(theSize, data);
	}

	// public boolean removeNode(int idx) {
	// if (head.next == null) {
	// System.out.println("链表为空，删除失败！");
	// }
	// if (idx == 0 || head.next.next == null) {// 删除第一个节点或者只有一个数据元素
	// // Node<T> p = firstNode;
	// // firstNode = p.next;
	// Node<T> p = head.next;
	// head.next = p.next;
	// // head.next = head.next.next;
	// theSize--;
	// } else {
	// Node<T> p = getNode(idx - 1);
	// Node<T> q = p.next;
	// p.next = q.next;
	// theSize--;
	// }
	// return true;
	// }

	public boolean removeNode(int idx) {
		if (head.next == null) {
			System.out.println("链表为空，删除失败");
			return false;
		}
		if (idx < 0 || idx >= theSize) {
			System.out.println("索引范围越界");
			return false;
		}
		if (idx == 0 || head.next.next == null) {// 删除第一个或者链表中只有一个元素时
			Node<T> p = head.next;
			head.next = p.next;
			p = null;
			theSize--;
		} else {
			// 删除idx位置的节点q
			Node<T> p = getNode(idx - 1);
			Node<T> q = p.next;// 根据idx-1位置的节点获取第idx位置的节点
			p.next = q.next;
			q = null;
			theSize--;
		}
		return true;
	}

	public void disPlay() {
		if (head == null || head.next == null) {
			System.out.println("链表为空！");
		}
		Node<T> p = head.next;
		for (; p != null; p = p.next) {
			if (p.next == null) {// 最后一个节点
				System.out.print(p.data);
			} else {
				System.out.print(p.data + "-->");
			}
		}
	}
	
	public Node<T> reverseList(){
		Node<T> p = head.next;
		Node<T> q = head.next.next;
		while(q !=null){
			
		}
		return null;
	}
}
