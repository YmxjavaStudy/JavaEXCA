package com.java.ymx.Ecxe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Writer;

public class Text03 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 读取文件
		File file = new File("D:" + File.separator + "fileDemo"
				+ File.separator + "Test" + File.separator + "test.txt");
		// 将内容写入文件
		Writer writer = new FileWriter(file, true);
		writer.write("这是一个java上机题的文件： \r\n");
		writer.write("一个正整数，他加上100后是一个完全平方数，再加上168后又是一个完全平方数，请问该数是多少？\r\n");
		writer.write("需要参数如下：通过程序读取本文件，解析下面的字符串得到需要的参数值 \r\n");
		writer.write("100#168#1000\r\n");
		writer.write("题目要求是：在此文档中使用程序写入解题思路，同时在源码中，尽可能多写注释，让人一眼看懂 \r\n");
		writer.write("将计算结果，最后再写入配置文件的尾部，有多个结果时换行输出，以方便阅读。\r\n");
		writer.write("\r\n");
		writer.write("解题思路：\r\n");
		writer.write("首先我们需要获取文件中的参数，所有参数都在第四行，所以我们可以用readline方法通过分隔符来读取文件中的参数\r\n");
		writer.write("将参数对a,b,c进行赋值，定义变量j，唯有正整数开方后再取1的余等于0，利用for循环和if判断，\r\n" +
				"当Math.sqrt((long) (j + a)) % 1 == 0； Math.sqrt((long) (j + b + a)) % 1 == 0两个条件同时成立，则j就是我们要取的值\r\n");
		writer.write("得到答案后，将答案转换成字符串重新写入文件\r\n");
		writer.write("\r\n");
		writer.write("得到的答案是：");
		writer.close();
		readAppointedLineNumber(file, 0);
	}

	// 构造一个读取文件指定行数的方法
	private static void readAppointedLineNumber(File file, int i)
			throws IOException {
		// 指定行数
		int lineNumber = 4;
		// 利用BufferReader读取文件
		BufferedReader readTxt = new BufferedReader(new FileReader(file));
		FileReader in = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(in);
		String s = "";
		int lines = 0;
		while (s != null) {
			lines++;
			// 按行读取文件内容
			s = reader.readLine();
			// 当读到指定行数即第四行时，按分隔符#读取该行转换为数组并赋值给numberArray
			if ((lines - lineNumber) == 0) {
				String[] numbersArray = s.split("#");
				// 将字符串类型转换为整形
				int a = (int) Integer.parseInt(numbersArray[0]);
				int b = (int) Integer.parseInt(numbersArray[1]);
				int c = (int) Integer.parseInt(numbersArray[2]);
				System.out.println("三个参数为：");
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
				// 定义该整数为j，唯有正整数开方后再取1的余等于0，当两个条件同时成立，则j就是我们要取的值
				String L;
				for (int j = 0; j <= c; j++) {
					if (Math.sqrt((long) (j + a)) % 1 == 0
							&& Math.sqrt((long) (j + b + a)) % 1 == 0) {
						System.out.println("该整数为：");
						System.out.println(j);
						// 将j转换成字符串，并写入文件
						L = (j + "");
						Writer writer = new FileWriter(file, true);
						String enString = "\r\n" + L;
						writer.write(enString);
						writer.close();
					}

				}

			}

		}
		System.exit(0);
	}

}
