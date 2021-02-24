package java_chobo.ch06.teacher;

import java_chobo.ch06.teacher.dto.Student;

public class Ex6_4 {

	public static void main(String[] args) {
		Student[] stdArr = new Student[5];
		
		stdArr[0] = new Student(1, "박유진", 90, 80, 70);
		stdArr[1] = new Student(2, "김길현", 90, 90, 70);
		stdArr[2] = new Student(3, "김근호", 90, 90, 90);
		stdArr[3] = new Student(4, "이종윤", 60, 60, 60);
		stdArr[4] = new Student(5, "김경연", 80, 80, 70);

		for(int i=0; i < stdArr.length; i++) {
			System.out.println(stdArr[i]);
		}
	}

}
