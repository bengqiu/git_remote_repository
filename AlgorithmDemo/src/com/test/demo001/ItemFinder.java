package com.test.demo001;

public class ItemFinder {
	/**
	 * ��ά�����еĲ���
	 * 1.ÿһ�д������ҵ���
	 * 2.ÿһ�д��ϵ��µ���
	 * 3.�����������Ƿ����ĳ����
	 * ˼·�������Ͻǻ����½ǿ�ʼ������һ��ȥ��һ�л�һ��
	 */
	public static boolean find(int array[][],int number){
		boolean flag = false;
		int rows = array.length; //����
		int cols = array[0].length; //����
		int col = cols-1;
		int row = 0; //col,row��ʼλ��Ϊ���Ͻ�
		while(row<rows&&col>=0){
			//--1.�պ����ҵ�
			if(array[row][col] == number){
				flag = true;
				break; //����ѭ��
			}
			//--2.�����Ͻǵ�ֵС
			else if(array[row][col]>number){
				col--; //�б�С
			}
			//--3.�����Ͻǵ�ֵ��
			else{
				row++; //�б��
			}
		}
		return flag; 
	}
	public static void main(String[] args) {
		
	}

}
