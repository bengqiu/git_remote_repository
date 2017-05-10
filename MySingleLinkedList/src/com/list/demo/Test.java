package com.list.demo;

public class Test {
	
	public int fib(int n){
		int cnt = 0;
		while(n>0){
			cnt++;
			n = n&(n-1);
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.fib(1000));
	} 

}
