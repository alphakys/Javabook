package book.wrapper;

public class Wrapper {
	public static void main(String[] args) {
	
		/*
		Integer ivalue = new Integer(100);
		
		int myValue = ivalue.intValue();
		
		System.out.println(myValue);
		
		Integer num1 = Integer.valueOf("100");
		Integer num2 = Integer.valueOf(100);
		
		int num = Integer.parseInt("100");
		
		System.out.println(num);
		
		
		
		Integer num1 = new Integer(100);
		
		int num2 = 200;
		
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		Integer num3 = num2;
		
		Integer n1 = new Integer(1);
		
		int n2 = n1.intValue();
		
		System.out.println(n2);
		
		Integer n3 = 17;
		
		int n4 = 7;
		
		System.out.println();
		
		String str = "a";
		
		int i = 5; 
        Integer i2 = new Integer(5);
        Integer i3 = 5;     //오토박싱
        int i4 = i2.intValue();
        int i5 = i2; 
		
        
		
		String str1 = new String("A");
        
		
		*/
		
		
		
		
		String str = "a";
		String str1 = "a";
		
		String str2 =str+str1;
		
		String str3 = "ab";
		
		String str4 = new String("a");
		
		System.out.println(str2);
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		int n =1;
		int n1 =1;
		
		Integer n2 = 1;
		
		
		
		
		System.out.println(System.identityHashCode(n));
		System.out.println(System.identityHashCode(n1));

		
		
		
		
		
		
		
		
	}
}
