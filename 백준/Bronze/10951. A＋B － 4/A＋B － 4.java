import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		
		while(sc.hasNextInt()) {
			
			int A=sc.nextInt();
			int B=sc.nextInt();
			result.append(A+B).append("\n");
		}
		
		System.out.print(result);
		sc.close();
	}
}
