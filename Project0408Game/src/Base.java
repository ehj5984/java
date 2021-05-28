
public abstract class Base {
	int hp;
	int power;
	int defense;
	String name;
	String type; 
	
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}	
	
//	public abstract void action(Base enemy);
	public abstract void action(Base target, Base[] player, Base[] enemy) ;
//	여러개 받아야하니까 배열 변수로 들어옴

	public void action(Base[] player, Base[] enemy) {
		// TODO Auto-generated method stub
		
	}
}
