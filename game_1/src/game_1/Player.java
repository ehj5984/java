package game_1;

public abstract class Player extends Base {

	public abstract void attack(Base enemy);

	public void DeadOrLive(Base enemy) {
		if (!enemy.isLive()) {
			System.out.println("<< " + enemy.name + " 사망!! >>");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
