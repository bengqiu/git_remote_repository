package com.dynamic.proxy;

/**
 * ��ʵ��ɫ��ʵ�ֳ����ɫ
 * @author yzw
 *
 */
public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("from real subject!");
	}

}
