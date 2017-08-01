package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner( System.in  );
		int getInt = scanner.nextInt();
		
		
		
		while( true ) {
			
			if(getInt%2!= 0) {
				for(int i =1; i<=getInt; i+=2) {
					sum=sum+i;
				}
				break;
			}
			
			else{
				for(int i =2; i<=getInt; i+=2) {
					sum=sum+i;
				}
				break;
			}
		}
		
		System.out.println("결과값"+sum);
		
	}
}