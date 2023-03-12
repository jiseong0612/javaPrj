package sprout.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 개수세기_10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int arr[] = new int[Integer.parseInt(br.readLine())];	//배열 길이 생성
		
		st = new StringTokenizer(br.readLine());	//배열에 들어갈 값 생성
		
		for(int i=0; i<arr.length; i++) {	//배열에 값 입력
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int findNum = Integer.parseInt(br.readLine());	//찾으려는 값 입력
		
		int matchCnt = 0;
		for(int i=0; i<arr.length; i++) {	//배열의 값과 찾으려는 값 비교 후 일치하는 값 카운팅
			if(arr[i] == findNum) {
				++matchCnt;
			}
		}
		br.close();
		bw.write(Integer.toString(matchCnt));	//BufferedWriter에서 정수를 그대로 출력하면 Error, 문자열로 변경해야함
		bw.flush();
		bw.close();
	}
}
