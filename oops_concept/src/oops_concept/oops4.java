package oops_concept;

public class oops4 {
	
	    public static void main(String[] args) {
	        Shape c = new Circle();
	        Shape t = new Triangle();
	        Shape s = new Square();

	        c.draw();
	        c.erase();

	        t.draw();
	        t.erase();

	        s.draw();
	        s.erase();
	    }
	}

	// Parent class
	class Shape {
	    void draw() {
	        System.out.println("Drawing Shape");
	    }

	    void erase() {
	        System.out.println("Erasing Shape");
	    }
	}

	// Circle class
	class Circle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing Circle");
	    }

	    @Override
	    void erase() {
	        System.out.println("Erasing Circle");
	    }
	}

	// Triangle class
	class Triangle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing Triangle");
	    }

	    @Override
	    void erase() {
	        System.out.println("Erasing Triangle");
	    }
	}

	// Square class
	class Square extends Shape {
	    @Override
	    void draw() {
	        System.out.println("Drawing Square");
	    }

	    @Override
	    void erase() {
	        System.out.println("Erasing Square");
	    }
	}


