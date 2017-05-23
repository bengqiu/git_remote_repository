package com.proxy.demo;

/**
 * 真实角色
 * 实现接口，并完成实际工作
 * @author yzw
 *
 */
public class RealSubject extends Subject{
	@Override
	public void request() {
		System.out.println("from real subject! ");
	}
}
