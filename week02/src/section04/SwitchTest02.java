package section04;

import java.util.Scanner;

//2. 제어문(조건문) : switch ②
public class SwitchTest02 {
	public static void main(String[] args) {
//		입력 메소드 사용을 위한 입력 클래스 import
		Scanner sc = new Scanner(System.in);
//		어떠한 값을 입력받을지 안내하는 출력 메세지
		System.out.print("원하는 숫자 입력 (1 ~ 5) : ");
//		값을 입력받고 변수에 값 담기
		int num = sc.nextInt();
		
//		입력받은 값으로 해당하는 case 아래 코드 실행
		switch (num) {
		case 5: {	// num의 값이 5일 때 아래 코드 실행하고 switch문 종료
			System.out.println("5를 입력하셨습니다.");
			break;
		}
		case 4: {	// num의 값이 4일 때 위 case 통과후 아래 코드 실행하고 switch문 종료
			System.out.println("4를 입력하셨습니다.");
			break;
		}
		case 3: {	// num의 값이 3일 때 위 case들 통과후 아래 코드 실행하고 switch문 종료
			System.out.println("3을 입력하셨습니다.");
			break;
		}
		case 2: {	// num의 값이 2일 때 위 case들 통과후 아래 코드 실행하고 switch문 종료
			System.out.println("2를 입력하셨습니다.");
			break;
		}
		case 1: {	// num의 값이 1일 때 위 case들 통과후 아래 코드 실행하고 switch문 종료
			System.out.println("1을 입력하셨습니다.");
			break;
		}
		default:	// num의 값이 위 case들 중 만족하는 case가 없다면 아래 코드 실행하고 switch문 종료
			System.out.println("1 ~ 5까지의 숫자를 입력하세요.");
		}
	}
}
