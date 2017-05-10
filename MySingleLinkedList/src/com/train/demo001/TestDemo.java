package com.train.demo001;

public class TestDemo {
	MySinglelist<String> msl = new MySinglelist<String>();

	/**
	 * 使用头插法创建单链表
	 * 
	 * @param str
	 * @return
	 */
	private boolean createListByHeadInsert(String str) {
		for (int i = 0; i < str.length(); i++) {
			msl.createSingleList(str.valueOf(str.charAt(i)));
		}
		return true;
	}

	private boolean createListByTailInsert(String str) {
		for (int i = 0; i < str.length(); i++) {
			msl.createSListByTailInsert(str.valueOf(str.charAt(i)));
		}
		return true;
	}

	private boolean addNodeByIndex(int idx, String data) {
		return msl.addNode(idx, data);
	}

	private void showList() {
		msl.displayList();
	}

	private int getSizeOfList() {
		return msl.getSize();
	}

	/**
	 * 整合之后的，头插法(逆序创建)+尾插法
	 */
	private void createList(String str, boolean isHeadInsert) {
		for (int i = 0; i < str.length(); i++) {
			if (isHeadInsert) {
				msl.addInsert(0, String.valueOf(str.charAt(i)));
			} else if(isHeadInsert==false){
				msl.addInsert(getSizeOfList(), String.valueOf(str.charAt(i)));
			}
		}
	}

	public static void main(String args[]) {
		TestDemo td = new TestDemo();
		String str = "123456";
		// 逆创建（头插法）
		td.createList(str, false);
		td.showList();

		// 尾插法
//		td = new TestDemo();
//		td.createList(str, true);
//		td.showList();
	}
}
