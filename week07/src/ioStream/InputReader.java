package ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//예제 16.
public class InputReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
//			읽어올 파일 설정
			in = new FileInputStream("read.txt");
//			문자타입으로 변환시 사용할 encoding 지정
			is = new InputStreamReader(in, "UTF-8");
			int read = 0;
//			전부 불러올때 까지 반복
			while ((read = is.read()) != -1) {
//				문자형으로 형변환 후 출력
				System.out.print((char)read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
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
