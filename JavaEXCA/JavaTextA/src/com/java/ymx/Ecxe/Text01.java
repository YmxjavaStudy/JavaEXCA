package com.java.ymx.Ecxe;
public class Text01 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int  i, j, k, sum = 0;
		for (i = 0; i <= 20; i++) {
			/*
			 * i+k+j=100;5*i+3*j+k=100 同时取k值；
			 * 再合并取j值，得出j的用i的表达式
			 */
			j = (100 - 7 * i) / 4;
			k = 100 - i - j;
			sum = i + j + k;
			// 为保证j为正整数，列出以下条件
			if (sum == 100 && j >= 0 && k >= 0 && (i % 4 == 0)) {
				System.out.println("公鸡的数量：" + i);
				System.out.println("母鸡的数量：" + j);
				System.out.println("小鸡的数量：" + k);
				System.out.println(sum);
			}

		}

	}

}
