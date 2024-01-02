package chapter2;

public class characterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //ch1에 해당하는 문자의 아스키코드 값 출력
		
		char ch2 = 66; //정수 출력 (문자형 변수)
		System.out.println(ch2); //ch2에 해당하는 정수의 문자 값 출력
		
		int ch3 = 67;
		System.out.println(ch3); //ch3에 해당하는 정수 출력
		System.out.println((char)ch3); //ch3에 해당하는 정수의 문자 값 출력

	}

}
