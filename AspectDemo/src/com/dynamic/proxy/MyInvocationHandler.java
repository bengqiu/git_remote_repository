package com.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理角色：实现InvocationHandler接口(JDK)
 * 
 * @author yzw
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj; // 目标类

	/**
	 * 构造函数
	 * 
	 */
	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("目标方法执行前打印...");
		// 执行目标 的方法
		Object result = method.invoke(obj, args);
		System.out.println("目标方法执行后打印...");

		return result;
	}

	/**
	 * 获取目标对象的代理对象
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), obj.getClass().getInterfaces(),
				this);
	}

}
