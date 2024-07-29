package interfaces;

interface hello{
	public void hiii();
	int hashCode();
	String toString();
	boolean equals(Object obj);// here we can give some object otherwise it shows ad implements methods.
}
public class InterfaceWithObjectClass implements hello{
	public void hiii() {
		System.out.println("hello welcome to amzur");
	}

	public static void main(String[] args) {
		InterfaceWithObjectClass o=new InterfaceWithObjectClass();
		o.hiii();
		o.hashCode();

	}

}
