
class Shape{
	String color;
	public void area() {
		System.out.println("displays area");
	}
}

class Triangle extends Shape{
	public void area(int b, int h) {
		System.out.println(0.5* b *h);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		t1.area(2, 3);
	}

}
