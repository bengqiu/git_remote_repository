package com.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �����ɫ��ʵ��InvocationHandler�ӿ�(JDK)
 * 
 * @author yzw
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj; // Ŀ����

	/**
	 * ���캯��
	 * 
	 */
	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ŀ�귽��ִ��ǰ��ӡ...");
		// ִ��Ŀ�� �ķ���
		Object result = method.invoke(obj, args);
		System.out.println("Ŀ�귽��ִ�к��ӡ...");

		return result;
	}

	/**
	 * ��ȡĿ�����Ĵ������
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), obj.getClass().getInterfaces(),
				this);
	}

}
