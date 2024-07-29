package abstraction;
class X1{
//	public static int add(int a, int b) {
//		return a-b;	
		void demo() {
			System.out.println("parent class");
	}
}
	class Y extends X1{
//	public static int add(int a, int b) {
//		return a+b;	
		void demo() {
			System.out.println("child");
	}
	}
	class Z extends X1{
//	public static int add(int a,int b) {
//		return a*b;
		void demo() {
			System.out.println("sub child");
	}
}

public class Oveeriding extends X1{
	void demo() {
		System.out.println("sub inner child");
}

	public static void main(String[] args) {
//
//		Oveeriding ob=new Oveeriding();
//		ob.demo();
//Z ob=new Z();
//		ob.demo();
		Oveeriding ob=new Oveeriding();
		ob.demo();
		
				
		//System.out.println(ob.add(32,7));
		//System.out.println(ob.add(3,7));
		//System.out.println(ob.add(3,2));
	

	}

}
