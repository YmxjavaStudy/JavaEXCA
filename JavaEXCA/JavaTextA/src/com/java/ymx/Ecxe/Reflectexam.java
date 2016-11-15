package com.java.ymx.Ecxe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflectexam extends Thread {
	public void run() {
		try {
			Class<?> class1 = NewExam1.class;
			NewExam1 newExam1 = (NewExam1) class1.newInstance();
			Method method = class1.getMethod("count");// 获取newExam的count方法
			method.invoke(newExam1);// 唤醒该方法
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		Reflectexam reflect = new Reflectexam();
		reflect.start();

	}

}
