package com.conditionalstatement;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am indian";
		StringBuffer newstr = new StringBuffer(str);
		
       for(int i=0;i<str.length();i++)
       {
    	   if(Character.isLowerCase(str.charAt(i)))
    	   {
    		   newstr.setCharAt(i, Character.toUpperCase(str.charAt(i))) ;
    	   }
       }

       System.out.println("String after case conversion : " + newstr);  
	}

}
