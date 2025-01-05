package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//예제 05.
public class TotalTest01 {
	public static void main(String[] args) {
//		파일을 읽고 출력하기 위해 객체 선언
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("back.jpg");
			out = new FileOutputStream("back_copy.jpg");
//			시작 시간 - 파일 읽어오기 전
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
//			파일을 전부 읽어올때까지 반복
			while((read = in.read()) != -1) {
//				읽어온 데이터를 back_copy.jpg 파일에 저장 (= 복사)
				out.write(read);
			}
			System.out.println("이미지 읽기 종료");
//			종료 시간 - 파일 읽기 끝난 후
			long end = System.currentTimeMillis();
//			시간 계산 - 파일 읽어오는데 소요된 시간
			long time = (end - start) / 1000;
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
