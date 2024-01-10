import java.util.Scanner;

public class Ch09 {

	public static void main(String[] args) {
		//1부터 n(입력한 수)까지의 합 구하기
		Scanner sc = new Scanner(System.in);
//		System.out.println("몇까지 더할까요?");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum= 0;
//		while(i <= n) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);
//		
		
		
		// do - while문
		// do - while문은 무조건 한번 실행 후 조건 판별
//		i = 10;
//		do {
//			System.out.printf("%d", i);
//			i--;
//		}
//		while(i != 0);
	
		
		// 문제1) 1부터 입력한 수들 중에서 3의 배수의 합을 출력
//		System.out.println("정수를 입력해주세요");
//		int x = sc.nextInt();
//		sum = 0;
//		while(x >= 1) {
//			if(x%3 == 0) {
//				sum += x;
//			}
//			x--;
//		}
//		System.out.printf("sum : %d", sum);
//		
		// 문제2) -1 입력하기전까지 정수 받음
//		
//		int zsum = 0;
//		int hsum = 0;
//		
//		while(true) {
//			x = sc.nextInt();
//			if(x == -1) {
//				break;
//			}
//			else {
//				if(x%2 == 0) {
//					zsum += x;
//				}
//				else {
//					hsum += x;
//				}
//			}
//		}
//		System.out.printf("짝수의 합: %d\n홀수의 합: %d", zsum, hsum);
//		
		// 문제3) 1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다.
//		int x = 100;
//		while(x>=1) {
//			if(x%3==0 && x%4==0) {
//				System.out.printf("%d ", x);
//			}
//			x--;
//		}
		
		
		// continue 예약어
		int i = 1;
		while (i <= 10) {
			if(i%3 == 0) {
				i++;
				continue;
			}
			System.out.println("i = "+i);
			i++;
		}
		
		
		
		
		
	}
}
