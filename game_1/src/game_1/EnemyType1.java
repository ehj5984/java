package game_1;

public class EnemyType1 extends Enemy {
	
	public EnemyType1(String name) {
		this.hp = 30;
		this.power = 5;
		this.defense = 2;
		this.name = name;
	}

	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		player.hp = player.hp - damage;
		System.out.println(this.name + "은(는) " + player.name + "에게 " + damage + "의 피해를 입혔다.");

		
		DeadOrLive(player);
	}

}
