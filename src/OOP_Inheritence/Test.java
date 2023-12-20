package OOP_Inheritence;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.autoGear();
		a.designLook();
		
	// top casting :
	// creating child object with parent reference is called top casting
		Car c1 = new Audi();
		c1.start();
		c1.stop();
		c1.refuel();
		
	// Down casting :
	// creating parent object with child reference is called down casting
		
		Audi a1 = (Audi)new Car();//During Down casting object is shown correct till compile time , but it 
		//will rise the class cast exception at run time
	//Due down casting and calling the methods it will show class cast exception	
		a1.start();
		
		
	/*Polymorphism-poly(many) + morphism(forms)
	 * Method overloaing - compile time polymorphism
	 * it is done with in the class 
	 * Method overriding - run time polymorphism
	 * it can processed when parent and child class are available
	 * 
	 * 
	 * 	
	 */
		
}
}
