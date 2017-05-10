package com.train.demo001;

/**
 * ��ͷ���ĵ�����Ĵ���
 * 
 * @author yzw
 *
 */
public class MySinglelist<AnyType> {
	// �ȶ����һ����������Ԫ�ظ���
	private Node<AnyType> firstNode;
	private int theSize = 0;

	// --1.����������Ҫ���������������
	// �ٲ���ͷ�巨����β�巨�����ַ�ʽ���أ�
	// as��ͷ�巨����巨��������
	// ������Ϊ�յ�ʱ������Ϊ�յ�ʱ��
	// ������ĳ��ȣ����ĸ�����
	public void createSingleList(AnyType data) {
		// ��new��һ���µĽڵ�
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (theSize == 0 || firstNode == null) {
			firstNode = newNode;
			firstNode.next = null;
			theSize++;
		} else {
			// ����Ϊ��
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		}
	}

	/**
	 * idx�ǵڼ���������˼
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

	public Node<AnyType> getNodeByIndex(int indx) {// ��ȡ����λ�Ľ��Ԫ�أ�indx>=0
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
	 * ����������β�巨�� 1.Ҫ������һ���ڵ� 2.ֻ��һ���ڵ㣬
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

	public boolean addNode(int idex, AnyType data) {// ������λ��insert����data
		Node<AnyType> newNode = new Node<AnyType>(data);
		if (idex <= 0 || idex > theSize + 1) {
			System.out.println("Fail to Insert,indexoutofbounds");
			return false;
		}
		if (idex == 1 || firstNode.next == null) {// ֻ��һ��Ԫ��
			newNode.next = firstNode;
			firstNode = newNode;
			theSize++;
		} else {
			Node<AnyType> p = getNode(idex - 1);// �ڵ�idex�����insert,��Ҫ��ȡ��idex-1�����
			newNode.next = p.next;
			p.next = newNode;
			theSize++;
		}
		return true;
	}

	/**
	 * ���ϣ�add��ͷ�壬β�巨���Թ��ã�
	 */
	public boolean addInsert(int idex, AnyType data) {
		if (idex < 0 || idex > theSize) {
			throw new IndexOutOfBoundsException();
		}
		Node<AnyType> newNode = new Node<AnyType>(data);
		// ����Ϊ��
		// ��ͷ��insert,idex=0
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
	 * ���������� 1.�������Ϊ�գ���ʾʧ�� 2.����ǿգ���ͷ��ʼ����
	 */
	public void displayList() {
		if (theSize == 0 || firstNode == null) {
			System.out.println("����Ϊ�գ��޷���ӡ����Ԫ��");
			return;
		}
		// �ӵ�һ����㿪ʼ����
		Node<AnyType> p = firstNode;
		while (p != null) {// ��֪���������ٴΣ�������while; do-while��ѭ��������ٱ���һ��
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
