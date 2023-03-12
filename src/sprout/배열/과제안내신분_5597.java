package sprout.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 과제안내신분_5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] arr = new boolean[31];
		
		for(int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = true;
		}
		
		for(int i=1; i<=30; i++) {
			if(arr[i]== false) {
				bw.write(Integer.toString(i) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
