package java_chobo.ch06.teacher.exam;

import java_chobo.ch06.teacher.dto.Car;

public class Exam6_4 {

	public static void main(String[] args) {
		Car car1 = new Car("red", "auto", 5);
		System.out.println(car1);

		Car car2 = new Car(car1);
		System.out.println(car2);
	}

}
