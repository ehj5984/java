public class RunClass {
	public static void main(String[] args) {
		// 비교 연산자와 논리연산자는 참 거짓으로만 나옴

		int a = 4;

		boolean r1 = 3 == 4; // 3하고 4는 같아?
		boolean r2 = 3 == 3;
		System.out.println(r1);
		System.out.println(r2);

		r1 = a > 10; //여러개의 조건을 만족해야 하는 경우를 만들기 위해 앤드 및 오어 형태가 생긴것 
		System.out.println(r1);

		r1 = a <= 10;
		System.out.println(r1);

		r1 = a != 2; // 다르다라는 기호 != 언어에 따라 다르다 표시 다른 <> 이렇게 쓰는 것도 있음
		System.out.println(r1);

		r1 = a > 10 && a == 20; // false && false 앤드연산자 and 두가지 다 만족할 때
		System.out.println(r1);

		r1 = a < 10 && a % 4 == 0; // a가 10 보다 작으면서 4로 나눴을 때 0이냐
		System.out.println(r1);  //true && true

		r1 = a == 10 || a < 10; // false || true 오어 연산자 or 둘 중 하나 만족할 때
		System.out.println(r1);

		r1 = true && true;
		System.out.println(r1);

		r1 = false || false; // false가 떨어짐
		System.out.println(r1); // 한조건만 만족하면 되는 경우는 오어로 묶어주면 됨

		r1 = !false; // !(a<10); 반전시켜주는 것이야 a가 10보다 크거나 같음을 표현함
		System.out.println(r1);

	}
}
