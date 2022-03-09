package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listinterface {

	private static final String get = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List <Integer> arrL = new ArrayList <Integer>();
       ArrayList <Integer> arrL1 = new ArrayList <Integer>();
       
       arrL1.add(1);
       arrL1.add(45);
       arrL1.add(50);
       
       arrL.add(123);
       arrL.add(123);
       arrL.add(123);
        
      arrL.addAll(arrL1);
      Collections.sort(arrL);
       
    	    method();
    	   System.out.println("for is running");
    	   for(int i=0;i<arrL.size(); i++)
    	   {
    		   System.out.println(arrL.get(i));
    	   }
    	   System.out.println("for each is running");
    	   for(Integer x:arrL) {
        	   System.out.println(x);
        	   System.out.println(arrL1);
    		   
    	   }
       
       
	}

	private static void method() {
		// TODO Auto-generated method stub
	}
}
