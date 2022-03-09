package array;

import java.util.Arrays;

public class Deletearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {25,16,14,56,36,77,29};
        System.out.println("original array:"+ Arrays.toString(a));
        int removeIndex = 1;
        for(int i=removeIndex;i<a.length-1;i++)
        {
        	a[i] = a[i+1];
        	
        }
        System.out.println("after removing the third element:" + Arrays.toString(a));
	}

}
