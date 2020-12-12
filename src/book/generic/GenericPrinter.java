package book.generic;

import java.util.ArrayList;



public class GenericPrinter<T extends Materials> {
	
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
		
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	
	GenericPrinter<Powder> pPrinter = new GenericPrinter();
	
	pPrinter.setMaterial(new Powder());
		
	Powder powder = pPrinter.getMaterial();
	
	
	
	System.out.println(pPrinter);
	
	
	
		
	}
	
}
	
	
	
	
