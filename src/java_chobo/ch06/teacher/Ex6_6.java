package java_chobo.ch06.teacher;

import java_chobo.ch06.teacher.dto.Card;

public class Ex6_6 {

	public static void main(String[] args) {
		System.out.printf("Card.WIDTH = %d%n", Card.WIDTH);
		System.out.printf("Card.HEIGHT = %d%n", Card.HEIGHT);
		
		Card c1 = new Card();
		System.out.println(c1);//참조변수면 c1.toString()호출
		c1.setKind("Heart");
		c1.setNumber(7);
		System.out.println(c1);
		System.out.printf("c1.kind = %s, c1.number = %d %n", 
				c1.getKind(), c1.getNumber());
		
		Card c2 = new Card();
		c2.setKind("Spade");
		c2.setNumber(4);
		System.out.println(c2);
		
		Card.WIDTH = 50;
		Card.HEIGHT = 80;
		
		System.out.printf("c1.WIDTH = %d%n", c1.WIDTH);
		System.out.printf("c1.HEIGHT = %d%n", c1.HEIGHT);
		
		System.out.printf("c2.WIDTH = %d%n", c2.WIDTH);
		System.out.printf("c2.HEIGHT = %d%n", c2.HEIGHT);
	}

}











