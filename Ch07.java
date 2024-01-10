import java.util.Scanner;

public class Ch07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수를 입력해주세요: ");
//		int i = sc.nextInt();
//		
//		if(i%3 == 0) {
//			System.out.printf("%d는 3의 배수입니다.", i);
//			System.out.println();
//		}
////		else {
////			System.out.printf("%d는 3의 배수가 아닙니다.", i);
////		}
//		if(i%3 != 0) {
//			System.out.printf("%d는 3의 배수가 아닙니다.", i);
//			System.out.println();
//		}
		
		
		
		//if-else 문제 1
//		System.out.println("두 수를 입력해주세요: ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if((num1+num2)%2 == 0) {
//			System.out.println("두 수의 합은 짝수입니다.");
//			System.out.println();
//		}
//		else {
//			System.out.println("두 수의 합은 홀수입니다.");
//			System.out.println();
//		}
		
		
		
		//if-else 문제 2
//		System.out.println("정수를 입력해주세요: ");
//		int num = sc.nextInt();
//		
//		if(num >= 2 && num<=20) {
//			System.out.println("숫자가 2~20 사이에 있습니다.");
//		}
//		else {
//			System.out.println("범위를 벗어났습니다.");
//		}
		
		
		
//		System.out.println("정수 한개를 입력해주세요. : ");
//		int a = sc.nextInt();
//		if(a%2==0) {
//			if(a%3==0) {
//				System.out.println(a + "는 짝수이면서 3의 배수입니다.");
//			}
//			else {
//				System.out.println(a + "는 짝수이긴 한데 3의 배수가 아닙니다.");
//			}
//		}
//		else {
//			System.out.println(a+"는 짝수, 3의 배수도 아닙니다.");
//		}
		
//		System.out.println("정수 한개를 입력해주세요. : ");
//		int b = sc.nextInt();
//		if(b%2 != 0) {
//			if(b%5 == 0) {
//				System.out.println(b+"는 홀수이면서 5의 배수입니다.");
//			}
//			else {
//				System.out.println(b+"는 홀수이긴 한데 5의 배수가 아닙니다.");
//			}
//		}
//		else {
//			System.out.println(b+"는 홀수, 5의 배수가 아닙니다.");
//		}
		
		
		
//		System.out.println("정수 한개를 입력해주세요. : ");
//		int c = sc.nextInt();
//		if(c%2==0 && c%3==0) {
//			System.out.println(c+"는 짝수이면서 3의 배수입니다.");
//		}
//		else {
//			System.out.println(c+"는 짝수 혹은 3의 배수가 아닙니다.");
//		}
		
		
//		System.out.println("정수 한개를 입력해주세요. : ");
//		int d = sc.nextInt();
//		if(d%2==0 && d%3==0) {
//			System.out.println(d+"는 짝수이면서 3의 배수입니다.");
//		}
//		else {
//			System.out.println(d+"는 짝수 혹은 3의 배수가 아닙니다.");
//		}
		
		
		
		System.out.println("시험 점수를 입력하세요: ");
		int tot = sc.nextInt();
		if(tot >= 90) {
			System.out.println("A");
		}
		else if(tot >= 80) {
			System.out.println("B");
		}
		else if(tot >= 70) {
			System.out.println("C");
		}
		else if(tot >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
	}

}
