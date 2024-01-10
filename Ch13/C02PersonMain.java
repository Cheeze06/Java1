package Ch13;

class Person{
	// 3가지 속성
	String name;
	int age;
	String addr;
	
	// 3가지 메서드
	void walk() {
		System.out.println(name + "이/가 걷습니다!");
	}
	
	void eat() {
		System.out.println(name + "이/가 밥을 먹습니다!");
	}
	
	void PersonInfo() {
		System.out.println("[SYSTEM] : 객체 정보를 출력합니다.");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("주소 : %s\n", addr);
		System.out.println();
	}
}

public class C02PersonMain {
	public static void main(String[] args) {
		// 속성 접근
		Person hong = new Person();
		Person su = new Person();
		
		hong.name = "홍길동";
		hong.age = 23;
		hong.addr = "서울";
		
		su.name = "수길동";
		su.age = 66;
		su.addr = "대구";
		
		hong.walk();
		hong.eat();
		hong.PersonInfo();
		
		su.walk();
		su.eat();
		su.PersonInfo();
		
		
		
		
		
		
		
		
	}
}
