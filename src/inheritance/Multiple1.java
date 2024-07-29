package inheritance;
interface A{
	void dog();
}
class B implements A {
	 public void cat() {
		System.out.println("dog is barking");
	}

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		
	}
	}
class C extends B{
	public void snake() {
		System.out.println("dog is eating");
	}
}
public class Multiple1 {

	public static void main(String[] args) {
		C op=new C();
		op.cat();
		op.snake();

	}

}
