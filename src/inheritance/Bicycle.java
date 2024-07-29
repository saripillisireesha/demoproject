package inheritance;

class cycle {
 public int wheels() {
	 return 2;
 }
}
class bus extends cycle{

	 public int wheels() {
		 return 4;
	 }
	}
public class Bicycle  extends bus{

	 public int wheels() {
		 return 5;
	 }
	public static void main(String args[]) {
		cycle o=new bus ();
		System.out.println(o.wheels());
//		bus oo=new bus();
//		System.out.println(oo.wheels());
		
	}
}
