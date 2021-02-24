package java_chobo.ch07.exam6;

public class Person {
	String name;
	int age;
	String juso;

	@Override
	public String toString() {
		return String.format("이름 : %s%n나이 : %s%n주소 : %s", name, age, juso);
	}

}
