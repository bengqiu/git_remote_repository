package com.list.demo;

import java.util.Scanner;

public class TestDemo {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String s1 = "", s2 = "";
		System.out.println("ÇëÊäÈë×Ö·û´®:");
		while(!scanner.hasNext("q")){
			s1 = scanner.next();
		}
		System.out.println("×Ö·û´®Îª£º"+s1);
	}

}
