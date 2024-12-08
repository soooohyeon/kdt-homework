package section06;

import java.util.Arrays;
import java.util.Comparator;

public class Array06 {
	public static void main(String[] args) {
//		예제 07.
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};	// 배열 선언 및 값 직접 지정으로 heap 메모리에 할당
		
		System.out.println(Arrays.toString(arr));		// Arrays의 toString() 메소드로 배열의 값 모두 출력
		
//		예제 08.
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 배열의 값 모두 출력
		Arrays.sort(arr);	// Arrays 클래스의 sort() 메소드를 통해서 배열을 오름차순으로 정렬함
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr)); // 배열의 값 모두 출력
		
//		예제 09.
		Integer[] arr2 = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};	// 정수형 클래스 배열 선언 및 값 저장
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr2)); // 배열의 값 모두 출력
//		Arrays 클래스의 sort()와 Comparator 클래스의 reverseOrder()메소드를 통해 내림차순 정렬
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr2)); // 배열의 값 모두 출력
		
	}
}
