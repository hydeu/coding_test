import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		if(1 <= t && t <= 1000) {
			for(int i=1; i<=t; i++) {
				
				int R = sc.nextInt();
				String S = sc.next();
				
				String result = "";
				
				for(int j=0; j<S.length(); j++) {
					for(int k=0; k < R; k++) {
						result += S.charAt(j);
					}
				}
				
				System.out.println(result);
			}
			
		} else {
			System.out.println("테스트 케이스의 수가 1보다 작거나 1000보다 큽니다");
		}
		sc.close();
	}
}