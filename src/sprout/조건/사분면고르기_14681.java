package sprout.조건;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 사분면고르기_14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int quadrant  = x>0 && y>0 ? 1 : x<0 && y>0 ? 2: x<0 && y<0 ? 3 : 4;
		
		System.out.println(quadrant);
	}
}
