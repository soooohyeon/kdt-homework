package section02;

import java.util.Scanner;

// 5. 입력 클래스와 입력 메소드
public class Scanner01 {
	public static void main(String[] args) {
//		입력메소드를 사용하기 위해 입력 클래스를 import함
		Scanner sc = new Scanner(System.in);
		
//		입력만 받게 되면 무슨 내용일 입력받아야하는지 모르기 때문에 출력메세지 같이 출력
		System.out.print("나이 입력 : ");
//		정수형으로 입력받고 입력받은 값을 정수형 변수에 값을 대입
		int age = sc.nextInt();
//		nextInt()는 엔터값을 소모하지 않음 / 입력 메소드를 다 사용하면 입력 클래스 종료
		sc.close();
//		서식문자를 통한 출력으로 변수의 값 출력
		System.out.printf("내 나이는 %d살 입니다.", age);		
	}
}
