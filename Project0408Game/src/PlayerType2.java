
public class PlayerType2 extends Player {
	PlayerType2(String name) {
		this.name = name;
		this.hp = 10;
		this.power = 10;
		this.defense = 1;
		this.type = "힐러";

	}

	@Override
	public void action( Base[] player, Base[] enemy) {
		Random r = new Random();
		System.out.println(this.name + "은 전체회복 마법을 썼다"
		// TODO Auto-generated method stub
		for(int i=0; i < player.length; i++) {
			if(player[i].isLive()) {
				player[i].hp = player[i].hp +r.nextInt(10);
		}
		}
	}

}
