package java_chobo.ch07.exam1234;

public class Main {

	public static void main(String[] args) {
		Regular r = new Regular("이순신", 25, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printinfo();
		t.setTime(120);
		t.printinfo();

		Employee r1 = new Regular("이순신", 25, "서울", "인사부");
		Employee t1 = new Temporary("장보고", 25, "인천", "경리부");
		r1.setSalary(5000000);
		r1.printinfo();
		t1.setTime(120);
		t1.printinfo();

	}

}
