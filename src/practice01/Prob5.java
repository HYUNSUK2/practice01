package practice01;

public class Prob5 {
	public static void main(String[] args) {
	
		for(int i=1; i<100; i++) {
			
			String s = String.valueOf(i);
			char c = s.charAt(0);
			
			if(s.charAt(0)=='3' || s.charAt(0)=='6' || s.charAt(0)=='9') {
				
				if(s.length()==2 && (s.charAt(1)=='3' || s.charAt(1)=='6' || s.charAt(1)=='9')) {
					
						System.out.println(i+" 짝짝");
				}else
					
				{
					System.out.println(i+" 짝");
				}
				
			}	
		}
	}
}