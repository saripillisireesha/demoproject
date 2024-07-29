package abstraction;
class X{
	public static int add(int a, int b) {
		return a-b;	
	}
	public static int add(int a, int b,int c) {
		return a+b+c;	
	}
	public static int add(int a,int b,int c,int d) {
		return a*b*c*d;
	}
}
public class Overlaoding{
	public static void main(String[] args) {
		X ob=new X();
		System.out.println(ob.add(32,7));
		System.out.println(ob.add(3,7,8));
		System.out.println(ob.add(3,2,4,7));
	}
}
