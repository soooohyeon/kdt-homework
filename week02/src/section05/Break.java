package section05;

import java.util.Scanner;

//3-2. 제어문(기타 제어문) : break문
public class Break {
	public static void main(String[] args) {
//		입력 메소드 사용을 위한 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		int magicNumber = (int)(Math.random() * 50) + 1;	// 랜덤으로 숫자를 받는다
		boolean isMatched = false;	// 정답을 맞췄는지 판단하는 변수 선언 및 초기화
		
		for (int i = 0; i < 10; i++) {		// 10번 반복
			System.out.print("찾는 숫자 입력  : ");	// 비교할 변수 입력받기 위한 출력 메세지
			int guess = sc.nextInt();				// 비교할 변수 선언하고 입력받은 값 대입
			
			if (guess == magicNumber) {		// 정답과 입력받은 값이 일치하다면
				System.out.println((i + 1) + "번째에 맞췄습니다!");		// 정답 메세지 출력
				isMatched = true;	// 정답 판단 변수를 true로 바꿔줌
				break;	// 반복 즉시 종료
			} else if (guess > magicNumber) {	// 정답보다 입력받은 값이 크다면
				System.out.println("맞춰야할 숫자가 더 작습니다.");	// 오답 메세지 출력
			} else if (guess < magicNumber) {	// 정답보다 입력받은 값이 작다면
				System.out.println("맞춰야  할 숫자가 더 큽니다.");		// 오답 메세지 출력
			}
		}
		if (!isMatched) {	// 반복문이 끝난 후 실행, 만약 정답 판단 변수가 false라면
			System.out.println("정답을 맞추지 못했습니다.");	// 해당 매세지 출력
		}
	}
}
