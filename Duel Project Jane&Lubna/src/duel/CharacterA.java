package duel;

public class CharacterA implements Dueler{

	private int hp;
	public CharacterA(){
		//In Java, fields are instantiated in a constructor
	
	}
	
	public void taunt() {
		System.out.println("You can never beat me!");
	}

	public String getName() {
		
		return "WonderWoman";
	}

	public void setStartingHP(int hp) {
		
		this.hp=hp;
	}

	public int getHP() {
		
		return hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {

		if (d.getHP()==hp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isCharacter
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		return 1;
	}

	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}
}	