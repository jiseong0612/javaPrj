package sprout.반복;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class N찍기_2741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(!(num <= 100000)) return;
		
		for(int i = 0; i +1 <= num; i++) {
			System.out.println(i+1);
		}
	}
}
