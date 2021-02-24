package java_chobo.ch07.super04;

public class Buyer {

	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 위한 배열
	int i = 0; // Product배열 cart에 사용될 index
	int sum = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.printf("잔액이 부족하여 %s를 살수 없습니다.%n", p);
		} else {
			money -= p.price;
			add(p);
			i++;
		}
	} // buy

	void add(Product p) {
		cart[i] = p;
		sum += p.price;
		if (i >= cart.length - 1) {
			Product[] temp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
	} // add

	void summary() {
		System.out.print("구입한 물건 : ");
		for (int i = 0; i < cart.length - 1; i++) {
			if (cart[i] != null) {
				System.out.print(" " + cart[i] + ",");
			}
		}
		System.out.println();
		System.out.printf("사용한 금액 : %d%n", sum);
		System.out.printf("남은 금액 : %d", money);
	} // summary

}
