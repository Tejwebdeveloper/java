package array;

import java.util.HashMap;
import java.util.Map;

public class Mapinterface{

	public record entry() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map <Integer,String> Map = new HashMap <Integer,String>();
        Map.put(2,"abc");
        Map.put(3,"xyz");
        Map.put(1,"gbf");
        System.out.println(Map.get(2));
	
	for(Map.Entry<Integer,String>entry : Map.entrySet())
	{
		System.out.println(entry.getValue());
	}

}
}
