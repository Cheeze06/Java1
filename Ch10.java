import java.util.Scanner;

public class Ch10 {

	public static void main(String[] args) {
		// 중첩 while 문
		Scanner sc = new Scanner(System.in);
//		
//		int i = 1;
//		while(i <= 9) {
//			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
//			i++;
//		}
		
		//문제 1) 구구단 n단 출력.
//		int x = sc.nextInt();
//		i = 1;
//		while(i<= 9) {
//			System.out.printf("%d x %d = %d", x, i, x*i);
//			i++;
//		}
		
		
		//문제 2) 구구단(2-9단) 출력
//		int i = 2;
//		int j = 1;
//		while(i <= 9) {
//			while(j <= 9) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//				j++;
//			}
//			System.out.println("\n");
//			i++;
//			j = 1;
//		}
//		
		
		
		
		// 구구단 문제 역순
		int i = 9;
		int j = 9;
		
		while(i>=2) {
			while(j>=1) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				j--;
			}
			System.out.println();
			i--;
			j=9;
		}
		
		
		
		
		
	}

}
