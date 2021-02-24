package java_chobo.ch06.teacher.test;

public class MyMath {
	int first;
	int second;

	public MyMath(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public int add() {
		return first + second;
	}
	
	public int sub() {
		return first - second;
	}
	
	public int mul() {
		return first * second;
	}

	public double div() {
		return first / second;
	}
}
