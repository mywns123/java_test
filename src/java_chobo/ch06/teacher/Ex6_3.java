package java_chobo.ch06.teacher;

import java.util.Arrays;

import java_chobo.ch06.teacher.dto.Tv;

public class Ex6_3 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		System.out.println(Arrays.toString(tvArr));
		
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		prnArrTv(tvArr);
		
		tvArr[0].color = "red";
		tvArr[0].isPower = true;
		tvArr[0].channel = 10;
		prnArrTv(tvArr);
		
		for(Tv t : tvArr) {
			t.chanelUp();
		}
		prnArrTv(tvArr);
	}

	private static void prnArrTv(Tv[] tvArr) {
		for(Tv t : tvArr) {
			System.out.println(t);
		}
		System.out.println();
	}

}








