
public class GameManager {
	public void play() {
		Player [] player = {new PlayerType1(),new PlayerType1(),new PlayerType1(),new PlayerType1(),new PlayerType1()};
		Enemy[] enemy = {new EnemyType1(),new EnemyType1(), new EnemyType1(), new EnemyType1(), new EnemyType1()};

		Random r = new Random();
		
		for (int i =0 ; i <999999; i++) {
			for (int playerIndex =0; playerIndex < player.length; playerIndex ++) {
			
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
				
				
			}
			for (int enemyIndex =0; enemyIndex < player.length; enemyIndex ++) {
				
				int attackTarget = r.nextInt(enemy.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
			
			}
		}
			boolean isPlayerLive = false;
			for (int playrtIndex = 0; playerIndex< player.length; playerIndex ++) {
				if(player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for (int enemytIndex = 0; enemyIndex< enemy.length; enemyIndex ++) {
				if(Enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println();
			}
	
