package java_chobo.ch06.teacher.dto;

public class Car {
	String color;
	String gearType;
	int door;
	
	public Car() {
		this("white", "auto");
	}

	public Car(Car car) {
		this(car.color, car.gearType, car.door);
		/*
		 * this.color = car.color; this.gearType = car.gearType; this.door = car.door;
		 */
	}
	
	public Car(String color, String gearType) {
		this(color, gearType, 0);
	}

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return String.format("Car [color=%s, gearType=%s, door=%s]", color, gearType, door);
	}
	
	
	
}
