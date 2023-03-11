package sprout.반복;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 팩토리얼_10872 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int N = in.nextInt();
			in.close();
			
			int sum = factorial(N);
			System.out.println(sum);
			
		}
		
		public static int factorial(int N) {
			if(N <= 1) return 1;
			return N * factorial(N - 1);		
		}
}
