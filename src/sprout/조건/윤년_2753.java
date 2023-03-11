package sprout.조건;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 윤년_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int result = 0;
		
		if( 1<= y && y <= 4000) {
			if((y%4 == 0 && y%100 != 0) || y%400 == 0) {
				result = 1;
			}
		}
		
		System.out.println(result);
	}
}
