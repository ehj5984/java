import java.util.Random;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1(), new PlayerType1(), new PlayerType1(), new PlayerType1(), new PlayerType1()};
		Enemy[] enemy = {new EnemyType1(), new EnemyType1(), new EnemyType1(), new EnemyType1(), new EnemyType1()};
		
		Random r = new Random();
		for (int i = 0; i < 999999; i++) {
			System.out.println("" + (i + 1) + "턴\n\n");
			// 플레이어 턴
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
			}
			// 적 턴
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
				}
			}
			// 게임 종료 여부 확인
			boolean isPlayerLive = false;
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
