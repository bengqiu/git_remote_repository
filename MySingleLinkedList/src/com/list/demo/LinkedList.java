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
	 * ���������
	 */
	private Node<AnyType> firstNode;// �����һ���ڵ�
	private int theSize;// ����ĳ���

	/**
	 * ��ʼ������(������)
	 */
	public LinkedList() {
		firstNode = null;
		theSize = 0;
	}

	/**
	 * �ڹ̶�λ�ò�������Ԫ�ع��� 1.���Ҫ�����λ��Ϊ��һ�� 2.��������в�������Ԫ�� 3.��������
	 */
	private boolean add(int index, AnyType data) {
		// �������Ϊ�ջ����ڵ�һλ�ò�������Ԫ��
		// firstNode==null���������
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (index == 0 || firstNode == null) {
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		} else {
			// �������룺�Ȼ��index-1λ�õĽڵ�
			Node<AnyType> p = getNode(index - 1);
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	private Node<AnyType> getNode(int index) {// ��ȡĳ������λ�õ�����Ԫ�أ��ڵ㣩
		if (index < 0 || index > theSize) {// Խ��
			// ˵�������index=theSize;�õ�����null,������Խ��
			throw new IndexOutOfBoundsException("");
		}
		Node<AnyType> p = firstNode;
		for (int i = 0; i < index; i++)
			p = p.next;
		return p;
	}

	// ͷ�巨����������
	public void addFirst(AnyType data) {
		add(0, data);
	}

	// β�巨����������
	public void addLast(AnyType data) {
		add(theSize, data);
	}

	/**
	 * ����������
	 */
	public void printList(Node<AnyType> first) {
		System.out.print("��������:\t");
		for (Node<AnyType> p = first; p != null; p = p.next) {
			if (p.next == null) {
				System.out.print(p.data + "\n");
			} else {
				System.out.print(p.data + "����>");
			}
		}
	}

	public void printList() {
		System.out.print("��������:\t");
		for (Node<AnyType> p = firstNode; p != null; p = p.next) {
			if (p.next == null) {
				System.out.print(p.data + "\n");
			} else {
				System.out.print(p.data + "����>");
			}
		}
	}

	/**
	 * ��ȡ������ĳ���(������������)
	 */
	public int getSize() {
		return theSize;
	}

	/**
	 * ��ĳ��λ�ò���(�����жϳɹ�����ʧ����ʾ)
	 */
	public void addElement(int index, AnyType data) {
		if (add(index - 1, data)) {// �ڼ���λ�ã�����������
			System.out.println("��" + index + "��λ�ò������ݡ�" + data + "���ɹ���");
		} else {
			System.out.println("��" + index + "��λ�ò������ݡ�" + data + "���ɹ���");
		}
	}

	/**
	 * ���õ�����
	 */
	public Node<AnyType> reverseList() {
		// ʹ��ͷ�巨(��Ҫ�����ڵ㣺head�� p��q)
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
		return newNode;// ���ص�һ�����
	}

	public Node<AnyType> get_firstNode() {
		return firstNode;
	}
	// 1 --> 2---3 --->4
	// p q p q
	// q = p.next;
	// p.next = null;

	/**
	 * ��Ҫһ��head, prev, pCur
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
