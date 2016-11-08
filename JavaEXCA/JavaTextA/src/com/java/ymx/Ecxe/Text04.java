package com.java.ymx.Ecxe;

import java.util.Scanner;

public class Text04 {
	final static double PI = 3.1415926;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double S = PI * r * r;
		String h=new java.text.DecimalFormat("#.00000").format(S);
		//String result = String.format("%.5f", S);// 保留五位小数
		System.out.println("园的半径是：" + r);
		System.out.println("圆的面积是：" + h);
		//System.out.println("圆的面积是：" + result);
	}

}
