package book.templatepractice;

public class Player {
	
	
	Level level;
	
	
	Player (){
		Level level = new BeginnerLevel();
		this.level = level;
	}
	
	
	public void play(int count) {
		level.go(count);
	}
	
	
	public void upgradeLevel(int count) {
		advancedLevel adL = new advancedLevel();
		
		superLevel supL = new superLevel();
		
		
		if(count>5 && count<=10) {
			level = adL;
		}
		else if(count>10) {
			level = supL;
		}
		
	}
	
	
}
