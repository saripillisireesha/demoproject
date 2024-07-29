package interfaces;
interface siri{
	
		

	 public void like();
	 public void like1();
	 public void like2();
	  static void like3() {
	  }
}
class siri1 implements siri
{
	 public void like() {
		System.out.println("hiiiii");
	}
	 public void like1() {
			System.out.println("hithrtjryiiii");
		}
	 public void like2() {
			System.out.println("hihgjfyjtyijukjkiiii");
		}
	void no() {
		System.out.println("hellooo");
	}
	public void like3() {
		
		  System.out.println("hdshdiuha");

	}
}
class siri2 extends siri1{
	void display() {
		System.out.println("Welcome");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		siri2 ob=new siri2();
		ob.like();
		ob.no();
		ob.display();
		ob.like3();

			
		
	}

}
