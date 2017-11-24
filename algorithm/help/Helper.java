package com.algorithm.help;

/**
 * 
 * 作者：JXY-昱 JXY 时间：2017年11月18日-下午8:39:44 联系方式：18194214505 当前文件名：Helper.java
 * 该文件对应的包名：com.algorithm.help 　当前工程名：algorithm (算法辅助工具库)
 * 
 * @since 1.0.0
 */
public class Helper {
	// 排序时传入的数组
	private int[] arr;

	public Helper(int[] arr) {
		super();
		this.arr = arr;
	}

	// 数组位置交换方法
	public void swaper(int i, int j) {
		int value = arr[i];
		arr[i] = arr[j];
		arr[j] = value;
	}

	// 数组转换为字符串输出
	public String toStringArr() {
		String str = "";
		for (int i : arr) {
			str += i + ",";
		}
		// 将最后一个多余逗号去掉
		return str.substring(0, str.length() - 1);
	}

	public int[] getArr() {
		return arr;
	}
}
