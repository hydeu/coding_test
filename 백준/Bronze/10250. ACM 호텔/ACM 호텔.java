import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		int T = sc.nextInt();
		
		for(int i=0; i < T; i++) {
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		
		int floor;
		int room;
		int number;
		
		
		if ( N % H == 0) {
			floor = H;
			room = N / H;
		} else {
			floor = N % H;
			room = N / H + 1;
		}
		
		number = floor * 100  + room;
		result.append(number).append("\n");
		}
		System.out.println(result);
		sc.close();
	}
}