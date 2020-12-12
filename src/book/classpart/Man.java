package book.classpart;

public class Man {
			
	
	public int age;
	public String name;
	public boolean married;
	public int children;
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public static void main(String[] args) {
		
		Man james = new Man();
		
		james.age = 40;
		james.name = "james";
		james.children = 3;
		james.married = true;
		
		
		System.out.println(james.age);
		System.out.println(james.age);
		System.out.println(james.age);
		System.out.println(james.children);
		
		
		
		System.out.println(james.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
