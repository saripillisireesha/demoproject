package interfaces;

import java.util.Scanner;

interface flower{
	 void color(); 
 }
 class Rose implements flower{
	public void color() {
		 System.out.println("rose flower in red color");
	 }
 }
 class Lilly implements flower{
	public void color() {
		 System.out.println("lilly is in white color");
	 }
 }
 class Daliya implements flower{
		public void color() {
			 System.out.println("Daliya is in white color");
		 }
	 }
 class Nothing implements flower{
		public void color() {
			 System.out.println("enter flowers only in the list");
		 }
	 }

public class Dynamic  {
	
	public static void main(String[] args) {
		Dynamic o=new Dynamic();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter one flower");
		String str=sc.nextLine();
		flower oo=o.flower1(str);
oo.color();
	}
	
flower flower1(String str) {
	if(str.equals("Rose")) {
		flower ob=new Rose();
		return ob;
	}
	else if(str.equals("Lilly")) {
		flower ob=new Lilly();
		return ob;
	}
	else if(str.equals("Daliya")) {
		flower ob=new Daliya();
		return ob;
	}
	else {
		flower ob=new Nothing();
		return ob;
	}
		
	

		
	}
}
