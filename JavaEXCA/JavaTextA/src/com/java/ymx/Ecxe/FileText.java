package com.java.ymx.Ecxe;

import java.io.File;

public class FileText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file=new File("D:\\word.txt");
if(file.exists()){
	file.delete();
	System.out.println("文件已删除");
}else{
	try{
		file.createNewFile();
		System.out.println("文件已创建");
	}catch(Exception e){
		e.printStackTrace();
	}
}
	}

}
