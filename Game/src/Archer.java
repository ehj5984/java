

import java.util.Random;

// 송혁중
public class Archer extends Player {
	
	public Archer() {
		this.hp = 50;
		this.power = 10;
		this.defense = 3;
		this.name = "궁수";
	}
	
	@Override
	public void attack(Base enemy) {
		int damage;
		if (bonus()) {
			damage = this.power*2 - enemy.defense;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 치명상을 입혔다. (>>> 불화살 공격!!)");
		} else {
			damage = this.power - enemy.defense;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 피해를 입혔다.");
		}
		DeadOrLive(enemy);
	}
	
	public boolean bonus() {
		Random r = new Random();
		if (r.nextInt() >= 0.8) {
			return true;
		}
		return false;
	}

}
