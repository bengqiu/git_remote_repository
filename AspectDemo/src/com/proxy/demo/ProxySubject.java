package com.proxy.demo;

/**
 * 代理角色
 * 
 * @author yzw
 *
 */
public class ProxySubject extends Subject {
	// 代理对象包含对真实对象的引用
	private RealSubject realSubject = null;

	@Override
	public void request() {
		preRequest();// 在真实角色操作之前附加的操作

		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		realSubject.request(); // 真实角色操作

		postRequest();// 在真实角色操作之后附加的操作
	}

	private void preRequest() {
		System.out.println("Pre Request.");
	}

	private void postRequest() {
		System.out.println("Post Request");
	}

}
