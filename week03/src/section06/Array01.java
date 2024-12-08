package section06;
//1. 배열 ① : 생성과 선언, 값 저장
public class Array01 {
	public static void main(String[] args) {
//		[예제 01.]
//		arr라는 참조변수를 stack 메모리에 선언하고 heap 메모리에 4칸짜리 배열을 생성함
		int[] arr = new int[4];
		
//		arr은 참조변수로 참조변수를 출력시 참조변수에 담긴 참조값(주소값) 출력
		System.out.println(arr);
		
//		[예제 02.]
//		arr2라는 참조변수를 stack 메모리에 선언하고 heap 메모리에 4칸짜리 배열을 생성함
		int arr2[] = new int[4];
		
//		인덱스 : 배열의 값을 저장하는 각 방번호, 0부터 시작
		arr[0] = 1;		// arr2의 0번째 방에 1을 저장
		arr[1] = 2;		// arr2의 1번째 방에 2을 저장
		arr[2] = 3;		// arr2의 2번째 방에 3을 저장
		arr[3] = 4;		// arr2의 3번째 방에 4을 저장
		
//		배열의 각 방의 값 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
	}
}
