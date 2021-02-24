package java_chobo.yeop.exam;

import java.util.Scanner;

import java_chobo.yeop.exam.dto.Student;

public class StudentManagement1 {

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
			case 1: // null찾기
				add(sc, students);
				break;
			case 2: // stdno 검색
				modify(sc, students);
				break;
			case 3: // stdno 검색 후 null, 자리 당길것
				delete(sc, students);
				break;
			case 4:
				System.out.println("학생 목록");
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();
	}

	public static void delete(Scanner sc, Student[] students) {
		System.out.println("학생 삭제");
		int stdNo = sc.nextInt();
		for (int i = 1; i <= students.length; i++) {
			if (i == stdNo) {
				students[i - 1] = null;
				for (int j = i; j < students.length - 1; j++) {
					if (students[j] != null) {
						students[j - 1] = students[j];											
						students[j] = null;						
					} // end of if
				} // end of for
			} // end of if
		} // end of for
	}

	public static void modify(Scanner sc, Student[] students) {
		System.out.println("학생 수정");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		for (int i = 0; i <= students.length - 1; i++) {
			if (i == stdNo) {
				students[i - 1] = new Student(i, name, kor, eng, math);
			}
		}
	}

	public static void add(Scanner sc, Student[] students) {
		System.out.println("학생 추가");
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		for (int i = 0; i <= students.length; i++) {
			if (i == students.length) {
				System.out.println("더 이상 학생을 입력할 수 없습니다.");
				break;
			} else if (students[i] == null) {
				students[i] = new Student(i + 1, name, kor, eng, math);
				break;
			}
		}
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
