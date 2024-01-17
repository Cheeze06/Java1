package Ch14;

public class C02StringClass {
	public static void main(String[] args) {
		// 1
		String str1 = "java";
		String str2 = "java";
		
		// 2
		String str3 = new String("java");
		String str4 = new String("java");
		
		// == 연산 : 객체의 주소값을 비교
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println();
		
		
		// equals() : 객체의 내용을 비교
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println();
		
		
	
		
		
		// ### HashCode() ###
		// 객체의 내용에 기반하여 해시 코드를 생성
		// Object 클래스에서 상속받은 메서드로, 모든 객체에서 사용할 수 있음
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		
		// ### System.identityHashCode() ###
		// 객체의 실제 메모리 주소(객체의 물리적 위치)를 기반으로 하는 해시 코드를 반환.
		// Object 클래스의 메서드로, 모든 객체에서 사용할 수 있음.
		// 따라서 동일한 객체라도 두 번 생성되면 다른 메모리 주소를 가지므로, 서로 다른 identityHashCode 값을 반환.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		// 서로 동일한 해시코드 값을 가지지만 서로 다른 객체가 될 수 있다? O or X ==> O
		
		
		
	}

}
