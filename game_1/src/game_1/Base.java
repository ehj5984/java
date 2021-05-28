package game_1;

public class Base {
	int hp;
	int mp;
	int power;
	int intel;
	int defense;
	String name;
	
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		else return true;
	}
	
	
}
