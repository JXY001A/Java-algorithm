package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class InsertSort extends Helper implements SortInterface {

	public InsertSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// �����㷨ʵ��
	@Override
	public void sort() {
		int[] arr = getArr();
		int len = arr.length;
		for (int i = 1; i < len; i += 1) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j -= 1) {
				swaper(j, j - 1);
			}
		}
	}

	// ��ӡ�ź��������
	@Override
	public void printArrString() {
		System.out.println(toStringArr());
	}

}
