package interfaces;

class Lory{
	String color;
	int wheels;
	public Lory(String color, int wheels) {
		this.color=color;
		this.wheels=wheels;
	}
	public void diplay() {
		System.out.println("Lory color:"+color);
		System.out.println("wheels:"+wheels);
	}
}
class bike extends Lory{
	String brand;
	public bike(String color, int wheels, String brand) {
		super(color,wheels);
		this.brand=brand;
	}
	public void display() {
		System.out.println("Lory color:"+color);
		System.out.println("wheels:"+wheels);
		System.out.println("brand:"+brand);
	}
}
public class Toys extends bike {
	int cost;
	public Toys(String color, int wheels, String brand,int cost) {
		super(color,wheels,brand);
		this.cost=cost;
	}
	public void display() {
		System.out.println("Lory color:"+color);
		System.out.println("wheels:"+wheels);
		System.out.println("brand:"+brand);
		System.out.println("cost:"+cost);
	}
	public static void main(String[] args) {
//		Toys o=new Toys("red",8,"i don't know",500);
//		o.display();
		Lory oo=new Lory("red",8);
		oo.diplay();
	}

}
