package java_chobo.ch07.super01;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return String.format("Point3D [z=%s, toString()=%s]", z, super.toString());
	}

	public static void main(String[] args) {
		Point p = new Point(10, 15);
		System.out.println(p);

		Point3D p1 = new Point3D(20, 30, 40);
		System.out.println(p1);
	}

}
