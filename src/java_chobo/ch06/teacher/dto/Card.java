package java_chobo.ch06.teacher.dto;

public class Card extends Object{
	// 인스턴스 변수는 소문자 (두 단어로 조합시 카멜 표기식)
	private String kind;
	private int number;

	// 클래스 변수는 대문자로 표시 (두 단어로 조합시 _로 구분)
	public static int WIDTH = 100;
	public static int HEIGHT = 250;

	/**
	 * default constructor
	 */
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Card [%s  %s]", kind, number);
	}

}











