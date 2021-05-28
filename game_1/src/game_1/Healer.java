package game_1;

public class Healer extends Player{
	
	 public Healer() {
	      this.hp = 30;
	      this.mp = 100;
	      this.name = "힐러";
	   }

	   @Override
	   public void attack(Base player) {
	      if( this.mp >= 20) {
	         this.mp = this.mp - 20;
	         player.hp = player.hp + 20;
	         System.out.println(this.name + "은(는) " + player.name + "에게 20만큼 치유시켰습니다.");
	      } else {
	         System.out.println(this.name + "은(는) mp가 부족하여 치유할 수 없습니다.");
	      }
	   }
}
