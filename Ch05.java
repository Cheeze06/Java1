import java.util.Scanner;


public class Ch05 {

	public static void main(String[] args) {
		// 00 입력문 (값 입력 받기, Scanner)
		
		//System.out	: 표준 출력 스트림 생성 - 모니터
		//System.in		: 표준 입력 스트림 생성 - 키보드
		
		
		Scanner sc = new Scanner(System.in);
		// Scanner 장치를 생성해 사용할 수 잆도록 참조변수 sc 생성 및 연결
		
		
		/*
		System.out.println("----- Scanner 예제1 -----");
		System.out.println("정수를 하나 입력하세요 >>>");
		String s = sc.nextLine();
		// next()		: 한 문자열(단어), 띄워쓰기 기준으로 한 문자열만 가능
		// nextLine()	: 한 줄
		// nextInt()	: 숫자로 나옴. 대신 변수 앖에 String이 아니라 int로 적어야함
		
		System.out.println(s + "!!!");
		*/
		
		
		/*
		System.out.println("----- Scanner 예제2 -----");
		System.out.println("정수 세개를 입력해주세요 >>>");
		
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		int int3 = sc.nextInt();
		
		System.out.println("첫번째 숫자: " + int1);
		System.out.println("두번째 숫자: " + int2);
		System.out.println("세번째 숫자: " + int3);
		*/
		
		System.out.println("--------------- Scanner 버퍼 비우기 예제 ---------------");
		System.out.printf("수 입력 : ");
		int num = sc.nextInt();
		
		// 수를 입력받고 문자열을 입력받을시에는
		// 꼭 sc.nextLine(); 이 코드를 삽입함으로써 Enter 문자를 상쇄시켜줘야함.(버퍼를 비워줘야함) 
		sc.nextLine(); 			// 위 nextInt() 메서드의 Enter를 상쇄, 버퍼를 비우기.
		
		System.out.print("문자열 입력(띄워쓰기포함 문자열) : ");
		String str2 = sc.nextLine();				//문자열입력받기기능함수, 띄어쓰기도 포함한다.
		
		
//		문제 01)
		//직사각형 가로와 세로 값을 사용자로부터 입력받고
		//직사각형의 둘레와 넓이를 구하는 프로그램을 구현해보세요
		//직사각형의 둘레 = (가로길이 + 세로길이) * 2
		//직사각형의 넓이 = 가로길이 * 세로 길이
		
		System.out.println("가로 길이를 입력해주세요 :");
		int int1 = sc.nextInt();
		System.out.println("세로 길이를 입력해주세요 :");
		int int2 = sc.nextInt();
		
		System.out.println("직사각형의 둘레 : " + (int1 + int2)*2);
		System.out.println("직사각형의 넓이 : " + int1*int2);
		
//		문제 02)
		//이름일 입력하세요? 홍길동
		//홍길동 님의 나이를 입력하세요? 24
		//홍길동 님의 주소를 입력하세요? 대구광역시 반월 센트럴타워
		//홍길동 님의 나이는 24세 주소는 대구광역시 반월 센트럴타워 입니다.
		
		System.out.println("이름을 입력하세요? ");
		String name = sc.next();
		
		System.out.println(name + "님의 나이를 입력하세요? ");
		int age = sc.nextInt();
		
		System.out.println(name + "님의 주소를 입력하세요? ");
		String home = sc.nextLine();
		home = sc.nextLine();
		
		System.out.println(name + "님의 나이는 "+age+"세 주소는 " + home + "입니다.");
		System.out.printf("%s님의 나이는 %d세, 주소는 %s입니다.", name, age, home);
		
		
		
				
		
	}

}
