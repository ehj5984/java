
public class PlayerType1 extends Player {
	public PlayerType1() {
		this.hp = 20;
		this.power = 10;
	}
	
	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		enemy.hp = enemy.hp - damage;
	}

}
