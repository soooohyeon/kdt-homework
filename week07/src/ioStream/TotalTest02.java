package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//예제 06.
public class TotalTest02 {
	public static void main(String[] args) {
//		파일을 읽고 출력하기 위해 객체 선언
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
//			복사할 파일
			in = new FileInputStream("back.jpg");
//			복사한 파일을 저장할 파일
			out = new FileOutputStream("back_copy.jpg");
			byte[] buffer = new byte[512];
//			시작 시간 - 파일 읽어오기 전
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
//			파일을 전부 읽어올때까지 반복
			while((read = in.read(buffer)) != -1) {
//				읽어온 데이터를 back_copy.jpg 파일에 저장 (= 복사)
//				복사할 배열, 시작 인덱스, 복사할 데이터의 길이
				out.write(buffer, 0, read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
//			파일을 복사한 시간 체크하기 위해 계산
			double time = (double)(end - start ) / 1000;
			System.out.println(time + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				더 이상 사용하지 않아도 계속 사용중이라면 종료
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
