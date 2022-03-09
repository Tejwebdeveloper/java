package array;

import java.util.ArrayList;
import java.util.Collections;

public class Main_bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bean_class bean = new Bean_class ("red","zark",12000);
       Bean_class bean1 = new Bean_class ("black","arroww",10000);
       Bean_class bean2 = new Bean_class ("green","gue",2000);
       
       ArrayList<Bean_class>al = new ArrayList<Bean_class>();
       al.add(bean);
       al.add(bean1);
       al.add(bean2);
        Collections.sort(al);
        for(Bean_class obj : al)
        {
        	System.out.println("brand::" + obj.getBrand());
        	System.out.println("color::" + obj.getColor());
        	System.out.println("brand::" + obj.getPrice());
        	System.out.println(" "+obj);
        }
       
	}

}
