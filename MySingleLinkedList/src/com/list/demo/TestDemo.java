package com.list.demo;

import java.util.Scanner;

public class TestDemo {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s1 = "", s2 = "";
		System.out.println("�������ַ���:");
		while(!scanner.hasNext("q")){
			s1 = scanner.next();
		}
		System.out.println("�ַ���Ϊ��"+s1);
	}

}
