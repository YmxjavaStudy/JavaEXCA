package com.java.ymx.Ecxe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection<String> list=new ArrayList<String>();
list.add("a");
list.add("b");
list.add("c");
Iterator<String> iterator=list.iterator();
while(iterator.hasNext()){
	//String str=(String)iterator.next();
	System.out.println(iterator.next());
}
	}

}
