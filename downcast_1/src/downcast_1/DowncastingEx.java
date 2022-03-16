package downcast_1;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class DowncastingEx {
	public static void main(String[] args) {
		Person p = new Student("¿Ã¿ÁπÆ");
		Student s;
		s = (Student)p;
		
		s.grade = "A";
		System.out.println(s.name + " " + s.grade);
		
	}
}
