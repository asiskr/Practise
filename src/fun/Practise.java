package fun;

// Class definition
public class Practise {

    // Static variable shared across all instances
    static String name;
    
    // Instance variable specific to each object
    int roll;

    // Instance method to display the values of name and roll
    public void show() {
        // name is static, so it's shared across all instances
        // roll is specific to the current instance (this.roll)
        System.out.println(name + " " + roll);
    }

    // Static method to display values of name and roll for a given Practise object
    public static void show1(Practise obj) {
        // Accessing the object's instance variables
        System.out.println(obj.name + " " + obj.roll + " ");
    }
}

// Main class to run the code
class Main {
    public static void main(String args[]) {
        // Creating first object of Practise class
        Practise obj = new Practise();
        // Setting static name variable and instance roll variable
        obj.name = "amrit";
        obj.roll = 45;

        // Creating second object of Practise class
        Practise obj1 = new Practise();
        // Setting static name variable and instance roll variable
        obj1.name = "sahil";
        obj1.roll = 452;

        // Displaying the values using instance methods
        obj.show();   // Output: "sahil 45"
        obj1.show();  // Output: "sahil 452"

        // Displaying the values using static method
        Practise.show1(obj1);  // Output: "sahil 452"
    }
}
