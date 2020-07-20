package tg.edu.util;

public class Calc {


	public int sumOf(int num) {
		int result = 0;
		for(int i=1; i<=num; i++) {
			result += i;
		}
		return result;
	}
	
	public void resultPrint(int num, int result) {
		System.out.println("1부터 "+num+"까지의 정수의 합은 : "+result+"입니다.");
	}
}
