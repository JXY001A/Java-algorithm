package com.algorithm.sort;

import com.algorithm.help.Helper;
import com.algorithm.help.SortInterface;

public class InsertSortDev extends Helper implements SortInterface{

	public InsertSortDev(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int[] arr = getArr();
	    int len = arr.length;
	    int  value,j;
	    for(int i=1;i<len;i+=1) {
	    	value = arr[i];
	    	for ( j = i; j > 0 && arr[j-1] > value; j-=1) {
				arr[j] = arr[j-1];
			}
	    	arr[j] = value;
	    }
	}

	@Override
	public void printArrString() {
		// TODO Auto-generated method stub
		System.out.println(toStringArr());
	}

}
