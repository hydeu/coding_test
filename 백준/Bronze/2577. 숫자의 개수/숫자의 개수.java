import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = Integer.MIN_VALUE;
		
		if(100 <= A && A < 1000 && 100 <= B && B < 1000 && 100 <= C && C < 1000) {
			
			result = A*B*C;
			String str = Integer.toString(result);
			
			for(int i=0; i<=9; i++) {
				int count = 0;
					
					for(int j=0; j<str.length(); j++) {
						int joongbok = str.charAt(j) - '0';
						
						  if(joongbok == i) {
							  count++;
						  }
					}
					
					System.out.println(count);
			}
			
		} else {
			System.out.println("100보다 크거나 같고, 1000보다 작은 자연수를 입력하세요.");
		}
	}
}