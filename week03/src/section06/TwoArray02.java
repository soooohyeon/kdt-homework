package section06;

import java.util.Scanner;

public class TwoArray02 {
	public static void main(String[] args) {
//		예제 16.
		int[][] lotto = {{2, 6, 11, 33, 42, 44},		// 5행 5열인 배열에 값을 넣어서 생성
				 		 {1, 6, 17, 22, 24, 33},
				 		 {7, 16, 24, 33, 42, 44},
				 		 {11, 27, 32, 34, 43, 46},
				 		 {6, 17, 22, 24, 33, 41}};
		
		Scanner sc = new Scanner(System.in);			// 입력 받기 위해 Scanner 클래스 import
		String myNum = "";								// 입력받은 값을 저장할 변수
		System.out.println("당첨 숫자 6개 연속으로 입력 : ");
		myNum = sc.next();								// 입력받은 값 대입
		
		boolean isWin = false;							// 로또 당첨 번호와 입력받은 값의 일치여부 결과를 담을 변수
		
		for (int i = 0; i < lotto.length; i++) {		// 정답 배열의 행 길이 만큼 반복
			String lottoNumber = "";					// 일치여부 비교를 위해 배열안의 값을 저장할 변수
			for (int j = 0; j < lotto[i].length; j++) {	// 정답 배열의 열 길이 만큼 반복
				lottoNumber += lotto[i][j];				// 열 마다 변수에 띄어쓰기 없이 누적 저장(문자열 연결)
			}
			if (myNum.equals(lottoNumber)) {			// 문자열 비교 후 일치하다면
				isWin = true;							// true로 변경
				break;									// 반복 종료
			}
		}
		
		if (isWin) {	// true라면
			System.out.println(myNum + " 번호 당첨!!");	
		} else {		// false라면
			System.out.println(myNum + " 번호 당첨이 아님!!");
		}
		sc.close();		// 입력이 끝났으므로 Scanner 클래스 종료
	}
}
