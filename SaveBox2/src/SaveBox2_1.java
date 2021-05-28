
public class SaveBox2_1 {
	int coins = 0;
	int moneyGood = 0;
	String messages = new String();
	
	public void deposit(int value) {
		coins = coins + value ;
	}

	public void withdraw( ) {
		System.out.println(coins);
	}
}
