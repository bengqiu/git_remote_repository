package com.proxy.demo;

/**
 * ��ʵ��ɫ
 * ʵ�ֽӿڣ������ʵ�ʹ���
 * @author yzw
 *
 */
public class RealSubject extends Subject{
	@Override
	public void request() {
		System.out.println("from real subject! ");
	}
}
