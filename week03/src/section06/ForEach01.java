package section06;

public class ForEach01 {
	public static void main(String[] args) {
//		예제 17.
		int[] score = {90, 92, 93};		// 배열 선언 및 값 저장
		
		int sum = 0;		// 총합 변수
		double avg = 0;		// 평균 변수, 실수형이기 때문엔 값 0.0으로 초기화됨
		
		for (int val : score) {		// for-each문으로 배열 반복
			sum += val;				// 총합 변수에 각 배열의 값 누적 더하기
		}
		
		avg = (double)sum / 3;		// 정수 / 정수는 정수의 결과가 나오므로 총합변수를 실수형으로 강제 형변환 후 3으로 나누면 평균
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);	// 값 저장
	}
}
