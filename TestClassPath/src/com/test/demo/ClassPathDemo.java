package com.test.demo;

import java.io.UnsupportedEncodingException;

public class ClassPathDemo {
	private static String getClassPath(Class clazz){
		String path = clazz.getClassLoader().getResource("").getPath();
		try {
			return java.net.URLDecoder.decode(path,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String args[]){
		String str = new String("Hello mmm");
		String path = getClassPath(ClassPathDemo.class);
		System.out.println(path);
		
	}
}
