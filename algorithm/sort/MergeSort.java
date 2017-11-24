package com.algorithm.sort;

import java.util.ArrayList;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class MergeSort extends Helper implements SortInterface {

	public MergeSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int[] arr = getArr();
		int len = arr.length;
		
		_mergeSort(arr, 0, len - 1);
		
	}

	private void _mergeSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int mid = (l + r) / 2;
		_mergeSort(arr, l, mid);
		_mergeSort(arr, mid + 1, r);

		_merge(arr, l, mid, r);
	}

	private void _merge(int[] arr, int l, int mid, int r) {
//		int[] buffer = new int[r - l+1];
		ArrayList<Integer> bufArrayList = new ArrayList<>();
		// 将传入指定范围的数组部分复制到bufArrayList数组中
		for (int i = l; i <= r; i += 1) {
			bufArrayList.add(arr[i]);
		}
		
		int i = l, j = mid + 1;
		for (int t = l; t <= r; t += 1) {
			if (i > mid) {
				arr[t] = bufArrayList.get(j-l);
                j += 1;
            } else if (j > r) {
            	arr[t] = bufArrayList.get(i-l);
                i += 1;
            } else if (bufArrayList.get(i-l) > bufArrayList.get(j-l)) {
                arr[t] =  bufArrayList.get(j-l);
                j += 1;
            } else {
                arr[t] = bufArrayList.get(i-l);
                i += 1;
            }
		}
		
	}

	@Override
	public void printArrString() {
		// TODO Auto-generated method stub
		System.out.println(toStringArr());
	}

//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -20, -200, -2000,-20000, -2,-1 ,200};
//		MergeSort mergeSort = new MergeSort(arr);
//		mergeSort.sort();
//		mergeSort.printArrString();
//
//	}
}
