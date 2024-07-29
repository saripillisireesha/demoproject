package inheritance;
class Animals1{
	 void dog() {
		 System.out.println("barking");
	 }
}
class Animals2 extends Animals1{
	 void cat() {
		 System.out.println("meowing");
	 }
}
class Animals3 extends Animals1{
	 void cow() {
		 System.out.println("eating");
	 }
}
public class Heirarical extends Animals1 {
	void snake() {
		System.out.println("ssshhhh");
	}

	public static void main(String[] args) {
		
Heirarical ooo=new Heirarical();
ooo.snake();
Animals3 o=new Animals3();
	o.cow();
	}
}
