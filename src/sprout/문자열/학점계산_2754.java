package sprout.문자열;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 학점계산_2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double grade = 0.0;
		String gradeStr = sc.next();
		switch (gradeStr.charAt(0)) {
		case 'A':
			grade = 4 + getLastPoint(gradeStr.charAt(1));
			break;
		case 'B':
			grade = 3 + getLastPoint(gradeStr.charAt(1));
			break;
		case 'C':
			grade = 2 + getLastPoint(gradeStr.charAt(1));
			break;
		case 'D':
			grade = 1 + getLastPoint(gradeStr.charAt(1));
			break;
		default:
			grade = 0.0;
			break;
		}
		
		System.out.println(grade);
	}

	public static double getLastPoint(char c) {
		if('+'== c) {
			return 0.3;
		}else if('-' == c) {
			return -0.3;
		}else {
			return 0.0;
		}
	}
}
