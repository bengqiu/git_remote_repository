package com.singleList.demo;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T d) {
		data = d;
	}
}

public class SingleList<T> {
	private Node<T> head;// ͷ��㣬����firstNode first = head.next;
	private int theSize = 0;

	public SingleList() {
		head = new Node("");
		head.next = null;
		theSize = 0;
	}

	public boolean insert(int index, T data) {
		Node<T> newNode = new Node<T>(data);
		if (head.next == null || index == 0) {// �������ֻ��һ������Ԫ��
			newNode.next = head.next;
			head.next = newNode;
			theSize++;
		} else {
			Node<T> p = getNode(index - 1);// ��indexλ�ò���data��Ҫ���index-1λ����
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	/**
	 * �õ�����indexλ�Ľ��
	 * 
	 * @param idx
	 * @return
	 */
	private Node<T> getNode(int idx) {
		if (idx < 0 || idx > theSize) {
			throw new IndexOutOfBoundsException("������ΧԽ�磬���������λ��" + idx);
		}
		Node<T> p = head.next;// firstNode
		for (int i = 0; i < idx; i++) {
			p = p.next;
		}
		return p;
	}

	/**
	 * ͷ�巨
	 * 
	 * @param data
	 */
	public void addFirst(T data) {
		insert(0, data);
	}

	/**
	 * β�巨
	 * 
	 * @param data
	 */
	public void addLast(T data) {
		insert(theSize, data);
	}

	public boolean removeNode(int idx) {
		if (head.next == null) {
			System.out.println("����Ϊ�գ�ɾ��ʧ�ܣ�");
		}
		if (idx == 0 || head.next.next == null) {// ɾ����һ���ڵ����ֻ��һ������Ԫ��
			// Node<T> p = firstNode;
			// firstNode = p.next;
			Node<T> p = head.next;
			head.next = p.next;
			// head.next = head.next.next;
			theSize--;
		} else {
			Node<T> p = getNode(idx - 1);
			Node<T> q = p.next;
			p.next = q.next;
			theSize--;
		}
		return true;
	}

	public void disPlay() {
		if (head == null || head.next == null) {
			System.out.println("����Ϊ�գ�");
		}
		Node<T> p = head.next;
		for (; p != null; p = p.next) {
			if (p.next == null) {// ���һ���ڵ�
				System.out.print(p.data);
			} else {
				System.out.print(p.data + "-->");
			}
		}
	}
}
