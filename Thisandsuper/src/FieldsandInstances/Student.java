package FieldsandInstances;
//1. Print the fields/instance members of the current class using this and without using object
//3. Call constructor of the current class using this()
//4. Call argument constructor of current class using this()
public class Student {
	String name;
	String course;
	int age;

	public Student() {
		super();
	}

	public Student(String name, String course, int age) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public static void main(String[] args) {
		Student s = new Student("sainatha", "java", 23);
		System.out.println("Name :"+s.name);
		System.out.println("course :"+s.course);
		System.out.println("age :"+s.age);
	}
}
