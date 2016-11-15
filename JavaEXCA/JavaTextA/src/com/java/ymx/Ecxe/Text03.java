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

		// ��ȡ�ļ�
		
				File file = new File("D:" + File.separator + "fileDemo"
				+ File.separator + "Test" + File.separator + "test.txt");
				
		// ������д���ļ�
		Writer writer = new FileWriter(file, true);
		writer.write("����һ��java�ϻ�����ļ��� \r\n");
		writer.write("һ����������������100����һ����ȫƽ�������ټ���168������һ����ȫƽ���������ʸ����Ƕ��٣�\r\n");
		writer.write("��Ҫ�������£�ͨ�������ȡ���ļ�������������ַ����õ���Ҫ�Ĳ���ֵ \r\n");
		writer.write("100#168#1000\r\n");
		writer.write("��ĿҪ���ǣ��ڴ��ĵ���ʹ�ó���д�����˼·��ͬʱ��Դ���У������ܶ�дע�ͣ�����һ�ۿ��� \r\n");
		writer.write("���������������д�������ļ���β�����ж�����ʱ����������Է����Ķ���\r\n");
		writer.write("\r\n");
		writer.write("����˼·��\r\n");
		writer.write("����������Ҫ��ȡ�ļ��еĲ��������в������ڵ����У��������ǿ�����readline����ͨ���ָ�������ȡ�ļ��еĲ���\r\n");
		writer.write("��������a,b,c���и�ֵ���������j��Ψ����������������ȡ1�������0������forѭ����if�жϣ�\r\n" +
				"��Math.sqrt((long) (j + a)) % 1 == 0�� Math.sqrt((long) (j + b + a)) % 1 == 0��������ͬʱ��������j��������Ҫȡ��ֵ\r\n");
		writer.write("�õ��𰸺󣬽���ת�����ַ�������д���ļ�\r\n");
		writer.write("\r\n");
		writer.write("�õ��Ĵ��ǣ�");
		writer.close();
		readAppointedLineNumber(file, 0);
	}

	// ����һ����ȡ�ļ�ָ�������ķ���
	private static void readAppointedLineNumber(File file, int i)
			throws IOException {
		// ָ������
		int lineNumber = 4;
		// ����BufferReader��ȡ�ļ�
		BufferedReader readTxt = new BufferedReader(new FileReader(file));
		FileReader in = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(in);
		String s = "";
		int lines = 0;
		while (s != null) {
			lines++;
			// ���ж�ȡ�ļ�����
			s = reader.readLine();
			// ������ָ��������������ʱ�����ָ���#��ȡ����ת��Ϊ���鲢��ֵ��numberArray
			if ((lines - lineNumber) == 0) {
				String[] numbersArray = s.split("#");
				// ���ַ�������ת��Ϊ����
				int a = (int) Integer.parseInt(numbersArray[0]);
				int b = (int) Integer.parseInt(numbersArray[1]);
				int c = (int) Integer.parseInt(numbersArray[2]);
				System.out.println("��������Ϊ��");
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
				// ���������Ϊj��Ψ����������������ȡ1�������0������������ͬʱ��������j��������Ҫȡ��ֵ
				String L;
				for (int j = 0; j <= c; j++) {
					if (Math.sqrt((long) (j + a)) % 1 == 0
							&& Math.sqrt((long) (j + b + a)) % 1 == 0) {
						System.out.println("������Ϊ��");
						System.out.println(j);
						// ��jת�����ַ�������д���ļ�
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
