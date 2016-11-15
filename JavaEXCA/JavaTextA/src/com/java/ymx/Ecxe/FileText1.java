package com.java.ymx.Ecxe;

import java.io.File;

public class FileText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Word.txt");
		if (file.exists()) {
			String name = file.getName();
			Long length = file.length();
			System.out.println(name);
			System.out.println(length);
		} else {
			System.out.println("文件不存在");
		}
	}

}
