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
		if(d.getHP() == hp) {
			return true;
		}
		else {
		return false;
		}
	}

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


