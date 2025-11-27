import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			if(arr[idx] == -1) {
				arr[idx] = i;
			}
		}
		
		
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]);
			if(i<25) {
				System.out.print(" ");
			}
		}
	}
}