
package javaapplication3;

public class Constructor {

    public Constructor() {
        System.out.println("No arguments constructor called");
    }

    public Constructor(int defaultValue) {
        System.out.println("Default constructor called with default value: " + defaultValue);
    }

    public Constructor(String strParam) {
        System.out.println("Parameterized constructor called with String parameter: " + strParam);
    }

    public Constructor(int intParam1, int intParam2) {
        System.out.println("Parameterized constructor called with two int parameters: " + intParam1 + ", " + intParam2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Constructor obj1 = new Constructor();  // No arguments constructor
        Constructor obj2 = new Constructor(10);  // Default constructor
        Constructor obj3 = new Constructor("Hello");  // Parameterized constructor with String parameter
        Constructor obj4 = new Constructor(5, 7);  // Parameterized constructor with two int parameters
    }
}  

