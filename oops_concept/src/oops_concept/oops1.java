package oops_concept;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Animal{
	void eat() {
		System.out.println("Animals eat");
		
	}
	void sleep(){
		System.out.println("animals sleeps");
		
	}
}class bird extends Animal{
	void eat() {
		System.out.println("bird eat");
	}
	void sleep() {
		System.out.println("sleep");
	}
	void fly() {
		System.out.println("flying");
	}
}
public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();a.sleep();
		bird b= new bird();
		b.eat();b.sleep();b.fly();

	}

}
