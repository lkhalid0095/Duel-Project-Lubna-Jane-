package duel;


public class CharacterB implements Dueler{
	
	private int hp;
	public CharacterB() {

	}
	
	public String getName() {
		return "Spider-Man";
	}
	
	public void taunt() {
		System.out.println("You are so awful.Yeah!");
	}

	public void setStartingHP(int hp){
		this.hp=hp;
	}
	public int getHP() {
		return hp;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return false;
	}

	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void hit(Object caller) {
		// TODO Auto-generated method stub
		
	}
}

