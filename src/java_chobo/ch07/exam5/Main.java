package java_chobo.ch07.exam5;

public class Main {

	public static void main(String[] args) {
		Frute[] fAry = { new Grape(), new Apple(), new Pear() };
		for (Frute f : fAry) {
			f.print();
		}

	}

}
