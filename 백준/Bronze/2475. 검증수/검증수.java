import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int check = 0;
		
		for(int i=1; i<=5; i++) {
			int code = sc.nextInt();
			sum += code*code;
			check = sum%10;
		}
		
		System.out.print(check);
		
	}
}