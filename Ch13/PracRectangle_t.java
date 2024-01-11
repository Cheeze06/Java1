package Ch13;

public class PracRectangle_t {
	//2가지 속성
	private double width;
	private double height;
	
	//디폴트 생성자
	public PracRectangle_t() {
		
	}
	
	public PracRectangle_t(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// 둘레 반환 메서드
	public double getArea() {
		double result = width * height;
		return result;
	}
	
	// 넓이 반환 메서드
	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}
	
	public static void main(String[] args) {

		PracRectangle_t rec = new PracRectangle_t(4.0, 5.0);
		System.out.println(rec.width);
		System.out.println(rec.height);
		System.out.println("넓이: " + rec.getArea());
		System.out.println("둘레: " + rec.getPerimeter());

	}

}
