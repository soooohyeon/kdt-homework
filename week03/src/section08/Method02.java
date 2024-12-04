package section08;
//멘토시리즈 자바 예제 06-13
public class Method02 {
//	예제 06. 매개변수 있는 메소드 생성
	void count (int bookNum) {	// 외부에서 정수형 매개변수값 1개를 받을 수 있음
		System.out.println("책은 " + bookNum + "권 입니다.");	// 전달받은 매개변수 넣어서 출력
	}
	
//	예제 08. 매개변수 2개 있는 메소드 생성
	void sum (int num1, int num2) {	// 외부에서 정수형 매개변수값 2개를 받을 수 있음
		System.out.println("두 수의 합은 " + (num1 + num2) + " 입니다.");
	}
	
//	예제 10. 자료형이 다른 매개변수 2개 있는 메소드 생성
	void introduce (String name, int age) {	// 외부에서 문자열과 정수형 매개변수값을 받을 수 있음
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
	}
	void hello() {
		System.out.println("안녕하세요");
	}
	
//	예제 12. 매개변수가 배열인 메소드 생성
	void sum(int[] nums) { 	// 외부에서 정수형 배열타입의 매개변수값을 받을 수 있음
		int result = 0;
		for (int i = 0; i < nums.length; i++) {	// nums 배열의 길이만큼 반복
			result += nums[i];	// 반복문으로 확인한 num의 각 값을 누적해서 더함
		}
		System.out.println("숫자들의 합은 " + result + " 입니다.");
	}
	
	public static void main(String[] args) {
		Method02 m = new Method02();	// 메소드 사용하기 위해 클래스를 객체화함
//		예제 07. 매개변수 있는 메소드 호출
		m.count(3);	// 인수는 3으로 count 메소드로 3 전달
		
//		예제 09. 매개변수 2개 있는 메소드 호출
		m.sum(5, 3);	// 인수는 각각 5, 3으로 sum 메소드에 각각 전달
		m.sum(10, 7);	// 인수는 각각 10, 7로 sum 메소드에 각각 전달
		
//		예제 11. 자료형이 다른 매개변수 2개 있는 메소드 호출
		m.introduce("홍길동", 21);	// 인수는 각각 문자열, 정수형이고 
									// 메소드에 작성한 매개변수 순서대로 전달해줘야함
		m.hello();
		
//		예제 13. 매개변수가 배열인 메소드 생성
		int[] nums = {100, 200};	// stack메모리에 nums라는 참조변수에 heap메모리에 생성된 2칸짜리 배열의 참조값을 담음
		m.sum(nums);				// 배열을 인수로 메소드에 넘김
	}
}
