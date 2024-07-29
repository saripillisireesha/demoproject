package inheritance;
 class Animal{
	 void dog() {
		 System.out.println("barking");
	 }
 }
public class Single extends Animal{
	void cat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
 Single o=new Single();
 o.cat();
o.dog();
	}

}
