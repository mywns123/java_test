package java_chobo.ch06.teacher.exam;

import java.util.Arrays;
import java.util.Scanner;

import java_chobo.ch06.teacher.dto.Student;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] students = new Student[5];
		initial(students);

		System.out.println("학생관리 프로그램");
		int choice;
		do {
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addStudent(students, sc);
				break;
			case 2:
				modifyStudent(students, sc);
				break;
			case 3:
				students = deleteStudent(students, sc);
				break;
			case 4:
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();
	}

	private static Student[] deleteStudent(Student[] students, Scanner sc) {
		prnStudent(students);
		System.out.print("삭제하고자하는 학생번호 입력 > ");
		int delStdNo = sc.nextInt();
		
		int idxStdNo = searchStudent(students, delStdNo);
		if (idxStdNo < 0) {
			System.out.println("해당 하는 학생이 존재하지 않음");
		}
		
		Student[] tempArr = new Student[5];
		for(int i=0; i < idxStdNo; i++) {
			tempArr[i] = students[i];
		}
		for(int i=idxStdNo ; i < students.length-1; i++) {
			tempArr[i]  = students[i+1];
		}
		return tempArr;
	}

	private static void modifyStudent(Student[] students, Scanner sc) {
		// 1. 학생번호 입력
		// 2. 해당 위치에 입력받은 학생정보를 변경
		prnStudent(students);
		System.out.print("수정하고자하는 학생번호 입력 > ");
		int findStdNo = sc.nextInt();
		int idxStdNo = searchStudent(students, findStdNo);
		if (idxStdNo < 0) {
			System.out.println("해당 하는 학생이 존재하지 않음");
		}
		students[idxStdNo] = createStudent(sc);
	}

	private static int searchStudent(Student[] students, int findStdNo) {
		for(int i=0; i<students.length || students[i] == null; i++) {
			if (findStdNo == students[i].stdNo) {
				return i;
			}
		}
		return -1;
	}

	private static void addStudent(Student[] students, Scanner sc) {
		//1. 저장된 학생수 입력 or 종료 
		//2. 추가할 위치를 검색
		//3. 추가할 학생정보를 입력
		int findIdx = findIdx(students); // findIdx 추가할 학생의 위치
		
		if (findIdx > students.length-1) {
			System.out.println("더 이상 학생을 입력할 수 없습니다.");
			return;
		}
		students[findIdx] = createStudent(sc);
	}

	private static Student createStudent(Scanner sc) {
		System.out.println("학생 정보를 입력하세요. ex) 번호 성명 국어 영어 수학 ");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		return new Student(stdNo, name, kor, eng, math);
	}

	private static int findIdx(Student[] students) {
		for(int i=0; i<students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private static void prnStudent(Student[] students) {
		for (Student std : students) {
			if (std == null)
				break;
			System.out.println(std);
		}
		System.out.println();
	}

	private static void initial(Student[] students) {
		students[0] = new Student(1, "전수린", 90, 90, 90);
		students[1] = new Student(2, "김상건", 91, 91, 91);
		students[2] = new Student(3, "이태훈", 92, 92, 92);
	}

	private static void showMenu() {
		String[] m = new String[6];
		m[0] = "메뉴를 선택하새요.\n";
		m[1] = "1. 학생 추가\n";
		m[2] = "2. 학생 수정\n";
		m[3] = "3. 학생 삭제\n";
		m[4] = "4. 학생 목록\n";
		m[5] = "5. 종료\n";

		for (String str : m) {
			System.out.print(str);
		}
	}
}
