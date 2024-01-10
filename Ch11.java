import java.util.Scanner;

public class Ch11 {

	public static void main(String[] args) {
		
		// 제어문 - break
		// 제어문은 반복문과 조건문에 필터링 기능을 부여하는 방법
		// 1. 반복문 탈출에 사용
		// 2. switch문 Case 탈출에 사용
		
		
		// ### break와 continue의 차이점
		// break는 소속된 코드 블럭을 즉시 탈출
		// continue는 소속된 코드블럭(현재 실행중인 반복문)을 무시하고 조건식으로 돌아가 다음 반복을 실행.
		
		//문제 01) 1부터 100까지의 수 중에서 5의 배수만 더하고, 50을 넘어가면 반복문을 중단.
		int i = 1;
		int sum = 0;
		while(i<=100) {
			if(i> 50) {
				break;
			}
			else if(i%5 == 0) {
				System.out.println();
				sum += i;
				i++;
				continue;
			}
			else {
				System.out.printf("%d ", i);
				i++;
			}
			
		}
		System.out.println();
		System.out.printf("5의 배수의 합: %d", sum);
	}

}
