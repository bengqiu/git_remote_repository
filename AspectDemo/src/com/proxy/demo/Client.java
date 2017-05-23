package com.proxy.demo;

public class Client {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.request();
	}
}
