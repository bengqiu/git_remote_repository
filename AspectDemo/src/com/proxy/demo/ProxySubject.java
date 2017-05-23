package com.proxy.demo;

/**
 * �����ɫ
 * 
 * @author yzw
 *
 */
public class ProxySubject extends Subject {
	// ��������������ʵ���������
	private RealSubject realSubject = null;

	@Override
	public void request() {
		preRequest();// ����ʵ��ɫ����֮ǰ���ӵĲ���

		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		realSubject.request(); // ��ʵ��ɫ����

		postRequest();// ����ʵ��ɫ����֮�󸽼ӵĲ���
	}

	private void preRequest() {
		System.out.println("Pre Request.");
	}

	private void postRequest() {
		System.out.println("Post Request");
	}

}
