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
}


