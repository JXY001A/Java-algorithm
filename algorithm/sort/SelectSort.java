package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class SelectSort extends Helper implements SortInterface{
	

	public SelectSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// ѡ�������㷨ʵ��
	public void sort() {
		int[] arr = getArr();
		int minIndex;
		int len = arr.length;
		for (int i = 0; i < len; i += 1) {
			minIndex = i;
			for (int j = i; j < len - 1; j += 1) {
				if (arr[minIndex] > arr[j + 1]) {
					minIndex = j + 1;
				}
			}
			swaper(minIndex, i);
		}
	}

	// ��ӡ�ź��������
	public void printArrString() {
		// toStringArr�����̳��븸��Helper��
		System.out.println(toStringArr());
	}
}
