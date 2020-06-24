class A{
	void m() {
		System.out.println("hi");
	}
	{
		System.out.println("in A");
	}
}
class B extends A{
	void n()
	{
		System.out.println("hello");
	}
	B()
	{
		
		System.out.println("people");
	}
	{
		System.out.println("Demo");
	}
}

public class Person {
	public static void main(String[] args) {
		
	B b=new B();
	b.n();
	
	
	}

}



