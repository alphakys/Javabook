package book.polymorphism;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("움직인다");
	}
}
	
class Human extends Animal{
		
	 public void move() {
		System.out.println("이족 보행");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다");
	}
	
	
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("움직인다");
	}
	
	public void hunting() {
		System.out.println("사냥");
	}
	
	
}
class Eagle extends Animal{
	
	public void move() {
		System.out.println("날아다닌다");
	}
	
	public void flying() {
		System.out.println("독수리가 날아요");
	}
	
}

public class AnimalTest{
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		
		AnimalTest aTest = new AnimalTest();
		
		aTest.addAnimal();
		
		
		
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		Animal ani = aniList.get(0);
		ani.move();
		
		
	}
	
	
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			
			ani.move();
		}
	}
	
	
	
	public void testCasting() {
		
		for(int i=0;i<aniList.size();i++) {
			
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				
				h.readBook();
			}
			
			
			else if(ani instanceof Tiger) {
				
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			
			else if(ani instanceof Eagle) {
				
				Eagle e = (Eagle)ani;
				e.flying();
			}
			
			
			else {
				System.out.println("지원되지 않는 형식입니다.");
			}
			
		
		}
		
		
	}
	
	
	
	
	
}







