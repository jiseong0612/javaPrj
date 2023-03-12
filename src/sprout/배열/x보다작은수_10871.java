package sprout.배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class x보다작은수_10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int[] num = new int[Integer.parseInt(st.nextToken())];	//배열 길이 생성
		int x = Integer.parseInt(st.nextToken());	//비교 값 생성
		
		st = new StringTokenizer(br.readLine()); //배열에 들어갈 값 입력
		
		for(int i=0; i<num.length; i++) {	//배열에 입력
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i< num.length; i++) {	//비교값 보다 작은 배열값 출력
			if(num[i] < x) {
				bw.write(num[i] + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}