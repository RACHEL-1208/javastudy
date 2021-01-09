package study.java.all;

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
class Buyer{
	int money = 100000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p +"을/를 구입해주셔서 감사합니다.");
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Macaron());
		b.buy(new IceAmericano());
		
		System.out.println("현재 잔액 : " + b.money + "입니다.");
		System.out.println("보유 포인트는 : " + b.bonusPoint + "입니다.");
	}
}
