package com.dynamic.proxy;

/**
 * 真实角色：实现抽象角色
 * @author yzw
 *
 */
public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("from real subject!");
	}

}
