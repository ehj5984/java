package game_1;

import java.util.Random;

// 박영선
public class Gunman extends Player {

	Random r = new Random();

	public Gunman() {
		this.hp = 50;
		this.name = "총잡이";
	}

	// 공격 속성 구현
	@Override
	public void attack(Base enemy) {
		this.power = r.nextInt(10) + 10;
		
		if (this.power < 15) { // 평범한 공격
			int damage = this.power - enemy.defense;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 피해를 입혔다.");
		} else { // 적에게 최대치의 공격을 입힌다
			int damage = this.power;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "은(는) " + enemy.name + "에게 " + damage + "의 치명상을 입혔다. (>>> 헤드샷 공격!!)");
		}
		DeadOrLive(enemy);
	}

}
