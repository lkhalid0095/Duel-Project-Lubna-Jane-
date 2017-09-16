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
		return false;
	}
//	public boolean isCharacterA(Object c) {
//		return c instanceof CharacterA;
//	}
	
	public boolean isDuel(Object c) {
		return c instanceof Duel;
	}
	
	public int getAction(Object caller) {
			return (int) (Math.random() * 3);

	}

	public void hit(Object caller) {
		if(isDuel(caller)) {
			this.hp= hp-10;
		}
		
	}
}	