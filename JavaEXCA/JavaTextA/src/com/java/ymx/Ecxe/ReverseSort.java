package com.java.ymx.Ecxe;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 20, 30, 40, 50 };
		ReverseSort sorter = new ReverseSort();
		sorter.sort(array);
	}

	private void sort(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("数组原有内容：");
		showArray(array);
		int temp;
		int len = array.length;
		for (int i = 0; i <= len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("数组反转后的数组值：");
		showArray(array);
	}

	private void showArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i : array) {
			System.out.print("\t" + i);
		}
		System.out.println();
	}

}
