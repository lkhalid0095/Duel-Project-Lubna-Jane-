package duel;

public class CharacterA implements Dueler{

	private int hp;
	private int action;
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
	    return actionNow;
		
	}

	public void hit(Object caller) {
		if(isDuel(caller)) {
			this.hp= hp-10;
		}
		
	}
}	
/*  int keywordLength=keyword.length(); String letter1; String letter2;
if(psn==0) {
	   letter1=s.substring(keywordLength, keywordLength+1);
	   if(letter1.compareTo("a")<0)
	   {
		   return true;
	   }
	   return false;	   
}
if(psn+keywordLength==s.length()) {
	   letter1=s.substring(psn-1, psn);
	   if(letter.compareTo('a')<0)
	   {
		   return true;
	   }
	   return false;
}
letter1=s.substring(psn-1, psn);
letter2=s.substring(keywordLength+psn, keywordLength+psn+1);
if(letter1.compareTo("a")>=0||letter2.compareTo("a")>=0)
{
	return false;
}
return true;
}



if(!psn<4)
{
	String negation1=s.substring(psn-3, psn-1);
	String negation1=s.substring(psn-4, psn-1);
	if(negation1.equals("no")||negation2.equals("not")
	{
		return false;
	}
	}
	return true;
	}
}

*/