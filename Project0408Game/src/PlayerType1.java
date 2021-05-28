
public class PlayerType1 extends Player {
	public PlayerType1() {
		this.name = name;
		this.hp = 100;
		this.power = 10;
		this.defense = 1;
		this.type = "타입 1";
	}

	public void action(Base target, Base[] player, Base[] enemy) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Base target = null;

		for (int i = 0; i < 9999; i++) {
			int randNumber = r.nextInt(enemy.length);

			if (enemy[randNumber].isLive()) {
				target = enemy[randNumber];
				break;
			}
		}
		if (target != null) {
			int damage = this.power - target.defense;
			System.out.println(this.name + "이 (가)" + target.name + "을 (를) 공격해서 " + damage + "의 피해를 입혔다");
			target.hp = target.hp - damage;

			if (target.hp < 1) {
				System.out.println(target.name + "은 파괴되었다");
			}
		}
	}
}
