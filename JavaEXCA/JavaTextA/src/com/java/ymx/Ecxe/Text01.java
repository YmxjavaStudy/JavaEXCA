package com.java.ymx.Ecxe;
public class Text01 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int  i, j, k, sum = 0;
		for (i = 0; i <= 20; i++) {
			/*
			 * i+k+j=100;5*i+3*j+k=100 ͬʱȡkֵ��
			 * �ٺϲ�ȡjֵ���ó�j����i�ı��ʽ
			 */
			j = (100 - 7 * i) / 4;
			k = 100 - i - j;
			sum = i + j + k;
			// Ϊ��֤jΪ���������г���������
			if (sum == 100 && j >= 0 && k >= 0 && (i % 4 == 0)) {
				System.out.println("������������" + i);
				System.out.println("ĸ����������" + j);
				System.out.println("С����������" + k);
				System.out.println(sum);
			}

		}

	}

}
