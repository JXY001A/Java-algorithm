package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;
/**
 * ���ߣ�JXY-��  JXY
 * ʱ�䣺2017��11��18��-����8:45:06
 * ��ϵ��ʽ��18194214505
 * ��ǰ�ļ�����BubbleSort.java
 * ���ļ���Ӧ�İ�����com.algorithm.sort
 *����ǰ��������algorithm
 * (��Ӷ��ڸö����һ������)
 * @since 1.0.0
 */
public class BubbleSort extends Helper implements SortInterface{
	
	public BubbleSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// �����㷨
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

	// ��ӡ�ź��������
	public void printArrString() {
		System.out.println(toStringArr());
	}
}
