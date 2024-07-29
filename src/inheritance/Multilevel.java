package inheritance;
 class Animal1{
	 void dog() {
		 System.out.println("barking");
	 }
 }
 class Animal2 extends Animal1{
	 void cat() {
		 System.out.println("meowing");
	 }
 }
 class Animal3 extends Animal2{
	 void cow() {
		 System.out.println("eating");
	 }
 }
public class Multilevel extends Animal3 {
	void snake() {
		System.out.println("ssshhhhh");
	}
	public static void main(String[] args) {
		
		Multilevel oo=new Multilevel();
		oo.snake();
		oo.cow();
		oo.cat();
		oo.dog();

	}

}
