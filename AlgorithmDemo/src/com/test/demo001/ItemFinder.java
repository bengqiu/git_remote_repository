package com.test.demo001;

public class ItemFinder {
	/**
	 * 二维数组中的查找
	 * 1.每一行从左向右递增
	 * 2.每一列从上到下递增
	 * 3.查找数组中是否存在某个数
	 * 思路：从右上角或左下角开始，可以一次去除一行或一列
	 */
	public static boolean find(int array[][],int number){
		boolean flag = false;
		int rows = array.length; //行数
		int cols = array[0].length; //列数
		int col = cols-1;
		int row = 0; //col,row初始位置为右上角
		while(row<rows&&col>=0){
			//--1.刚好能找到
			if(array[row][col] == number){
				flag = true;
				break; //跳出循环
			}
			//--2.比右上角的值小
			else if(array[row][col]>number){
				col--; //列变小
			}
			//--3.比右上角的值大
			else{
				row++; //行变大
			}
		}
		return flag; 
	}
	public static void main(String[] args) {
		
	}

}
