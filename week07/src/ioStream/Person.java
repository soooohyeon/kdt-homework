package ioStream;
//예제 19.
import java.io.Serializable;

public class Person implements Serializable {
//	필드
	private static final long serialVersionUID = 1L;
	private String myName;
	private int myAge;
	
//	생성자
	public Person(String myName, int myAge) {
		this.myName = myName;
		this.myAge = myAge;
	}
	
//	접근제한자 private로 인한 getter, setter 메소드
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
}
