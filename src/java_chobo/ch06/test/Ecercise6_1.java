package java_chobo.ch06.test;

public class Ecercise6_1 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(4,2);
		
		System.out.println(mm.add());//6(4+2)
		System.out.println(mm.sub());//2(4-2)
		System.out.println(mm.mul());//8(4*2)
		System.out.println(mm.div());//2(4/2)
	}

}
