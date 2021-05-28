
public class ExecClass {
	public static void main(String[] args) {
//		Triangle triangle = new Triangle("삼각형");
//		Base rec = new Base("사각형");
//		Base circle = new Base("원");

		
//		Base triangle = new Triangle ("삼각형");// 베이스에서 상속받았기 때문에 베이스로 지정이 가능함 
//		Base rec = new Rec ("사각형");
//		Base circle = new Circle ("원");
		

		Base[]= poligon = {new Triangle("삼각형"), new Rec("사각형"), new Circle("원")}; // 위랑 같은 것을 배열로 만들어준것임
		
		 for( i = 0 ; i < poligon.length; i++) {
			 poigon[i].inputData();
			 poigon[i].printSize();
		 }
		
//		triangle.inputData();
//
//		triangle.printSize();
//		rec.printSize();
//		circle.printSize();

	}
}
