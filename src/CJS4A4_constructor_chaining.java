
public class CJS4A4_constructor_chaining {
	public static void main(String []s){
		child_1 c1 = new child_1(); 
		child_2 c2 = new child_2(); 
	}
}


class parent_with_default_constructor{

	parent_with_default_constructor(){
		System.out.println("This is Parent Class with default constructor");
	}	
}

class child_1 extends parent_with_default_constructor {
	
	child_1(){
		// For parent class with default constructor, invoking child constructor automaticaly invokes parent default constructor.
		System.out.println("This is Child_1 Class constructor");
	}
}

class parent_with_constructor_parameters{

	parent_with_constructor_parameters(int a,String name){
		System.out.println("This is Parent Class with constructor parameters");
	}	
}

class child_2 extends parent_with_constructor_parameters {
	
	child_2(){
		// For parent class with constructor having parameters, you need to explicitly call parent class constructor using super.
		super(23,"Hello World"); // Explicitly calling super class constructor.
		System.out.println("This is Child_2 Class constructor");
	}
}