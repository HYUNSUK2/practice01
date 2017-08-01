package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "문자열을 입력하세요 : " );
		String text = scanner.nextLine();
		//next는 스페이스를 만나면 거기까지 잘라서 값을 넘겨주고 nextline은 엔턴까지 값을 넘겨준다 
		
		
		
		for(int i=1; i<8; i++)
		{
				System.out.println(text.substring(0, i));
		}		
		
		
		scanner.close();
	}
}