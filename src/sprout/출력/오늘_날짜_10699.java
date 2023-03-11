package sprout.출력;

import java.text.SimpleDateFormat;
import java.util.Date;

//백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
//그렇기때문에 Main클래스를 이용해주어야 컴파일 오류가 발생하지 않는다.
public class 오늘_날짜_10699 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(sdf.format(date));
	}
}
