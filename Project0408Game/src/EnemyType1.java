
public class EnemyType1 extends Enemy {
	public EnemyType1() {
		this.hp = 100;
		this.power = 5;
		this.name = "에너미 타입 1";
	}
	
	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		player.hp = player.hp - damage;
		
		System.out.println(this.name + "은(는) " + player.name + "에게 " + damage + "의 피해를 입혔다.");
	}

}
