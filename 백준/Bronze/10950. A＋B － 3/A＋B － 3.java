import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for (int i=1; i<=T; i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			result.append(A+B).append("\n");
		}
		
		System.out.print(result);
		sc.close();
	}
}
