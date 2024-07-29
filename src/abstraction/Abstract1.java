package abstraction;
abstract class Demo{
	 void div(int a, int b) {
		 int c=a/b;
		 System.out.println(c);
	 }
	 abstract void add(int a ,int b);
	abstract void sub(int a ,int b);
	abstract void mul(int a ,int b);
		}
class Demo1 extends Demo{
	void add(int c, int d) {
	int e=c+d;
	System.out.println(e);
	}
	void sub(int c, int d) {
		int e=c-d;
		System.out.println(e);
}
	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	}
class Demo2 extends Demo1{
	void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}

}

public class Abstract1 {

	public static void main(String[] args) {
		Demo1 ob=new Demo1();
			ob.add(15,9);
			ob.sub(15,9);
			Demo2 ob1=new Demo2();
			ob.div(8, 4);
ob1.mul(2, 4);
	}

}
