package section06;
//1. 배열 ③ : 배열의 값 중 짝수의 합 구하기
public class Array03 {
	public static void main(String[] args) {
//		[예제 04.]
//		numbers라는 참조변수를 stack 메모리에 선언하고 10칸짜리 배열을 heap메모리에 생성
		int numbers[] = new int[10];
//		총합 변수 선언 및 초기화
		int sum = 0;
		
//		배열의 각 방번호에 값을 넣기 위해 배열의 길이 만큼 반복돌림
//		배열의 길이 = 10이나 0부터 10 미만까지 반복을 돌리므로 총 10번의 반복실행
//		값은 랜덤으로 넣음
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 30) + 1;
		}
		
//		배열의 값을 2로 나뉘어서 0이 되는 것
//		즉, 짝수만 총 합계 변수에 +로 누적함
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		
////		[추가 문제. 홀수로 변경해보기]
////		배열의 값을 2로 나뉘어서 1이 되는 것 또는 0이 아닌 것
////		즉, 홀수만 총 합계 변수에 +로 누적함
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 != 0) {
//				sum += numbers[i];
//			}
//		}
		
//		for문을 통해서 배열의 값 모두 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
//		총합 결과 출력
		System.out.println("\n배열의 짝수들의 합 : " + sum);
	}
}
