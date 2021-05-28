import java.util.Scanner; //이혜진class
//수치 입력 inputData
//넓이 계산 calcArea

public class Rec extends Base {

   double lowerline;
   double height;
   double calcarea;

   Rec(String name) {
      super(name);

   }

   @Override
   public void inputData() {
      // TODO Auto-generated method stub
      super.inputData();
      Scanner scanner = new Scanner(System.in);

      System.out.println("밑변을 입력해주세요");
      String inputText = scanner.nextLine();
      lowerline = Double.parseDouble(inputText);

      System.out.println("높이를 입력해주세요");
      inputText = scanner.nextLine();
      height = Double.parseDouble(inputText);

   }
   
   @Override
   public void calcArea() {
      // TODO Auto-generated method stub
      this.calcArea = this.lowerline * this.height;
   }
    
}