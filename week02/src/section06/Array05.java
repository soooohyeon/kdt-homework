package section06;
//1. 배열 ⑤ : 배열의 값을 for문을 통해 정렬
public class Array05 {
	public static void main(String[] args) {
//		[예제 06.]
//		arr라는 참조변수를 stack 메모리에 선언하고 10칸짜리 배열을 heap메모리에 생성한 후 각 값 담기
		int arr[] = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
//		임시로 값을 담을 변수 선언 및 초기화
		int temp = 0;
		
//		각 자리마다 비교를 해야하므로 이중 for문 사용
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
//				j번째와 j+1번째 값 비교
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];		// 더 큰 값이 뒤에 위치해야 하므로 임시 변수에 작은 값 저장
					arr[j + 1] = arr[j];	// 뒷 칸에 큰 수 담기
					arr[j] = temp;			// 앞 칸에 임시로 저장해둔 작은 수 다시 담기
				}
			}
		}
		System.out.print("정렬 후 출력 : ");
		for (int i = 0; i < arr.length; i++) {	// for 문 사용하여 0 ~ 9번째 방 전부 출력
			System.out.print(arr[i] + " ");
		}
		
	}
}
