package com.algorithm.help;

/**
 * 
 * ���ߣ�JXY-�� JXY ʱ�䣺2017��11��18��-����8:39:44 ��ϵ��ʽ��18194214505 ��ǰ�ļ�����Helper.java
 * ���ļ���Ӧ�İ�����com.algorithm.help ����ǰ��������algorithm (�㷨�������߿�)
 * 
 * @since 1.0.0
 */
public class Helper {
	// ����ʱ���������
	private int[] arr;

	public Helper(int[] arr) {
		super();
		this.arr = arr;
	}

	// ����λ�ý�������
	public void swaper(int i, int j) {
		int value = arr[i];
		arr[i] = arr[j];
		arr[j] = value;
	}

	// ����ת��Ϊ�ַ������
	public String toStringArr() {
		String str = "";
		for (int i : arr) {
			str += i + ",";
		}
		// �����һ�����ය��ȥ��
		return str.substring(0, str.length() - 1);
	}

	public int[] getArr() {
		return arr;
	}
}
