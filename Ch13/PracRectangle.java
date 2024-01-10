package Ch13;

import java.util.Scanner;

// 문제 1: 사각형 클래스 만들기


// 1. Rectangle 클래스를 작성하세요.
// 2. width와 height라는 두 개의 속성(멤버 변수)을 가지도록 클래스를 구성하세요
// 3. 생성자를 통해 width와 height를 초기화 하세요
// 4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요.
// 5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요.
public class PracRectangle {

	private int width;
	private int height;
	
	public PracRectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void getArea(int a, int b) {
		System.out.printf("사각형의 넓이: %d\n", a*b);
	}
	
	public void getPerimeter(int a, int b) {
		System.out.printf("사각형의 둘레: %d\n", (a+b)*2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PracRectangle aaa = new PracRectangle(1, 2);
		
		aaa.width = sc.nextInt();
		aaa.height = sc.nextInt();
		
		aaa.getArea(aaa.width, aaa.height);
		aaa.getPerimeter(aaa.width, aaa.height);
		
	}

}
