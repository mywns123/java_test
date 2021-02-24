package java_chobo.ch07.exam1234;

public class Regular extends Employee {

	public Regular(String name, int age, String juso, String title) {
		super(name, age, juso, title);
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printinfo() {
		System.out.println("정규직" + salary);
	}

}
