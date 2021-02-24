package java_chobo.ch07.exam1234;

public class Employee {

	String name;
	int age;
	String juso;
	String title;
	int salary;

	public Employee(String name, int age, String juso, String title) {
		this.name = name;
		this.age = age;
		this.juso = juso;
		this.title = title;
	}

	public void printinfo() {
		System.out.printf("%s, %s, %s, %s", name, age, juso, title);
	}

	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setTime(int i) {
		// TODO Auto-generated method stub
		
	}

}
