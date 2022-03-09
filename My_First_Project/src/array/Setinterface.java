package array;

import java.util.HashSet;
import java.util.Set;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Double>set = new HashSet<Double>();
        set.add(2.4);
        set.add(3.6);
        set.add(2.4);
        set.add(9.8);
        set.add(6.7);
        set.add(8.8);
        
        for(double d:set)
        {
        	System.out.println(d);
        }
	}

}
