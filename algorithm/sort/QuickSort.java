package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

/**
 * 
 * 作者：JXY-昱 JXY 时间：2017年11月19日-下午5:34:24 联系方式：18194214505 当前文件名：QuickSort.java
 * 该文件对应的包名：com.algorithm.sort 　当前工程名：algorithm (基本快速排序算法实现)
 * 
 * @since 1.0.0
 */
public class QuickSort extends Helper implements SortInterface {

	public QuickSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int[] arr = getArr();
		int len = arr.length;

		_quickSort(arr, 0, len - 1);
	}

	private void _quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int mid = _getBestPosition(arr, l, r);

		_quickSort(arr, l, mid - 1);
		_quickSort(arr, mid + 1, r);
	}

	private int _getBestPosition(int[] arr, int l, int r) {
		// 防止在大量有序数据的数组排序时出现栈溢出的情况
		int num = (int) ((r - l) * Math.random() + l);
		swaper(l, num);

		int value = arr[l];
		int i, j = l;
		for (i = l; i <= r; i += 1) {
			if (arr[i] < value) {
				j += 1;
				swaper(i, j);
			}
		}
		arr[l] = arr[j];
		arr[j] = value;
		// swaper(l, j);
		return j;
	}

	@Override
	public void printArrString() {
		// TODO Auto-generated method stub
		System.out.println(toStringArr());
	}
}
