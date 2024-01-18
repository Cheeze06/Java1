package Ch13;

//문제 1: 사각형 클래스 만들기

//1. Rectangle 클래스를 작성하세요.
//2. width와 height라는 두 개의 속성(멤버 변수)을 가지도록 클래스를 구성하세요. ==> 접근 제어자 : private
//3. 생성자를 통해 width와 height를 초기화하세요.
//4. getArea() 메소드를 구현하여 사각형의 넓이를 반환하세요.
//5. getPerimeter() 메소드를 구현하여 사각형의 둘레를 반환하세요.

public class PracRectangle {
	// 2가지 속성
	private double width;
	private double height;

	// 디폴트 생성자
	public PracRectangle() {

	}

	// 매개변수 생성자
	public PracRectangle(double width, double height) { 
		this.width = width;
		this.height = height;

	}
	
	// 넓이 반환 메서드
	public double getArea() {
		double result = width * height;
		return result;
		
		
	}
	
	
	// 둘레 반환 메서드
	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public static void main(String[] args) {
		PracRectangle rec = new PracRectangle(4.0, 5.0);
		double result = rec.getWidth() * rec.getHeight();
		double result1 = (rec.getWidth() + rec.getHeight()) * 2;
		System.out.println("넓이 : " + result);
		System.out.println("둘레 : " + result1);
	}

}
