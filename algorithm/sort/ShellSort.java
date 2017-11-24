package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class ShellSort extends Helper implements SortInterface {
	
	public ShellSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	// ϣ�������㷨ʵ��
	@Override
	public void sort() {
		/**
		 * 1. ϣ���㷨ʵ�����ǽ�һ���ϳ�������ָ�ɶ���������飬Ȼ����ʹ�ò��������㷨�Էָ�
		 * �õĸ�����������������򣨲����������С�����Լ������Խϸߵ�����������и�Ч�ԣ���
		 * 2. g���Ǹ�������������Ԫ��֮��ļ����ͨ��������С��������Ԫ��֮��ļ��������ͨ��
		 * ���������Ч����ɽϳ���������򡣣�ʵ�����ǲ����������������ԣ�
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
