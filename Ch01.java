//01 Java 주석


//주석	: 프로그램 코드 내에 삽입된 사용자의 메모를 의미
// 		== > 코드 실행 결과에는 아무런 영향을 끼치지 않음.

//쓰는 이유 : 	1. 개발을 하다보면 코드 섹션(함수의 몸체)에 대한 설명이 필요함.
//			2. 협업할때, 다른 개발자와의 의사소통에 필요.


// ### 주석 사용법 ###
// // 		: 주석
// /* */	: 여러 줄 주석
// 단축키		: Ctrl + /



//02 JAVA의 기본 구조

public class Ch01 {			//클래스 영역 - 객체 지향 코드 구현 단위
	
	//public class Ch01	: 1. 하나의 public 클래스로 시작.
	//					  2. 클래스는 파일 이름과 동일해야 함.
	//					  3. 그 내부에 main 메서드가 포함되어야 함.
	
	public static void main(String[] args) {	// 메서드 영역 - 절차 지향 구현 단위, main 메서드의 선언부
		System.out.println("Hello Java");		// Hello Java를 모니터에 출력해줌
		
//		### 메서드의 정의와 종류 ###
//		0. 메서드(기능)		: 특정 기능 수행, C언어의 함수 개념과 유사
//		1. 메인 메서드		: 최초 실행되는 함수
//		2. 라이브러리 메서드	: 개발 편의를 위해서 미리 만들어져 제공되는 함수
//		3. 사용자 정의 메서드	: 개발자가 정의한(만든) 함수
		
//		0. main 메서드		: 프로그램의 진입점(Entry point), 자바 가상 머신(JVM)은 이 메서드를 찾아 실행
		
//		1. 중괄호 {}			: 내부에 프로그램 실행시 실행될 코드 작성 --> 프로그램의 로직 구성

		System.out.println("Hello Java");		// 출력 함수(메서드) 실행, Call이라고 함.
												// ';' : 코드의 마침표 역할
												// 모니터에 우리가 작성한 텍스트 (Hello Java)를 console창에 출력하는 역할
		
		
		// 03 ESCAPE 문자
//		'정보표시' 목적으로 사용된 기족 그래픽문자(영소문자, 숫자, 특수문자) 와는 다르게
//		'제어' 목적으로 사용되는 특수문자
		
//		ESCAPE 문자 사용법
//		\ (역슬래시)를 앞에 붙여 사용
		
//		1. \n	: 개행 (줄바꿈)
//		2. \b	: Back Space Key의 약어
//				--> 커서를 앞으로 1행 옮김

//		3. \r	: Carriage Return의 약어
//				--> 행의 처음으로 이동 (이때 Cmd, 즉 명령 프롬프트에서는 insert mode 작동)
		
//		4. \t	: Tap Key의 약어
//				--> 탭키만큼 칸 이동( 8칸 )
		
//		5. \'	: '(작은 따옴표) 출력
//		6. \"	: "(큰 따옴표) 출력
//		7. \\	: \ 출력 (폴더 경로 구분시 잘 사용 됨
		
		
//		## 표준 출력 함수 ##
//		System.out				: 출력
//		System.out.print()		: 줄바꿈 X, 출력
//		System.out.println()	: 줄바꿈 O, 출력
//		System.out.printf()		: 줄바꿈 X, 함수 출력		
		
//		문제 01)
//		console 창에 다음과 같은 결과가 나오도록 코딩해보세요 '-'
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
	
		System.out.println();
	
		
		
		
		// 서식이란?	: 서류를 꾸미는 일정한 양식.
		// 서식문자란?	: 서식공간에 자료를 대입하여 화면에 출력하거나 입력밭기 위한 용도의 문자
	
		//문제 02)
		//다음고 같이 출력합니다.
//		NO	이름	나이	성별	주소
//		1	이동하	26	M	대구
//		2 	코리아 	12 	W 	대구
//		3 	IT 	32 	M 	대구
		
		System.out.println("NO	이름	나이	성별	주소");
		System.out.printf("%d	%s	%d	%c	%s\n", 1, "이동하", 26, 'M', "대구");
		System.out.printf("%d 	%s 	%d 	%c 	%s\n", 2, "코리아", 12, 'W', "대구");
		System.out.printf("%d 	%s 	%d 	%c 	%s\n", 3, "IT", 32, 'M', "대구");
		
//		문제 03)
//		서식문자를 사용하여 다음과 같은 결과값을 출력해보세요!
		
	}
	
}
