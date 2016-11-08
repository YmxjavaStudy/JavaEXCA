package com.java.ymx.Ecxe;

public class Text05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = 0;
		// 将1-15赋值给数组
		int[] arr = new int[15];
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
			System.out.println(arr[i - 1]);
		}
		// 从arr数组中取六个元素
		for (int j = 1; j <= 6; j++) {
			int arrrandom = (int) (Math.random() * 15);// 随机取1-15之间的正整数
			sum = sum + 2 * arr[arrrandom];// 求2-32之间任意6个偶数之和
		}
		System.out.println(sum);
	}

}
