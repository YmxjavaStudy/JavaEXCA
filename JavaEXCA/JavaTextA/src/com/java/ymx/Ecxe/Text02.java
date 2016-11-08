package com.java.ymx.Ecxe;

public class Text02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double i,j = 0,sum = 0;

		for(i=0;i<=20;i++){
			for(j=0;j<=33;j++){
				
					sum=(i*5)+(j*3)+((100-i-j)*1/3);
					if((i+j+(100-i-j)*1/3)==100&&sum==100){
						
						System.out.println("公鸡的数量："+i);
						System.out.println("母鸡的数量："+j);
						System.out.println("小鸡的数量：");
						System.out.println(sum);}
				
				
			}
			
		

		}
		
	}

}
