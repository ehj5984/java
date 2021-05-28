

public abstract class Enemy extends Base {

	public abstract void attack(Base player);
	
	public void DeadOrLive(Base player) {
		if (!player.isLive()) {
			System.out.println("<< " + player.name + " 사망!! >>");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
