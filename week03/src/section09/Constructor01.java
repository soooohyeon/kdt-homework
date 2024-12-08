package section09;

// 예제 01.
class Snack {
//	필드
	int price;
	
	
//	생성자
//	예제 03. 생성자 추가
Snack(int p) {	// 생성자 직접 선언
	price = p;	// 매개변수로 전달받은 값 필드 변수에 저장
}

//	메소드
	void info() {
		System.out.println("가격은 " + price + "원 입니다.");
	}
}

public class Constructor01 {
	public static void main(String[] args) {
//		예제 02.
//		Snack chip = new Snack();	// Snack 클래스 객체화
//		chip.price = 2000;			// chip 객체의 price 초기화
//		chip.info();				// chip 객체의 메소드 호출
		
//		예제 04.
		Snack chip = new Snack(5000);	// Snack 클래스 객체 생성 및 필드 초기화
		chip.info();					// 객체 메소드 호출
	}
}
