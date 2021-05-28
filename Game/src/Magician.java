

import java.util.Random;

public class Magician extends Player {
   public Magician() {
      this.hp = 100;
      this.mp = 150;
      this.power = 1;
      this.intel = 2;
      this.name = "마법사";
   }

   public void attack(Base enemy) {
      Random r1 = new Random();
      int spellNumber = r1.nextInt(2);
      
      int damage = this.power - this.defense;
      enemy.hp = enemy.hp - damage;
      
      if (this.mp > 30 && spellNumber == 0) {
         this.mp = this.mp - 30;
         enemy.hp = enemy.hp - intel * 5;
         System.out.println((this.name + "은(는) " + enemy.name + "에게 메테오를 시전하여 " + (intel*5) + "의 피해를 주고 구워버렸다!"));
         
      }
      
      else if ((this.mp > 15 && spellNumber == 1) || mp == 15) {
         this.mp = this.mp - 15;
         enemy.hp = enemy.hp - intel * 3;
         System.out.println((this.name + "은(는) " + enemy.name + "에게 고드름 떨구기를 시전하여 " + (intel*3) + "의 피해를 주고 얼려버렸다!"));
      }
      
      if (this.mp < 15) { 
         System.out.println(("아... 마나가 없다. " +  this.name + "은(는) " + enemy.name + "를 지팡이로 때려 " + damage + " 의 피해를 주었다!"));
      }
   }
}
