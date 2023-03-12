package sprout.배열;

import java.util.Scanner;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 행렬덧셈_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				for(int j2=0; j2<m; j2++) {
					arr[j][j2] += sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
