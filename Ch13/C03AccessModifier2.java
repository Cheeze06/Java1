package Ch13;

public class C03AccessModifier2 {

	public static void main(String[] args) {
		//C03Accessmodifier의 인스턴스 생성
		C03AccessModifier myObject = new C03AccessModifier(1,2,3,4);
		
		// public 메서드 호출
		myObject.publicMethod();
		
		// protected 메서드 호출 (같은 패키지 내에서 가능)
		myObject.publicMethod();
		
		// default 메서드 호출 (같은 패키지 내에서 가능)
		myObject.defaultMethod();
		
		// private 메서드 호출 (동일 패키지 내에서 가능)
//		myObject.privateMethod();
		
		
		
		//C03AccessModifier의 필드에 접근
		System.out.println("Public Field : " + myObject.publicField);
		System.out.println("Protcted Field : " + myObject.protectedField);
		System.out.println("Default Field : " + myObject.defaultField);
		
		//private 필드는 클래스 내에서만 접근 가능
//		System.out.println("Private Field : " + myObject.privateField);
		
		
		myObject.setPervateField(5);
		System.out.println("Private Field : " + myObject.getPrivateField());
		
		
		
	}
}
