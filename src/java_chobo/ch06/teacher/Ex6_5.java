package java_chobo.ch06.teacher;

class Variable{
	int iv;				//인스턴스 변수
	static int CV;		//클래스 변수
	
	void method() {
		int lv = 0;		// { } 안에 선언한 변수 -> 지역변수
	}
}

public class Ex6_5 {

	public static void main(String[] args) {
		Variable.CV = 10;
		System.out.println("Variable.CV = " + Variable.CV);
		
		Variable v1 = new Variable();
		v1.iv = 5;
		System.out.println("iv " + v1.iv);
		System.out.println("CV " + Variable.CV);
		
		Variable v2 = new Variable();
		v2.iv = 7;
		System.out.println("iv " + v2.iv);
		System.out.println("CV " + Variable.CV);
		
		Variable.CV = 20;
		System.out.println("CV " + v1.CV);
		System.out.println("CV " + Variable.CV);
	}

}









