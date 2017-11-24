package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;
/**
 * 作者：JXY-昱  JXY
 * 时间：2017年11月18日-下午8:45:06
 * 联系方式：18194214505
 * 当前文件名：BubbleSort.java
 * 该文件对应的包名：com.algorithm.sort
 *　当前工程名：algorithm
 * (添加对于该对象的一段描述)
 * @since 1.0.0
 */
public class BubbleSort extends Helper implements SortInterface{
	
	public BubbleSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// 排序算法
	public void sort() {
		int[] arr = getArr(); 
		int i, j;
		int len = arr.length;
		for (i = 0; i < len - 1; i += 1) {
			for (j = 0; j < len-i-1; j += 1) {
				if (arr[j] > arr[j + 1]) {
					swaper(j, j + 1);
				}
			}
		}
	}

	// 打印排好序的数组
	public void printArrString() {
		System.out.println(toStringArr());
	}
}
