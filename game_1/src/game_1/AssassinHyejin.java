package game_1;

import java.util.Random;

// 이혜진
public class AssassinHyejin extends Player {

	Random random = new Random();

	public AssassinHyejin() {
		this.hp = 100;
		this.defense = 3;
		this.name = "암살자";

	}

	@Override
	public void attack(Base enemy) {
		this.power = random.nextInt(30) + 1;

		if (this.power < 30) {
			int damage = this.power - enemy.defense;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "은(는)" + enemy.name + "에게 " + damage + "의 피해를 입혔다.");
		}

		else if (this.power == 30) {
			int damage = this.power;
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "이(가) " + enemy.name + "를(을) 죽였다.");

		}
		DeadOrLive(enemy);
	}
}
