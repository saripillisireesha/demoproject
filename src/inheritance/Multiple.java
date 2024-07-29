package inheritance;
interface Ani{
	void dog() ;
}
interface Ani1 extends Ani{
	void cat();
}
interface Ai1 extends Ani{
	void cat1();
}
class Ani3 implements Ani1{
	public void dog() {
		System.out.println("dog is barking");
	}
	public void cat() {
		System.out.println("cat is meowing");
	}
}
public class Multiple {

	public static void main(String[] args) {
		Ani1 op=new Ani3();
		op.dog();
		op.cat();

	}

}
