package java_chobo.ch06.teacher;

import java_chobo.ch06.teacher.dto.Data;

class SubData extends Data{

	public SubData() {
		super();
		x = 10;
	}
	
}

public class Ex6_7 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("main() : x = " + d.x);
		
		Data d2 = new Data();
		d2.x = 20;
		System.out.println("main() : x = " + d2.x);
		change(d2);
		System.out.println("main() : x = " + d2.x);
		
		System.out.println();
		Data d3 = new Data();
		d3.x = 40;
		
		Data d4 = copy(d3);
		System.out.println("main() d4.x = " + d4.x);
	}

	private static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		return temp;
	}

	private static void change(Data d) {
		d.x = 30;
		System.out.println("change() : x = " + d.x);
	}

	private static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}