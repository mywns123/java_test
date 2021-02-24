package java_chobo.ch06.teacher.dto;

public class Tv /* extends Object */ {
	// 속성 선언 (멤버변수)
	public String color; // 색상
	public boolean isPower; // 전원상태
	public int channel; // 채널

	public Tv() {
		super();	// 부모클래스의 생성자를 호출
	}
	
	// 기능(멤버메서드)
	public void setPower() {
		this.isPower = !isPower;
	}

	public void chanelUp() {
		this.channel++;
	}

	public void chanelDown() {
		this.channel--;
	}

	
	@Override
	public String toString() {
		return String.format("Tv [color=%s, isPower=%s, channel=%s]", color, isPower, channel);
	}
	
}
