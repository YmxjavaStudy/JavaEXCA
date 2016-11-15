package com.java.ymx.Ecxe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileText2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("D:\\word.txt");
FileOutputStream outputStream=new FileOutputStream(file);
byte buy[]="java".getBytes();
outputStream.write(buy);
outputStream.close();}
}
/*FileInputStream inputStream=new FileInputStream(file);
byte byt[]=new byte[1024];
int len=inputStream.read(byt);
System.out.println(new String(byt, 0, len));
inputStream.close();
	}*/


