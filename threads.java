

By using thread

public class Main extends Thread
{
    public void run(){
        System.out.println("Thread is running");
    }
   static class Main1 extends Thread{
         public void run(){
            System.out.println("guygygy");
        }
    }
	public static void main(String[] args) {
	Main o=new Main();
		Main1 o1=new Main1();
		o1.start();
	o.start();
	}
}



by using runnable 



public class Main implements Runnable
{
    public void run(){
        System.out.println("Thread is running");
    }
   static class Main1 implements Runnable{
         public void run(){
            System.out.println("guygygy");
        }
    }
	public static void main(String[] args) {
	Main o=new Main();
	Thread t1=new Thread(o);
		Main1 o1=new Main1();
		Thread t2=new Thread(o1);
		t2.start();
	t1.start();
	}
}








Thread(String name)




public class Main 
{
   
	public static void main(String[] args) {
	    Thread t= new Thread("hiii siri welcome");
	    t.start();
	    Thread t1=new Thread("hello ");
	    t1.start();
	    String str=t.getName();
	    String str1=t1.getName();
	    System.out.println(str);
	    System.out.println(str1);

	}
}








thread(runnable r,string name)







public class Main implements Runnable
{
    public void run(){
        System.out.println("welcome to amzur");
    }
   
	public static void main(String[] args) {
	    Runnable r=new Main();
	    Thread t=new Thread(r,"hiii Amzur");
	    t.start();
	    String str=t.getName();
	    System.out.println(str);

	}
}