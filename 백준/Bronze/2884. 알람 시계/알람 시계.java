import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int sum;
		
		int CH;
		int CM;
		
		
		if(M < 45) {
			H--;
			M = M + 60 - 45;
			
			if (H < 0) {
				H = 23;
			}
			System.out.print(H+" ");
			System.out.print(M);
			
		} else {
		
		sum = (H * 60) + M - 45;
		
		CH = sum / 60;
		System.out.print(CH+" ");
		
		CM = sum % 60;
		System.out.print(CM);
		}
		sc.close();
	}
}