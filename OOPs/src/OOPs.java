/* Concepts Covered are:-
 Class
 Objects
 Constructors
 Comiple Time Polymorphism or Function Overloading
 'this' keyword
 Encapsulation Concept
 */
import dheyu.in.encapsulation.*;
class Pen{
	String color;
	String type;
	String brand;
	public void write() {
		System.out.println("Whataaaprooofff!!!!");
	}
}

class Student{
	String name;
	int age;
	// Concept of function Overloading or Compile Time Polymorphism
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public void printInfo(String name) {
		System.out.println(this.name);
	}
	
	public void printInfo(int age) {
		System.out.println(this.age);
	}
	
	Student(){
		// non-parameterized constructor
	}
}

public class OOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Pen pen1 = new Pen();
		pen1.type="gel";
		pen1.color="blue";
		pen1.brand="Rorito";
		pen1.write();
		*/
		
		/*
		Student s1 = new Student();
		s1.name="dheyu";
		s1.age= 22;
		s1.printInfo();
		s1.printInfo(age);
		*/
		/*
		 ENCAPSULATION
		Car car1 = new Car();
		car1.setCarColor("blue");
		car1.setCarName("BMW");
		System.out.println(car1.getCarColor());
		System.out.println(car1.getCarName());
		
		dheyu.in.encapsulation.Car car2 = new dheyu.in.encapsulation.Car();
		System.out.println(car2.getCarName());
		System.out.println(car2.getCarColor());
		*/
	}

}
