package Ch13;

public class C03CarMain {
	// 6가지 속성 선언
	String brand;
	String model;
	int year;
	double price;
	int size;
	int weight;
	
	// 메서드
	public void CarInfo() {
		System.out.println("[SYSTEM} : 차 객체 정보를 출력합니다.\n");
		System.out.println("브랜드 : " + brand);
		System.out.println("모델 : " + model);
		System.out.println("연식 : " + year);
		System.out.println("가격 : " + price);
		System.out.println("크기 : " + size);
		System.out.println("무게 : " + weight);
	}
	
	// ### 메서드의 구조 ###
	// 1. 메서드의 헤더
	// public		void		CarInfo()	(	)		=> CarInfo()메소드는 매개변수X
	// 접근 제어자		반환 타입		메소드 명		( 매개 변수 )
	
	// 2. 메서드의 바디 (몸체)
	// {}
	
	// ### 접근 제어자 (Access modifire) ###
	// 1. public						: 어떤 클래스에서든 접근이 가능함.
	// 2. protected						: 동일한 패키지 내의 클래스와 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능함.
	// 3. default (package-private)		: 동일한 패키지 내의 클래스에서만 접근 가능함, 접근 제어자를 지정하지 않은 경우 기본으로 사용
	// 4. private						: 동일한 클래스 내에서만 접근 가능함.
	
	
	// public			: 모든 클래스에서 사용 가능
	// default			: 동일 패키지에 속한 클래스에서만 사용가능
	// private			: 현재 클레스에서만 접근 가능
	// protected		: 동일 패키지에 속한 클래스 or 상속관계에서 하위클래스에서만 접근가능
	
	
	
	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		C03CarMain myCar = new C03CarMain();
		
		// 속성 값 초기화
		myCar.brand = "아반떼";
		myCar.model = "cn7";
		myCar.year = 2022;
		myCar.price = 25555.55;
		myCar.size = 5;
		myCar.weight = 1335;
		
		//속성 확인
		myCar.CarInfo();
		
		// ### 함수 호출(function call)의 로직 ###
		// 1. 먼저 클래스에 대한 객체 생성
		// 2. 객체명과 '.'(온점)기호를 사용해 객체의 자료형(클래스)안에 있는 메소드 사용을 위해 main()함수에서 함수 이름 호출
		// 3. 클래스로 올라가 정의되어 있는 메소드 몸체의 코드를 실행
		// 4. 다시 main()함수에서 호출했던 위치(함수 이름 적은 부분)로 돌아와 "결과값 전달"

	}

}
