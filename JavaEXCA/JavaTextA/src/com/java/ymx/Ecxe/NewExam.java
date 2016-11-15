package com.java.ymx.Ecxe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewExam {

	private int range;

	private int a;

	/**
	 * @return the range
	 */
	public int getrange() {
		return range;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setMax(int range) {
		this.range = range;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	public NewExam(int range, int a) {
		this.range = range;
		this.a = a;
	}

	private void count() throws IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();

		double sum = 0;
		if (a > 0 && range > 0) {
			for (int i = 0; i <= range; i++) {
				if (i % a == 0) {
					list.add(i);
				}
			}
			System.out.println("这个集合为：");
			System.out.println(list);
			System.out.println("这个集合共含有" + list.size() + "个数");
			for (int j = 0; j < list.size(); j++) {
				sum = list.get(j) + sum;
			}
			System.out.println("集合中最小值是：");
			System.out.println(list.get(0));
			System.out.println("集合中最大值是：");
			System.out.println(list.get(list.size() - 1));
			System.out.println("集合中所有值的和是：");
			System.out.println(sum);
			System.out.println("集合中所有数的平均值是：");
			System.out.println(sum / list.size());
			File file = new File("D:\\Exam.txt");
			Writer writer = new FileWriter(file);
			// Writer writer=new FileWriter(file, true);
			writer.write("1. 计算XX以内所有能被7整除的数的和以及平均数。\r\n");
			writer.write("要求：\r\n");
			writer.write("A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档\r\n");
			writer.write("B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！\r\n");
			writer.write("C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n");
			writer.write("解题思路：\r\n");
			writer.write("1. 首先能够被7整除的数，必定取7的余为0，所以利用取余方法加上for循环可以得到所有数。\r\n");
			writer.write("2. 为了让整个程序更具灵活性，我们可以用两个变量来代替7和取余的最大范围。\r\n");
			writer.write("3. 计算XX以内所有能被7整除的数的和以及平均数。\r\n");
			writer.write("4. 定义一个成员方法进行计算并输出所需要的数值。\r\n");
			writer.write("5. 在主方法里调用该方法。\r\n");
			writer.write("这个集合为:\r\n");
			writer.write(list + "\r\n");
			writer.write("这个集合的个数为:\r\n");
			writer.write(list.size() + "\r\n");
			writer.write("集合中最大值为:\r\n");
			writer.write(list.get(list.size() - 1) + "\r\n");
			writer.write("集合中最小值为:\r\n");
			writer.write(list.get(0) + "\r\n");
			writer.write("集合中所有元素的和为:\r\n");
			writer.write(sum + "\r\n");
			writer.write("集合中所有元素的平均值为:\r\n");
			writer.write(sum / list.size() + "\r\n");
			writer.flush();
			writer.close();

		} else {
			System.out.println("输入参数有误！");
		}
	}

	public static void main(String[] args)
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");

		int in1 = input.nextInt();
		System.out.println("请输入整数型最大范围：");
		int in2 = input.nextInt();
		NewExam pExam = new NewExam(in1, in2);
		pExam.range = in2;
		pExam.a = in1;
		pExam.count();

		/*
		 * Class<?> class1 = Class.forName("com.java.ymx.Ecxe.NewExam"); NewExam
		 * object=(NewExam) class1.newInstance(); Method method =
		 * class1.getMethod("count()"); method.invoke(object);
		 */
	}

}
