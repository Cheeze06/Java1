import java.util.Scanner;

public class Ch09 {

	public static void main(String[] args) {

		
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함.
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.
		
		
//		while (조건) {
//			반복 실행 코드;			// 예) 조건이 참이면 코드 실행
//								//     조건이 거짓이면 반복문 종료
//		}
		
		
//		System.out.println("--------------- while문 예제 01 ---------------");
////      	// 탈출용 변수
//     		int i = 1;
//
// 		// 탈출용 조건식
//      	while (i <= 10) {
//          		System.out.println("Hello World");
//          		i++;  // 탈출을 위한 연산식
//          
//      	}
      
      
      
      		System.out.println("--------------- while문 예제 02 ---------------");
//    		1부터 10까지의 합 구하기
//    		int i = 1;
//    		int sum = 0;
//
//  		  while (i <= 10) {
//        		System.out.println("i = " + i);
//        		sum += i; 							// sum = sum + i;
//   			i++;      							// 후치연산
//    		}	
//
//  		System.out.println("while 종료 후 i의 값 = " + i);
//   		System.out.println("1부터 10까지의 합 = " + sum);
      
      
      
//    		1부터 N(입력한 수)까지의 합 구하기
//      	System.out.println("정수 N을 하나 입력하세요, 제가 1부터 N까지의 수의 합을 구해드릴게요!");
//      	Scanner sc = new Scanner(System.in);
//      	int n = sc.nextInt();
//      
//      	int i = 1;
//      	int sum = 0;
//      
//      	while(i <= n) {
//    			sum += i;				// N까지 반복하면서 i를 
//    			i++;					// 증가하면서 sum이라는 변수 공간에 저장
//      	}
//      
//      	System.out.println("[SYSTEM] : 1부터 " + n + "까지의 수의 합은 " + sum + "입니다.");
      
      
      
      
      
    		//문제
     		System.out.println("--------------- while문 문제 01 ---------------");
      		//정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
      		//이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
      
      
      
//		System.out.println("정수1을 입력하세요 >>> ");
//		int num1 = scanner.nextInt();
//		int num11 = num1;
//	
//		System.out.println("정수2를 입력하세요 >>> ");
//		int num2 = scanner.nextInt();
//		int num21 = num2;
//	
//		int sum1 = 0;
//	
//		if (num2 > num1) {
//			while (num11 <= num2) {
//				sum1 += num11;
//				num11++;
//			}
//			System.out.printf("%d부터 %d까지의 합은 %d입니다.", num1, num2, sum1);
//		}
//		else if (num1 >= num2) {
//			while (num21 <= num1 ) {
//				sum1 += num21;
//				num21++;
//			}
//		System.out.printf("%d부터 %d까지의 합은 %d입니다.", num2, num1, sum1);
//		}
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

		//03  while - 무한 루프 이용하기
      		System.out.println("--------------- while - 무한 루프 예제 ---------------");
   		// 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
   		// 값이 -1이라면 프로그램 종료 !!
      
      		Scanner sc = new Scanner(System.in);
      		int num;
      		int sum = 0;
      
      		while(true) {
    	  		System.out.println("정수를 하나 입력해요!! 단, -1을 입력한다면 종료시킬껍니다!!");
    	  		num = sc.nextInt();
    	  
    	  		if(num == -1) {
	    		  	break;
    			}
    	 		sum += num;   	  
      		}
      
      		System.out.println("여러분이 입력한 수들의 합은 " + sum);
		
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
