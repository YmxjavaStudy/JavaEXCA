package com.java.ymx.Ecxe;

import java.util.Scanner;

public class Text04 {
	final static double PI = 3.1415926;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double S = PI * r * r;
		String h=new java.text.DecimalFormat("#.00000").format(S);
		//String result = String.format("%.5f", S);// ������λС��
		System.out.println("԰�İ뾶�ǣ�" + r);
		System.out.println("Բ������ǣ�" + h);
		//System.out.println("Բ������ǣ�" + result);
	}

}
