package com.dynamic.proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void testProxy() {
		// 实例化真实角色
		Subject subject = new RealSubject();
		// 实例化InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(subject);
		// 根据目标对象生成代理对象
		Subject proxyObj = (Subject) invocationHandler.getProxy();
		proxyObj.request();
	}
}
