package fun;

// Class to demonstrate getters and setters
public class GetterAndSetter {

	private int age;        // Private variable to store age
	private String name;    // Private variable to store name

	// Setter method for age with two parameters
	// However, only the 'age' parameter is being used to set the class variable
	public void setAge(int a, int age) {
//		age = a; // This line is commented out; it would set the parameter 'age' to the value of 'a'
		this.age = age; // Correctly sets the instance variable 'age' using the parameter 'age'
	}

	// Setter method for name with two parameters
	// Only the 'name' parameter is used to set the class variable
	public void setName(String n, String name) {
//		name = n; // This line is commented out; it would set the parameter 'name' to the value of 'n'
		this.name = name; // Correctly sets the instance variable 'name' using the parameter 'name'
	}

	// Getter method for age
	public int getAge() {
		return age; // Returns the value of the instance variable 'age'
	}

	// Getter method for name
	public String getName() {
		return name; // Returns the value of the instance variable 'name'
	}
}

// Demo class with the main method to test the GetterAndSetter class
class Demo {

	public static void main(String args[]) {
		GetterAndSetter obj = new GetterAndSetter(); // Creating an object of GetterAndSetter
		
		// Setting age and name using the setter methods
		obj.setAge(45, 787); // The second parameter '787' will be used to set the age
		obj.setName("aman", " komal"); // The second parameter " komal" will be used to set the name
		
		// Printing the age and name using the getter methods
		System.out.println(obj.getAge() + " : " + obj.getName() + " "); 
	}
}
