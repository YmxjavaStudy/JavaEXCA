package com.java.ymx.Ecxe;

public class Text05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum = 0;
		// ��1-15��ֵ������
		int[] arr = new int[15];
		for (int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
			System.out.println(arr[i - 1]);
		}
		// ��arr������ȡ����Ԫ��
		for (int j = 1; j <= 6; j++) {
			int arrrandom = (int) (Math.random() * 15);// ���ȡ1-15֮���������
			sum = sum + 2 * arr[arrrandom];// ��2-32֮������6��ż��֮��
		}
		System.out.println(sum);
	}

}
