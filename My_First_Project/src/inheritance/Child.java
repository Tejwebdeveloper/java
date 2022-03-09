package inheritance;

public class Child extends Parent1 {
private String name;

public Child (int x,int y,String name) {
super(x,y);
this.name=name;
}
public void show() {
	putData();
	System.out.println("the name is" +name);
}
}
