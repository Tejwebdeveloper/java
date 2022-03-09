
public class Useofthis {
	String name;
	public Useofthis(String name) {
		this.name=name;
	}
    public Useofthis() {
    	System.out.println("Default");
    }
    public void show() {
    	System.out.println(name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Useofthis obj = new Useofthis("Teju");
         obj.show();
	
	    Useofthis obj1 = new Useofthis("chinnu");
	    obj1.show();
	    
	    	
         Useofthis obj2 = new Useofthis();
         obj2.show();
}
}
