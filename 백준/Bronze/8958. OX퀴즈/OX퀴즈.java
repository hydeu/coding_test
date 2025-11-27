import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			String Q = sc.next();
			int combo = 0;
			int sum = 0;
			
			for (int j=0; j<Q.length(); j++) {
				if (Q.charAt(j) == 'O') {
					combo++;
					sum += combo;
				} else {
					combo = 0;
				}
			}
			System.out.println(sum);
			}
		}
	}