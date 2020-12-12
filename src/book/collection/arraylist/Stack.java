package book.collection.arraylist;

import java.util.ArrayList;

public class Stack {
	
		
		ArrayList<String> stack;
		
		public Stack() {
			stack = new ArrayList<>();
			
		}
		
		
		
		public void push(String data) {
			
			stack.add(data);
			
		}
		
		
		public String pop() {
			
			int arrSize = stack.size();
			if(arrSize==0) {
				System.out.println("스택이 비었습니다.");
				return null;
			}
			
			int lastData = stack.size()-1;
			return stack.remove(lastData);
			
		}
		
		
		public int top() {
			
			int lastData = stack.size()-1;
			return lastData;
			
		}
		
		
		
		
		
	
	
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("d");
		stack.push("e");
		stack.push("c");
		
		for(String s : stack.stack) {
			
		}
		
		
		
	}

}
