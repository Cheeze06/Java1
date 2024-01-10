package Ch13;


// 문제 2: 학생 클래스 만들기

// 1. Student  클래스를 작성하세요
// 2. name과 age라는 두개의 속성을 가지도록 클래스를 구성하세요.
// 3. 객체의 속성 name과 age에 각각 직접 값을 초기화 하세요.
// 4. displayInfo() 메소드를 구현하여 학생의 정보를 출력하세요.

public class PracStudent {
	
	String name;
	int age;
	
	public void displayInfo() {
		System.out.println("----- "+name + " 학생의 정보 -----");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	public static void main(String[] args) {
		PracStudent park = new PracStudent();
		PracStudent lee = new PracStudent();
		
		park.name = "박혁거세";
		park.age = 22;
		
		lee.name = "이성계";
		lee.age = 23;
		
		park.displayInfo();
		System.out.println();
		lee.displayInfo();

	}

}
