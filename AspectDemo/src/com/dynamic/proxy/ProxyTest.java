package com.dynamic.proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void testProxy() {
		// ʵ������ʵ��ɫ
		Subject subject = new RealSubject();
		// ʵ����InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(subject);
		// ����Ŀ��������ɴ������
		Subject proxyObj = (Subject) invocationHandler.getProxy();
		proxyObj.request();
	}
}
