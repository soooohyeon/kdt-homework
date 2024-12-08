package section06;

public class TwoArray01 {
	public static void main(String[] args) {
//		예제 14.
		int[][] arr = new int[2][3];	// 행과 열로 이루어진 2차원 배열 선언 및 생성
		
		arr[0][0] = 1;		// 각각의 칸에다 값 저장
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		System.out.println("2차원 배열 : " + arr);				// 2차원 배열의 참조값 출력
		System.out.println("2차원 배열 1행 : " + arr[0]);			// 2차원 배열의 1번째 줄(배열)의 참조값 출력
		
		System.out.println("행의 크기 : " + arr.length);			// 행의 길이 출력
		System.out.println("1행의 열 크기 : " + arr[0].length);	// 열의 길이 출력
		System.out.println("2행의 열 크기 : " + arr[1].length);	// 열의 길이 출력
		System.out.println("arr[0][0] : " + arr[0][0]);			// 해당 공간의 값 출력
		
//		예제15.
		int[][] arr2 = new int[5][5];	// 행과 열의 크기가 5인 2차원 배열 선언 및 생성
		int count = 1;
		
		for (int i = 0; i < 5; i++) {		// 행 반복
			for (int j = 0; j < 5; j++) {	// 열 반복
				arr2[i][j] = count++;		// 행 0 ~ 5, 열 0 ~ 5 반복을 돌리면서 각각 증가연산자를 이용하여 1 ~ 25까지 값 넣기
			}
		}
		
		for (int i = 0; i < 5; i++) {		// 행 반복
			for (int j = 0; j < 5; j++) {	// 열 반복
				System.out.print(arr2[i][j] + " ");	// 열 한 줄을 줄바꿈 없이 띄어쓰기만 해서 출력
			}
			System.out.println();	// 열이 끝나면 줄바꿈
		}
		
	}
}
