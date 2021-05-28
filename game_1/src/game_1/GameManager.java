package game_1;

import java.util.Random;

public class GameManager {

	public void play() {
		Player[] player = { new Archer(), new Gunman(), new AssassinHyejin(), new Magician(), new Healer() };
		Enemy[] enemy = { new EnemyType1("적1"), new EnemyType1("적2"), new EnemyType1("적3"), new EnemyType1("적4"),
				new EnemyType1("적5") };

		Random r = new Random();
		for (int i = 0; i < 99999; i++) {

			System.out.println("" + (i + 1) + "턴");
			// 플레이어 턴

			System.out.println("[Player]");
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (playerIndex == 4) {
					int healTarget = r.nextInt(player.length);
					if (player[playerIndex].isLive()) {
						player[playerIndex].attack(player[healTarget]);
					}
				} else {
					int attackTarget = r.nextInt(enemy.length);
					if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
						player[playerIndex].attack(enemy[attackTarget]);
					}
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			// 적 턴
			System.out.println("=====================");
			
			System.out.println("[Enemy]");
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
				}
			}

			// 게임 종료여부 확인
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
				System.out.println("\n\n☆★☆★☆★ 플레이어 승리 ☆★☆★☆★");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}

			System.out.println("\n");

		}

	}
}
