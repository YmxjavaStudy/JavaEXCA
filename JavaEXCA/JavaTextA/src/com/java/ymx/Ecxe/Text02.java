package com.java.ymx.Ecxe;

public class Text02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double i,j = 0,sum = 0;

		for(i=0;i<=20;i++){
			for(j=0;j<=33;j++){
				
					sum=(i*5)+(j*3)+((100-i-j)*1/3);
					if((i+j+(100-i-j)*1/3)==100&&sum==100){
						
						System.out.println("������������"+i);
						System.out.println("ĸ����������"+j);
						System.out.println("С����������");
						System.out.println(sum);}
				
				
			}
			
		

		}
		
	}

}
