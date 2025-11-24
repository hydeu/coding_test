import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int index = -1;
		
		
			for(int i=0; i< 9; i++) {
				int v = sc.nextInt();
			if(v > max) {
				max = v;
				index = i + 1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}