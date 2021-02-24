package java_chobo.ch07.super01;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}

}
