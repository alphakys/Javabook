package book.thisex;

class Person{
	
	String name;
	int age;
	double height;
	double weight;
	
	
	Person(String name, double weight){
		this.name = name;
		this.weight = weight;
		
	}
	
	
	Person(){
		this("d",12);
	}
	
	Person returnItself() {
		return this;
	}
	
	
	void set() {
		
	}
	
	
	
	
}









public class CallAnotherConst {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Person noName = new Person();
				System.out.println(noName.name);
				System.out.println(noName.age);
		
		
				Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
		
	}

}
