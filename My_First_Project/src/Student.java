

public class Student {
	int rollno;
	String name;
	String college = "ITS";
	Student(int r,String n){
		rollno = r;
		name = n;
	}
	void display () 
	
	{
		System.out.println(rollno + " " + name + " "+ college);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student(111,"tej");
     Student s2 = new Student(112,"chin");
     s1.display();
     s2.display();
	}

}
