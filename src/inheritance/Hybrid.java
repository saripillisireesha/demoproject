package inheritance;
class Humanbody{
	 public void mooo() {
		System.out.println("head");
	}
}
interface male{
	void show();
}
interface female{
	void sho1();
}

public class Hybrid extends Humanbody implements male,female {
	 public void show() {
		System.out.println("bodyyyyy");
	}
	 public void sho1() {
			System.out.println("bodyyyyy");
		}
	void display() {
		System.out.println("heklllooooo");
	}

	public static void main(String[] args) {
		Hybrid o=new Hybrid();
		o.show();
		o.display();
		o.mooo();
		

	}

}
