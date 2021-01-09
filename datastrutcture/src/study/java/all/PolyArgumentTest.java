package study.java.all;

import java.util.Iterator;

class Product {
	int price;
	int bonusPoint;
	
	Product (int price){
		this.price = price;
		bonusPoint =(int) (price / 10.0); //보너스 포인트는 제품가격의 10%
	}
}

class Macaron extends Product {
	Macaron(){
		super(3500);//조상Product (int price)를 호출한다.
	}
	public String toString() {
		return "마카롱";
	}
}
class IceAmericano extends Product {
	IceAmericano(){
		super(5000);
	}
	public String toString() {
		return "아이스아메리카노";
	}
}
class Burger extends Product {
	Burger(){
		super(6000);
	}
	public String toString() {
		return "버거";
	}
}
class Buyer{
	int money = 100000;
	int bonusPoint = 0;
	int i = 0;
	Product[] item = new Product[10]; // 인벤토리
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p +"을/를 구입해주셔서 감사합니다.");
	}

	void summary() {
		int sum = 0; // 구매 금액 합계
		String itemList = ""; //구매한 목록
		for (int i = 0; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("사용한 총 금액은 : " + sum + "입니다.");
		System.out.println("구입한 상품은 : " +  itemList + "입니다");
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Macaron());
		b.buy(new IceAmericano());
		b.buy(new Burger());
		b.summary();
		System.out.println("현재 잔액 : " + b.money + "입니다.");
		System.out.println("보유 포인트는 : " + b.bonusPoint + "입니다.");
	}
}
