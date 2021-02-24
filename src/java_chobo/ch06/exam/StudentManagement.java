package java_chobo.ch06.exam;

import java.util.Arrays;
import java.util.Scanner;

import java_chobo.ch06.exam.dto.Student;

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
			case 1: // null찾기				
				addstudent(students, sc);			
				break;
			case 2: // stdno 검색				
				modifyStudent(students, sc);			
				break;
			case 3: // stdno 검색 후 null, 자리 당길것
				students = deleteStudent(students, sc);			
				break;
			case 4:
				System.out.println("학생 목록");
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();
	}

	private static Student[] deleteStudent(Student[] students, Scanner sc) {
		prnStudent(students);
		System.out.println("삭제하고자하는 학생번호 입력> ");
		int delStdno = sc.nextInt();

		int idxStdno = searchStudent(students, delStdno);
		if (idxStdno < 0) {
			System.out.println("해당하는 학생이 존재하지 않음");
		}

		System.out.println("idxStdno " + idxStdno);
		Student[] tempArr = new Student[5];
		for (int i = 0; i < idxStdno; i++) {
			tempArr[i] = students[i];
		}
		for (int i = idxStdno; i < students.length - 1; i++) {
			tempArr[i] = students[i + 1];
		}

		System.out.println(Arrays.deepToString(tempArr));
		return tempArr;
	}

	private static void modifyStudent(Student[] students, Scanner sc) {
		// 1.학생번호 입력
		// 2. 해당위치에 입력박은 학생정보를 변경
		prnStudent(students);
		System.out.println("수정하고자하는 학생번호 입력> ");
		int findStdno = sc.nextInt();
		int idxStdno = searchStudent(students, findStdno);
		if (idxStdno < 0) {
			System.out.println("해당하는 학생이 존재하지 않음");
		}
		students[idxStdno] = createStudent(sc);
	}

	private static int searchStudent(Student[] students, int findStdno) {
		for (int i = 0; i < students.length ||students[i] == null ; i++) {
			if (findStdno == students[i].stdNo) {
				return i;
			}
		}
		return -1;
	}

	private static void addstudent(Student[] students, Scanner sc) {
		// 1. 저장된 학생수 입력 or 종료
		// 2. 추가할 위치를 검색
		// 3. 추가할 학생정보를 입력
		int findIdx = findIdx(students);
		System.out.println("학생수" + findIdx);

		if (findIdx > students.length - 1) {
			System.out.println("더 이상 학생을 입력할 수 없습니다.");
			return;
		}
		students[findIdx] = createStudent(sc);

	}

	private static int findIdx(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private static Student createStudent(Scanner sc) {
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		return new Student(stdNo, name, kor, eng, math);

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
