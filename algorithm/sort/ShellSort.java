package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class ShellSort extends Helper implements SortInterface {
	
	public ShellSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// 希尔排序算法实现
	@Override
	public void sort() {
		/**
		 * 1. 希尔算法实际上是将一个较长的数组分割成多个虚拟数组，然后再使用插入排序算法对分割
		 * 好的各个虚拟数组进行排序（插入排序对于小数组以及有序性较高的数组排序具有高效性）。
		 * 2. g就是各个虚拟数组中元素之间的间隔，通过不断缩小虚拟数组元素之间的间隔，最终通过
		 * 插入排序高效的完成较长数组的排序。（实际上是不断提高数组的有序性）
		 */
		int[] arr = getArr();
		int len = arr.length;
		int g = len / 2;
		int value, i, j;
		while (g >= 1) {
			for (i = g; i < len; i += 1) {
				value = arr[i];
				for (j = i; j >= g && arr[j - g] > value; j -= g) {
					arr[j] = arr[j - g];
				}
				arr[j] = value;
			}
			g /= 2;
		}

	}

	@Override
	public void printArrString() {
		// TODO Auto-generated method stub
		System.out.println(toStringArr());
	}
}
