package duel;


public class CharacterB implements Dueler{
	
	private int hp;
	private int action;
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
		int actionNow = 3; boolean isLoaded = false;
		if(isDuel(caller))
		{	
		 this.action= (int) (Math.random() * 3);
		 actionNow = this.action;
		 if(this.action == 0 )
		 {
			 isLoaded = true;
		 }
		 if(!isLoaded)
		 {
			 if(actionNow==1)
			 {
				 if((int) (Math.random() * 2)==0)
				 {
					 actionNow=2;
				 }
				 else
				 {
					 actionNow=0;
					 isLoaded=true;
				 }
			 }
		 }
		}	
	    return actionNow ;
	}

	public void hit(Object caller) {
		if(isDuel(caller)) {
			this.hp= hp-10;
		}
		
	}
}


