package java_chobo.ch06.teacher;

import java_chobo.ch06.teacher.dto.Tv;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t1 = null;		//선언
//		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		
		t1 = new Tv();	//Tv인스턴스화 
		
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);	//t1.toString() 호출
		
		t1.color = "red";
		t1.isPower = true;
		t1.channel = 11;
		
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);
		
		t1.setPower();
		t1.chanelUp();
		t1.chanelUp();
		t1.chanelDown();
		
		System.out.printf("%s %b %d%n", t1.color, t1.isPower, t1.channel);
		System.out.println(t1);
		
		Object o1 = new Tv();
		System.out.println(o1.toString());
		
	}

}
