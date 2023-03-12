package sprout.문자열;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 대소문자바꾸기_2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
			}else {
				arr[i] = (char) (arr[i] - 32);
			}
		}
		System.out.println(arr);
	}

}
