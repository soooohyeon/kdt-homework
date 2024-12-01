package section04;
//2. 제어문(조건문) : switch ①
public class SwitchTest01 {
	public static void main(String[] args) {
//		[예제 10.]
		int num = 7;
		
		switch (num) {	// num 변수에 값에 따라 아래 결과가 달라짐
		case 1:		// num의 값이 1이라면 아래 출력문 실행 후 break를 만나 switch문 종료
			System.out.println("num은 1입니다.");
			break;
		case 7:		// num의 값이 7이라면 아래 출력문 실행 후 break를 만나 switch문 종료
			System.out.println("num은 7입니다.");
			break;
		default:	// 위 case에서 num의 값이 없다면 아래 출력문 실행 후 break를 만나 switch문 종료
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
//		[예제 11.]
		switch (num) {	// num 변수에 값에 따라 아래 결과가 달라짐
//		num의 값이 1이라면 아래 출력문 실행하고 그 후 코드를 막을 제어문이 없기떄문에 그 외 값인 default의 실행문이 실행됨
		case 1:
			System.out.println("num은 1입니다.");
//		num의 값이 7이라면 아래 출력문 실행하고 그 후 코드를 막을 제어문이 없기떄문에 그 외 값인 default의 실행문이 실행됨
		case 7:		
			System.out.println("num은 7입니다.");
//		위 case에서 num의 값이 없다면 아래 출력문 실행 후 switch문 종료
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}
