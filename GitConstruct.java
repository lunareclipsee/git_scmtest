package tg.edu;

import java.util.Scanner;

import tg.edu.util.Calc;

public class GitConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수의 합을 구하기 위한 숫자를 입력해주세요\n");
		System.out.println("첫번째 값을 입력해주세요.");
		int firNum = scan.nextInt();
		System.out.println("두번째 값을 입력해주세요.");
		int secNum = scan.nextInt();
		
		Calc calc = new Calc();
		int firResult = calc.sumOf(firNum);
		int secResult2 = calc.sumOf(secNum);
		
		calc.resultPrint(firNum, firResult);
		calc.resultPrint(secNum, secResult2);
	
	}
}


